package org.xtext.example.mydsl.ui.wizard;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class MyWizardSelectionPage extends WizardSelectionPage {
	
	SomeWizardNode selectedWizardNode;

	protected MyWizardSelectionPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		Composite composite = new Composite(parent, SWT.NONE);
		// Name, you can create your form like normally
        //Label l = new Label(composite, SWT.NONE);
        //l.setText("Project name");
        //new Text(composite, SWT.BORDER);
        
        // Project type
        Label l = new Label(composite, SWT.NONE);
        l.setText("Project type");
        //new Text(composite, SWT.BORDER);
        
        TableViewer projectType = new TableViewer(composite);
        projectType.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
        projectType.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                ISelection selection = event.getSelection();
                if(!selection.isEmpty() && selection instanceof IStructuredSelection) {
                    Object o = ((IStructuredSelection) selection).getFirstElement();
                    if(o instanceof SomeWizardNode) {
                        // Now we set our selected node, which toggles the next button
                        selectedWizardNode = (SomeWizardNode) o;
                        setTitle(selectedWizardNode.getName());
                        setSelectedNode(selectedWizardNode);
                        setPageComplete(true);
                    }
                }
            }
        });
        projectType.setContentProvider(new ArrayContentProvider());
        projectType.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if(element instanceof SomeWizardNode) {
                    return ((SomeWizardNode) element).getName();
                }
                return super.getText(element);
            }
        });
        SomeWizardNode[] wizardNodes = new SomeWizardNode[]{
            new SomeWizardNode("C Project"),
            new SomeWizardNode("C++ Project"),
        };
        projectType.setInput(wizardNodes);
        
        GridLayoutFactory.swtDefaults().numColumns(2).generateLayout(composite);
        
        setControl(composite);
    }

}
