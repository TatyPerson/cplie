package vary.pseudocodigo.dsl.cpp.ui.util;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.cdt.build.core.scannerconfig.ScannerConfigNature;
import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.model.CModelException;
import org.eclipse.cdt.make.core.MakeBuilder;
import org.eclipse.cdt.make.core.MakeProjectNature;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkingSet;
import vary.pseudocodigo.dsl.cpp.generator.util.TipoProyecto;
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
			project = CCorePlugin.getDefault().createCDTProject(project.getDescription(), project, monitor);
			MakeProjectNature.addNature(project, new SubProgressMonitor(monitor, 1));
			ScannerConfigNature.addScannerConfigNature(project);
		}
		createFile(".varyproject", project, "ficheroCabeceras="+TipoProyecto.getTipoProyecto(), monitor);
	}
	
	protected void addMoreClasspathEntriesTo(List<IClasspathEntry> classpathEntries) {
	}

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
