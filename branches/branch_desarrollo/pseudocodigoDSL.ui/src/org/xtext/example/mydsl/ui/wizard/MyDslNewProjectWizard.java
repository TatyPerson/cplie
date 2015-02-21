package org.xtext.example.mydsl.ui.wizard;

import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

import com.google.inject.Inject;

public class MyDslNewProjectWizard extends org.eclipse.xtext.ui.wizard.XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;
	private MyWizardSelectionPage selectionPage;

	@Inject
	public MyDslNewProjectWizard(MyDslProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New GenCodeDSL C/C++ Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("Create Project");
		mainPage.setDescription("Enter a name for the project.");
		mainPage.setPageComplete(true);
		addPage(mainPage);
		selectionPage = new MyWizardSelectionPage("selectNewProjectPage");
		selectionPage.setPreviousPage(mainPage);
		selectionPage.setTitle("GenCodeDSL C/C++ Project: Selecting language");
		selectionPage.setDescription("Select the language to generate");
		addPage(selectionPage);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		org.xtext.example.mydsl.ui.wizard.MyDslProjectInfo projectInfo = new org.xtext.example.mydsl.ui.wizard.MyDslProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

}
