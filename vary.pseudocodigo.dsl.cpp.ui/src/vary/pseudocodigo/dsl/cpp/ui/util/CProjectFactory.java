package vary.pseudocodigo.dsl.cpp.ui.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.model.CModelException;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.core.model.IIncludeEntry;
import org.eclipse.cdt.core.model.IOutputEntry;
import org.eclipse.cdt.core.model.IPathEntry;
import org.eclipse.cdt.core.model.ISourceEntry;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.extension.CConfigurationData;
import org.eclipse.cdt.make.core.MakeBuilder;
import org.eclipse.cdt.managedbuilder.core.IBuilder;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkingSet;
import org.osgi.framework.Bundle;

import com.google.common.base.Charsets;

import vary.pseudocodigo.dsl.cpp.generator.util.TipoProyecto;
import vary.pseudocodigo.dsl.cpp.ui.internal.VaryGrammarActivator;
import vary.pseudocodigo.dsl.cpp.ui.util.libreriasCDT.ClassToUri;
public class CProjectFactory extends ProjectFactory {
	
	private static final Logger logger = Logger.getLogger(CProjectFactory.class);

	@Override
	protected void enhanceProject(IProject project, SubMonitor monitor, Shell shell) throws CoreException, CModelException {
		super.enhanceProject(project, monitor, shell);
		if(builderIds.contains(MakeBuilder.BUILDER_ID)) {
			//Contruimos un proyecto C++
			
			SubMonitor subMonitor = SubMonitor.convert(monitor, 10);
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
		    bld.setManagedBuildOn(false);
		    CConfigurationData data = config.getConfigurationData();
		    cdesc.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, data);
		    manager.setProjectDescription(project, cdesc);
		    
		    
		    //Añadimos las librerias al directorio .libraries del proyecto
		    	
		    try {
				addLibraryHidden(project,monitor,"cmath.h");
				addLibraryHidden(project,monitor,"cstdio.h");
				addLibraryHidden(project,monitor,"cstdlib.h");
				addLibraryHidden(project,monitor,"cstring.h");
				addLibraryHidden(project,monitor,"iostream.h");
				addLibraryHidden(project,monitor,"istream.h");
				addLibraryHidden(project,monitor,"string.h");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		    
		    //Preparamos los directorios (source e include)
		    
		    ICProject cProject = CoreModel.getDefault().create(project);
		    IPathEntry[] entries = cProject.getRawPathEntries();
		    List<IPathEntry> newEntries = new ArrayList<IPathEntry>(Arrays.asList(entries));
		    
		    ISourceEntry sourceEntry = CoreModel.newSourceEntry(project.getFullPath().append("src-gen"));
		    IOutputEntry outputEntry = CoreModel.newOutputEntry(project.getFullPath().append("src"));
			IIncludeEntry incEntry = CoreModel.newIncludeEntry(project.getFullPath(), null, project.getLocation().append(".libraries"));
			
		    newEntries.add(incEntry); 
		    newEntries.add(sourceEntry);
		    newEntries.add(outputEntry);
		    
		    CoreModel.setRawPathEntries(cProject, (IPathEntry[]) newEntries.toArray(new IPathEntry[newEntries.size()]), null);
		    CoreModel.validatePathEntry(cProject, incEntry, true, true); 
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
