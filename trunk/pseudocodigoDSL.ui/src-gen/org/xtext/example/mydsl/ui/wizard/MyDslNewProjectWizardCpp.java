package org.xtext.example.mydsl.ui.wizard;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

import com.google.inject.Inject;

public class MyDslNewProjectWizardCpp extends org.eclipse.xtext.ui.wizard.XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	@Inject
	public MyDslNewProjectWizardCpp(MyDslProjectCreatorCpp projectCreator) {
		super(projectCreator);
		setWindowTitle("New GenCodeDSL C++ Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("GenCodeDSL C++ Project");
		mainPage.setDescription("Create a new GenCodeDSL C++ project.");
		addPage(mainPage);
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
