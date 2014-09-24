package org.xtext.example.mydsl.ui.wizard;

import java.util.List;

import org.eclipse.cdt.core.CCProjectNature;
import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class MyDslProjectCreator extends org.eclipse.xtext.ui.wizard.AbstractPluginProjectCreator {

	protected static final String DSL_GENERATOR_PROJECT_NAME = "pseudocodigoDSL";

	protected static final String SRC_ROOT = "src";
	protected static final String SRC_GEN_ROOT = "src-gen";
	protected static final String SRC_LIBRARY = "Includes";
	protected final List<String> SRC_FOLDER_LIST = ImmutableList.of(SRC_ROOT, SRC_GEN_ROOT, SRC_LIBRARY);
	protected static final String type = "ProjectC";

	@Override
	protected MyDslProjectInfo getProjectInfo() {
		return (MyDslProjectInfo) super.getProjectInfo();
	}
	
	protected String getProjectType() {
		return type;
	}
	
	protected String getModelFolderName() {
		return SRC_ROOT;
	}
	
	@Override
	protected List<String> getAllFolders() {
        return SRC_FOLDER_LIST;
    }

    @Override
	protected List<String> getRequiredBundles() {
		List<String> result = Lists.newArrayList(super.getRequiredBundles());
		result.add(DSL_GENERATOR_PROJECT_NAME);
		return result;
	}
    
    protected String[] getProjectNatures() {
        return new String[] {
        	//CProjectNature.C_NATURE_ID,
        	CCProjectNature.CC_NATURE_ID,
    		"org.eclipse.cdt.managedbuilder.core.managedBuildNature",
    		"org.eclipse.cdt.managedbuilder.core.ScannerConfigNature",
			"org.eclipse.pde.PluginNature", //$NON-NLS-1$
			JavaCore.NATURE_ID,
			XtextProjectHelper.NATURE_ID
			
		};
    }
    
    protected String[] getBuilders() {
    	return new String[]{
    		JavaCore.BUILDER_ID,
    		"org.eclipse.cdt.managedbuilder.core.genmakebuilder",
    		"org.eclipse.cdt.managedbuilder.core.ScannerConfigBuilder",
			"org.eclipse.pde.ManifestBuilder",  //$NON-NLS-1$
			"org.eclipse.pde.SchemaBuilder", //$NON-NLS-1$
			XtextProjectHelper.BUILDER_ID
		};
	}

	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("UTF-8");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate("org::xtext::example::mydsl::ui::wizard::MyDslNewProject::main", getProjectInfo());

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

}