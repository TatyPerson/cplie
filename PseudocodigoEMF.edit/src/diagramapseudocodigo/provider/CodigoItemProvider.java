/**
 */
package diagramapseudocodigo.provider;


import diagramapseudocodigo.Codigo;
import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link diagramapseudocodigo.Codigo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CodigoItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodigoItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNombrePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Codigo_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Codigo_nombre_feature", "_UI_Codigo_type"),
				 DiagramapseudocodigoPackage.Literals.CODIGO__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.CODIGO__TIENE);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.CODIGO__FUNCION);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.CODIGO__CONSTANTES);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.CODIGO__COMENTARIOS);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.CODIGO__GLOBAL);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Codigo.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Codigo"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Codigo)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Codigo_type") :
			getString("_UI_Codigo_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Codigo.class)) {
			case DiagramapseudocodigoPackage.CODIGO__NOMBRE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DiagramapseudocodigoPackage.CODIGO__TIENE:
			case DiagramapseudocodigoPackage.CODIGO__FUNCION:
			case DiagramapseudocodigoPackage.CODIGO__CONSTANTES:
			case DiagramapseudocodigoPackage.CODIGO__TIPOCOMPLEJO:
			case DiagramapseudocodigoPackage.CODIGO__COMENTARIOS:
			case DiagramapseudocodigoPackage.CODIGO__GLOBAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__TIENE,
				 DiagramapseudocodigoFactory.eINSTANCE.createInicio()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__FUNCION,
				 DiagramapseudocodigoFactory.eINSTANCE.createFuncion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__FUNCION,
				 DiagramapseudocodigoFactory.eINSTANCE.createProcedimiento()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__CONSTANTES,
				 DiagramapseudocodigoFactory.eINSTANCE.createConstantes()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createTipoComplejo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createVector()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createMatriz()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createRegistro()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createArchivo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createEnumerado()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createSubrango()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createSubrangoNumerico()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__TIPOCOMPLEJO,
				 DiagramapseudocodigoFactory.eINSTANCE.createSubrangoEnumerado()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__COMENTARIOS,
				 DiagramapseudocodigoFactory.eINSTANCE.createComentario()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__GLOBAL,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__GLOBAL,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.CODIGO__GLOBAL,
				 DiagramapseudocodigoFactory.eINSTANCE.createDeclaracionPropia()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DiagramaPseudocodigoEditPlugin.INSTANCE;
	}

}
