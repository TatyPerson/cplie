/**
 */
package diagramapseudocodigo.provider;


import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Subrango;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link diagramapseudocodigo.Subrango} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubrangoItemProvider
	extends TipoComplejoItemProvider
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
	public SubrangoItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Subrango_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subrango_nombre_feature", "_UI_Subrango_type"),
				 DiagramapseudocodigoPackage.Literals.SUBRANGO__NOMBRE,
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
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF);
			childrenFeatures.add(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP);
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
	 * This returns Subrango.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Subrango"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Subrango)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Subrango_type") :
			getString("_UI_Subrango_type") + " " + label;
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

		switch (notification.getFeatureID(Subrango.class)) {
			case DiagramapseudocodigoPackage.SUBRANGO__NOMBRE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_INF:
			case DiagramapseudocodigoPackage.SUBRANGO__LIMITE_SUP:
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
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createLlamadaFuncion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createVariableID()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createConstCadena()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createNumeroEntero()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createNumeroDecimal()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createoperacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorBooleano()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createCaracter()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createInternas()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorComplejo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorRegistro()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorVector()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorMatriz()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createSuma()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createResta()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createMultiplicacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createComparacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF,
				 DiagramapseudocodigoFactory.eINSTANCE.createIgualdad()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createLlamadaFuncion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createVariableID()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createConstCadena()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createNumeroEntero()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createNumeroDecimal()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createoperacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorBooleano()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createCaracter()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createInternas()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorComplejo()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorRegistro()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorVector()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createValorMatriz()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createSuma()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createResta()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createMultiplicacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createDivision()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createComparacion()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP,
				 DiagramapseudocodigoFactory.eINSTANCE.createIgualdad()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_INF ||
			childFeature == DiagramapseudocodigoPackage.Literals.SUBRANGO__LIMITE_SUP;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
