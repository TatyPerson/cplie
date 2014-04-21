/**
 */
package diagramapseudocodigo;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valor Matriz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.ValorMatriz#getNombre_matriz <em>Nombre matriz</em>}</li>
 *   <li>{@link diagramapseudocodigo.ValorMatriz#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz()
 * @model
 * @generated
 */
public interface ValorMatriz extends ValorComplejo {
	/**
	 * Returns the value of the '<em><b>Nombre matriz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre matriz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre matriz</em>' attribute.
	 * @see #setNombre_matriz(String)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz_Nombre_matriz()
	 * @model required="true"
	 * @generated
	 */
	String getNombre_matriz();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.ValorMatriz#getNombre_matriz <em>Nombre matriz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre matriz</em>' attribute.
	 * @see #getNombre_matriz()
	 * @generated
	 */
	void setNombre_matriz(String value);

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link diagramapseudocodigo.valor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getValorMatriz_Indices()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<valor> getIndices();

} // ValorMatriz
