/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inicio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Inicio#getTiene <em>Tiene</em>}</li>
 *   <li>{@link diagramapseudocodigo.Inicio#getDeclaracionvariable <em>Declaracionvariable</em>}</li>
 *   <li>{@link diagramapseudocodigo.Inicio#getDeclaracionpropia <em>Declaracionpropia</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInicio()
 * @model
 * @generated
 */
public interface Inicio extends EObject {
	/**
	 * Returns the value of the '<em><b>Tiene</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.Sentencias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInicio_Tiene()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencias> getTiene();

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInicio_Declaracionvariable()
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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getInicio_Declaracionpropia()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaracionPropia> getDeclaracionpropia();

} // Inicio
