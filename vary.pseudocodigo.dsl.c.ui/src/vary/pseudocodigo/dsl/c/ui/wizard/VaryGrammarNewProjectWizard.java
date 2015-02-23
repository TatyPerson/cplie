package vary.pseudocodigo.dsl.c.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import vary.pseudocodigo.dsl.c.generator.util.TipoProyecto;

import com.google.inject.Inject;

public class VaryGrammarNewProjectWizard extends org.eclipse.xtext.ui.wizard.XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;
	private VaryGrammarWizardSelectionPage selectionPage;

	@Inject
	public VaryGrammarNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New VaryGrammar Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("VaryGrammar Project");
		mainPage.setDescription("Create a new VaryGrammar project.");
		addPage(mainPage);
		selectionPage = new VaryGrammarWizardSelectionPage("selectNewProjectPage");
		selectionPage.setPreviousPage(mainPage);
		selectionPage.setTitle("Vary C/C++ Project: Generate .h file");
		selectionPage.setDescription("Do you want to generate the .h file?");
		addPage(selectionPage);
	}
	
	@Override
	protected void doFinish(final IProjectInfo projectInfo, final IProgressMonitor monitor) {
		TipoProyecto.setTipoProyecto(selectionPage.getSelectedNode().getName());
		super.doFinish(projectInfo, monitor);

	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		vary.pseudocodigo.dsl.c.ui.wizard.VaryGrammarProjectInfo projectInfo = new vary.pseudocodigo.dsl.c.ui.wizard.VaryGrammarProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

}
