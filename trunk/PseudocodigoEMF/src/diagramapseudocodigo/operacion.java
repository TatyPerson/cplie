/**
 */
package diagramapseudocodigo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>operacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diagramapseudocodigo.operacion#getSigno_op <em>Signo op</em>}</li>
 *   <li>{@link diagramapseudocodigo.operacion#getOp_izq <em>Op izq</em>}</li>
 *   <li>{@link diagramapseudocodigo.operacion#getOp_der <em>Op der</em>}</li>
 * </ul>
 * </p>
 *
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getoperacion()
 * @model
 * @generated
 */
public interface operacion extends valor {
	/**
	 * Returns the value of the '<em><b>Signo op</b></em>' attribute.
	 * The literals are from the enumeration {@link diagramapseudocodigo.signo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signo op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signo op</em>' attribute.
	 * @see diagramapseudocodigo.signo
	 * @see #setSigno_op(signo)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getoperacion_Signo_op()
	 * @model
	 * @generated
	 */
	signo getSigno_op();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.operacion#getSigno_op <em>Signo op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signo op</em>' attribute.
	 * @see diagramapseudocodigo.signo
	 * @see #getSigno_op()
	 * @generated
	 */
	void setSigno_op(signo value);

	/**
	 * Returns the value of the '<em><b>Op izq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op izq</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op izq</em>' containment reference.
	 * @see #setOp_izq(operando_izq)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getoperacion_Op_izq()
	 * @model containment="true" required="true"
	 * @generated
	 */
	operando_izq getOp_izq();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.operacion#getOp_izq <em>Op izq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op izq</em>' containment reference.
	 * @see #getOp_izq()
	 * @generated
	 */
	void setOp_izq(operando_izq value);

	/**
	 * Returns the value of the '<em><b>Op der</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op der</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op der</em>' containment reference.
	 * @see #setOp_der(operando_der)
	 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getoperacion_Op_der()
	 * @model containment="true" required="true"
	 * @generated
	 */
	operando_der getOp_der();

	/**
	 * Sets the value of the '{@link diagramapseudocodigo.operacion#getOp_der <em>Op der</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op der</em>' containment reference.
	 * @see #getOp_der()
	 * @generated
	 */
	void setOp_der(operando_der value);

} // operacion
