package org.xtext.example.mydsl.ui.wizard;

import java.util.List;

import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.util.ProjectFactory;
import org.eclipse.xtext.ui.wizard.AbstractProjectCreator;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.cdt.core.CProjectNature;

public class ProjectCreator extends AbstractProjectCreator {

	@Override
	protected ProjectFactory createProjectFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getModelFolderName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected List<String> getAllFolders() {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected String[] getProjectNatures() {
        return new String[] {
        	JavaCore.NATURE_ID,
        	CProjectNature.C_NATURE_ID,
			"org.eclipse.pde.PluginNature", //$NON-NLS-1$
			XtextProjectHelper.NATURE_ID
		};
    }

}
