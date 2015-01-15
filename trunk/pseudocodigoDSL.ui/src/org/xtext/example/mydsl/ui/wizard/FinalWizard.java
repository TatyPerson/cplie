package org.xtext.example.mydsl.ui.wizard;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class FinalWizard extends Wizard{

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
    public void addPages() {
        WizardPage wizard = new WizardNewProjectCreationPage("basicNewProjectPage");
		wizard.setTitle("Create Project");
		wizard.setDescription("Enter a name for the project.");
		wizard.setPageComplete(true);
        addPage(wizard);
    }

}
