/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subproceso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Subproceso#getParametrofuncion <em>Parametrofuncion</em>}</li>
 *   <li>{@link diagramapseudocodigo.Subproceso#getSentencias <em>Sentencias</em>}</li>
 *   <li>{@link diagramapseudocodigo.Subproceso#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.Subproceso#getDeclaracionvariable <em>Declaracionvariable</em>}</li>
 *   <li>{@link diagramapseudocodigo.Subproceso#getDeclaracionpropia <em>Declaracionpropia</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubproceso()
 * @model abstract="true"
 * @generated
 */
public interface Subproceso extends EObject {
	/**
	 * Returns the value of the '<em><b>Parametrofuncion</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.ParametroFuncion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametrofuncion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametrofuncion</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubproceso_Parametrofuncion()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParametroFuncion> getParametrofuncion();

	/**
	 * Returns the value of the '<em><b>Sentencias</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Sentencias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentencias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentencias</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubproceso_Sentencias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencias> getSentencias();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubproceso_Nombre()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Subproceso#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Declaracionvariable</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.DeclaracionVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaracionvariable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaracionvariable</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubproceso_Declaracionvariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaracionVariable> getDeclaracionvariable();

	/**
	 * Returns the value of the '<em><b>Declaracionpropia</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.DeclaracionPropia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaracionpropia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaracionpropia</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getSubproceso_Declaracionpropia()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaracionPropia> getDeclaracionpropia();

} // Subproceso
