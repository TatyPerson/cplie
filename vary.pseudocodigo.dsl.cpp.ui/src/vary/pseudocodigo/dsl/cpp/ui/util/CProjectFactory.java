package vary.pseudocodigo.dsl.cpp.ui.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.core.language.settings.providers.ILanguageSettingsEditableProvider;
import org.eclipse.cdt.core.language.settings.providers.ILanguageSettingsProvider;
import org.eclipse.cdt.core.language.settings.providers.ILanguageSettingsProvidersKeeper;
import org.eclipse.cdt.core.language.settings.providers.LanguageSettingsManager;
import org.eclipse.cdt.core.model.CModelException;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.core.model.IIncludeEntry;
import org.eclipse.cdt.core.model.IOutputEntry;
import org.eclipse.cdt.core.model.IPathEntry;
import org.eclipse.cdt.core.model.ISourceEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.extension.CConfigurationData;
import org.eclipse.cdt.make.core.IMakeTarget;
import org.eclipse.cdt.make.core.IMakeTargetManager;
import org.eclipse.cdt.make.core.MakeBuilder;
import org.eclipse.cdt.make.core.MakeCorePlugin;
import org.eclipse.cdt.make.internal.core.MakeTargetManager;
import org.eclipse.cdt.managedbuilder.core.BuildException;
import org.eclipse.cdt.managedbuilder.core.IBuilder;
import org.eclipse.cdt.managedbuilder.core.IConfiguration;
import org.eclipse.cdt.managedbuilder.core.IProjectType;
import org.eclipse.cdt.managedbuilder.core.IToolChain;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedBuildInfo;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;
import org.eclipse.cdt.managedbuilder.language.settings.providers.AbstractBuildCommandParser;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkingSet;

import vary.pseudocodigo.dsl.cpp.generator.ProjectLocationFolder;
import vary.pseudocodigo.dsl.cpp.generator.util.TipoProyecto;


@SuppressWarnings("restriction")
public class CProjectFactory extends ProjectFactory {
	
	private static final Logger logger = Logger.getLogger(CProjectFactory.class);

	@Override
	protected void enhanceProject(IProject project, SubMonitor monitor, Shell shell) throws CoreException, CModelException {
		super.enhanceProject(project, monitor, shell);
		if(builderIds.contains(MakeBuilder.BUILDER_ID)) {
			//Contruimos un proyecto C++
			
			System.out.println("La FullPath del proyecto es:"+project.getLocation());
			ProjectLocationFolder.setPath(project.getLocation().toString());
			
			CProjectNature.addCNature(project, monitor);
			ICProjectDescriptionManager mgr = CoreModel.getDefault().getProjectDescriptionManager();
			ICProjectDescription des = mgr.getProjectDescription(project, true);

			if (des != null)
			        return; // C project description already exists

			des = mgr.createProjectDescription(project, true);

			ManagedBuildInfo info = ManagedBuildManager.createBuildInfo(project);
			IProjectType projType = null;
			IToolChain toolChain = null;
			
			if(Platform.getOS().equals(Platform.OS_MACOSX)) {
				projType =
				         ManagedBuildManager.getExtensionProjectType("cdt.managedbuild.target.macosx.exe"); 
				toolChain =
				         ManagedBuildManager.getExtensionToolChain("cdt.managedbuild.toolchain.gnu.macosx.exe.release");
				ProjectLocationFolder.setOS("MACOSX");
			}
			else if(Platform.getOS().equals(Platform.OS_WIN32)) {
				projType =
				         ManagedBuildManager.getExtensionProjectType("cdt.managedbuild.target.gnu.cygwin.exe"); 
				toolChain =
				         ManagedBuildManager.getExtensionToolChain("cdt.managedbuild.toolchain.gnu.cygwin.exe.release");
				ProjectLocationFolder.setOS("WIN32");
			}
			else if(Platform.getOS().equals(Platform.OS_LINUX)) {
				projType =
				         ManagedBuildManager.getExtensionProjectType("cdt.managedbuild.target.gnu.exe"); 
				toolChain =
				         ManagedBuildManager.getExtensionToolChain("cdt.managedbuild.toolchain.gnu.exe.release");
				ProjectLocationFolder.setOS("LINUX");
			}
			else {
				System.out.println("Otro SO");
			}
			
			logger.error(ProjectLocationFolder.getPath() + "\\");

			ManagedProject mProj = new ManagedProject(project, projType);
			info.setManagedProject(mProj);

			IConfiguration[] configs = ManagedBuildManager.getExtensionConfigurations(toolChain, projType);

			for (IConfiguration icf : configs) {
			    if (!(icf instanceof Configuration)) {
			        continue;
			    }
			    Configuration cf = (Configuration) icf;

			    String id = ManagedBuildManager.calculateChildId(cf.getId(), null);
			    Configuration config = new Configuration(mProj, cf, id, false, true);

			    ICConfigurationDescription cfgDes =
			    des.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID,
			                                         config.getConfigurationData());
			    config.setConfigurationDescription(cfgDes);
			    config.exportArtifactInfo();

			    IBuilder bld = config.getEditableBuilder();
			    if (bld != null) { bld.setManagedBuildOn(true); }

			    config.setName(toolChain.getName());
			    config.setArtifactName(project.getName());

			}

			mgr.setProjectDescription(project, des);
			
			//Mi_Creador
			
			/*SubMonitor subMonitor = SubMonitor.convert(monitor, 10);
			System.out.println("Voy a construir un proyecto C++");
			subMonitor.subTask("Configure C project"  + projectName);
			//project = CCorePlugin.getDefault().createCDTProject(project.getDescription(), project, monitor);
			//MakeProjectNature.addNature(project, new SubProgressMonitor(monitor, 1));
			//ScannerConfigNature.addScannerConfigNature(project);
			IProjectDescription descripcion = workspace.newProjectDescription(projectName);
			project = CCorePlugin.getDefault().createCDTProject(descripcion, project, null);
		    ICProjectDescriptionManager manager = CoreModel.getDefault().getProjectDescriptionManager();
		    ICProjectDescription cdesc = manager.createProjectDescription(project, false);
			ManagedProject mproject = new ManagedProject(cdesc);
		    Configuration config = new Configuration(mproject, null, "Default", "Default");
		    IBuilder bld = config.getEditableBuilder();
		    bld.setManagedBuildOn(true);
		    ManagedBuildManager.saveBuildInfo(project, true);
		    CConfigurationData data = config.getConfigurationData();
		    cdesc.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, data);
		    manager.setProjectDescription(project, cdesc);*/
		    
		    //Fin_creador
		    
		    
		    //Añadimos las librerias al directorio .libraries del proyecto
		    	
		    try {
				readFileProperties(project, monitor, "librerias.properties");
			} catch (IOException | URISyntaxException e) {
				e.printStackTrace();
			}
		    
		    //Preparamos los directorios (source e include)
		    
		    /*ICProject cProject = CoreModel.getDefault().create(project);
		    IPathEntry[] entries = cProject.getRawPathEntries();
		    List<IPathEntry> newEntries = new ArrayList<IPathEntry>(Arrays.asList(entries));
		    
		    ISourceEntry sourceEntry = CoreModel.newSourceEntry(project.getFullPath().append("src-gen"));
		    IOutputEntry outputEntryDebug = CoreModel.newOutputEntry(project.getFullPath().append("Debug"));
		    IOutputEntry outputEntryDebugSrc = CoreModel.newOutputEntry(project.getFullPath().append("Debug/src"));
			IIncludeEntry incEntry = CoreModel.newIncludeEntry(project.getFullPath(), null, project.getLocation().append(".libraries"));
			
		    newEntries.add(incEntry); 
		    newEntries.add(sourceEntry);
		    newEntries.add(outputEntryDebug);
		    newEntries.add(outputEntryDebugSrc);
		    
		    CoreModel.setRawPathEntries(cProject, (IPathEntry[]) newEntries.toArray(new IPathEntry[newEntries.size()]), null);
		    CoreModel.validatePathEntry(cProject, incEntry, true, true);*/
		    
		    ICProject cProject = CoreModel.getDefault().create(project);
		    IPathEntry[] entries = cProject.getRawPathEntries();
		    List<IPathEntry> newEntries = new ArrayList<IPathEntry>(Arrays.asList(entries));
		    ISourceEntry sourceEntry = CoreModel.newSourceEntry(project.getFullPath().append("src-gen"));
		    newEntries.add(sourceEntry);
		    CoreModel.setRawPathEntries(cProject, (IPathEntry[]) newEntries.toArray(new IPathEntry[newEntries.size()]), null);
		    
		    //Añadimos los ficheros Makefile
		    /*try {
				addMakefiles(project, monitor, "makefile");
				addMakefiles(project, monitor, "objects.mk");
				addMakefiles(project, monitor, "sources.mk");
				addMakefiles(project, monitor, "subdir.mk");
			} catch (IOException e) {
				e.printStackTrace();
			}/*
		    
		    //Configuramos el debug
		    
		    /* MakeTargetManager tgtManager = (MakeTargetManager) MakeCorePlugin.getDefault().getTargetManager();

		    tgtManager.startup();

		    IMakeTarget tgt = (IMakeTarget) tgtManager.createTarget(project, "VaryTargetCDT","org.eclipse.cdt.make.MakeTargetBuilder"); 

		    tgt.setUseDefaultBuildCmd(true);
		    tgt.setRunAllBuilders(true);
		    tgt.setAppendEnvironment(true);
		    tgt.setAppendProjectEnvironment(true); 

		    tgt.setBuildAttribute(IMakeTarget.BUILD_LOCATION, "Debug/");
		    tgt.setBuildAttribute(IMakeTarget.BUILD_TARGET, "src-gen/");
		    tgt.setBuildAttribute(IMakeTarget.BUILD_COMMAND, "make all");

		    tgtManager.addTarget(tgt);

		    tgtManager.shutdown(); */
		    
		    /*ICProjectDescription prjDescription = CoreModel.getDefault().getProjectDescription(project, true);
			ICConfigurationDescription[] cfgDescriptions = prjDescription.getConfigurations();
			for (ICConfigurationDescription cfgDescription : cfgDescriptions) {

				String[] defaultIds = ((ILanguageSettingsProvidersKeeper) cfgDescription).getDefaultLanguageSettingsProvidersIds();
				String[] defaultIds2 = new String[defaultIds.length];
				List<ILanguageSettingsProvider> providers = ((ILanguageSettingsProvidersKeeper) cfgDescription).getLanguageSettingProviders();
				List<ILanguageSettingsProvider> providers2 = new ArrayList<ILanguageSettingsProvider>();
				for (int i = 0; i < defaultIds.length; i++) {
					if( providers.get(i).getId().equals("org.eclipse.cdt.managedbuilder.core.GCCBuildCommandParser") ) {
						ILanguageSettingsProvider gccbop = LanguageSettingsManager.getWorkspaceProvider("org.eclipse.cdt.managedbuilder.core.GCCBuildCommandParser");
						ILanguageSettingsProvider rawProvider = LanguageSettingsManager.getRawProvider(gccbop);
						ILanguageSettingsEditableProvider newProvider = LanguageSettingsManager.getProviderCopy((ILanguageSettingsEditableProvider)rawProvider, true);

						// FIXME this API is not considered stable yet
						AbstractBuildCommandParser selectedProvider = (AbstractBuildCommandParser) newProvider;
						selectedProvider.setCompilerPattern(selectedProvider.getCompilerPattern()+"|(/acc/sys/L865/cdk/g\\+\\+)");			
						selectedProvider.setResourceScope(AbstractBuildCommandParser.ResourceScope.FILE);
						//providers.remove(i);
						providers2.add(selectedProvider);
						//defaultIds2[i]=providers.get(i).getId();
					} else {
						providers2.add(providers.get(i));
						defaultIds2[i]=defaultIds[i];
					}
				}
				// remove the default id from the list
				((ILanguageSettingsProvidersKeeper) cfgDescription).setDefaultLanguageSettingsProvidersIds(defaultIds2);
				
				// set the adapted list of providers
				((ILanguageSettingsProvidersKeeper) cfgDescription).setLanguageSettingProviders(providers2);
				
			}
			// persist changes
			try {
				CoreModel.getDefault().setProjectDescription(project, prjDescription);
			} catch (CoreException e) {
				logger.error(e.getMessage());
			}*/
		    
		    IConfiguration activeConfig = ManagedBuildManager.getBuildInfo(project).getDefaultConfiguration();
		    try {
				activeConfig.setManagedBuildOn(true);
			} catch (BuildException e1) {
				e1.printStackTrace();
			} 
		    ManagedBuildManager.saveBuildInfo(project, true);
		    
		    InputStream is = this.getClass().getResourceAsStream("/.cproject");
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String content = null; 
			String contentFinal = null;
			
			try {
				while ((content = br.readLine()) != null) {
					if(contentFinal != null)
						contentFinal = contentFinal + "\n" + content;
					else 
						contentFinal = content;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//createFile(".cproject", project, contentFinal, monitor);
		    
		    
		    monitor.worked(1);
		}
		createFile(".varyproject", project, "ficheroCabeceras="+TipoProyecto.getTipoProyecto(), monitor);
	}
	
	
	protected void addLibraryHidden(IProject project, SubMonitor monitor, String nombreLibreria) throws IOException, URISyntaxException {		
		InputStream is = this.getClass().getResourceAsStream("/"+nombreLibreria);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String content = null; 
		String contentFinal = null;
		
		while ((content = br.readLine()) != null) {
			if(contentFinal != null)
				contentFinal = contentFinal + "\n" + content;
			else 
				contentFinal = content;
		}
		br.close();
		createFile(".libraries/"+ nombreLibreria, project, contentFinal, monitor);
 	}
	
	protected void addMakefiles(IProject project, SubMonitor monitor, String nombreMakefile) throws IOException {
		InputStream is = this.getClass().getResourceAsStream("/"+nombreMakefile);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String content = null; 
		String contentFinal = null;
		
		while ((content = br.readLine()) != null) {
			if(contentFinal != null)
				contentFinal = contentFinal + "\n" + content;
			else 
				contentFinal = content;
		}
		br.close();
		
		if(nombreMakefile.equals("subdir.mk")) {
			createFile("Debug/src-gen/"+ nombreMakefile, project, contentFinal, monitor);
		}
		else {
			createFile("Debug/"+ nombreMakefile, project, contentFinal, monitor);
		}
		
	}
	
	protected void readFileProperties(IProject project, SubMonitor monitor, String nameResource) throws IOException, URISyntaxException {
		InputStream is = this.getClass().getResourceAsStream("/"+nameResource);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String content = null;
		
		while ((content = br.readLine()) != null) {
			addLibraryHidden(project,monitor, content);
		}
		br.close();
	}
	
	protected void addMoreClasspathEntriesTo(List<IClasspathEntry> classpathEntries) {}

	@Override
	public CProjectFactory addBuilderIds(String... builderIds) {
		return (CProjectFactory) super.addBuilderIds(builderIds);
	}

	@Override
	public CProjectFactory addFolders(List<String> folders) {
		return (CProjectFactory) super.addFolders(folders);
	}

	@Override
	public CProjectFactory setProjectName(String projectName) {
		return (CProjectFactory) super.setProjectName(projectName);
	}

	@Override
	public CProjectFactory addProjectNatures(String... projectNatures) {
		return (CProjectFactory) super.addProjectNatures(projectNatures);
	}
	
	@Override
	public CProjectFactory addReferencedProjects(List<IProject> referencedProjects) {
		return (CProjectFactory) super.addReferencedProjects(referencedProjects);
	}

	@Override
	public CProjectFactory setLocation(IPath location) {
		return (CProjectFactory) super.setLocation(location);
	}
	
	@Override
	public CProjectFactory addWorkingSets(List<IWorkingSet> workingSets) {
		return (CProjectFactory) super.addWorkingSets(workingSets);
	}
	
}
