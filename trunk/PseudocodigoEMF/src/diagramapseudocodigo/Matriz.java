/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matriz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.Matriz#getTipoInterno <em>Tipo Interno</em>}</li>
 *   <li>{@link diagramapseudocodigo.Matriz#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramapseudocodigo.Matriz#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz()
 * @model
 * @generated
 */
public interface Matriz extends TipoComplejo {
	/**
	 * Returns the value of the '<em><b>Tipo Interno</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.TipoVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Interno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Interno</em>' attribute.
	 * @see diagramapseudocodigo.TipoVariable
	 * @see #setTipoInterno(TipoVariable)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz_TipoInterno()
	 * @model required="true"
	 * @generated
	 */
	TipoVariable getTipoInterno();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Matriz#getTipoInterno <em>Tipo Interno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Interno</em>' attribute.
	 * @see diagramapseudocodigo.TipoVariable
	 * @see #getTipoInterno()
	 * @generated
	 */
	void setTipoInterno(TipoVariable value);

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
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.Matriz#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.valor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getMatriz_Valor()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<valor> getValor();

} // Matriz
