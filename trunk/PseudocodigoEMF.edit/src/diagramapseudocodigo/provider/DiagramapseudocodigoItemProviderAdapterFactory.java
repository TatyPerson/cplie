/**
 */
package diagramapseudocodigo.provider;

import diagramapseudocodigo.util.DiagramapseudocodigoAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramapseudocodigoItemProviderAdapterFactory extends DiagramapseudocodigoAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramapseudocodigoItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Codigo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodigoItemProvider codigoItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Codigo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodigoAdapter() {
		if (codigoItemProvider == null) {
			codigoItemProvider = new CodigoItemProvider(this);
		}

		return codigoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Inicio} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InicioItemProvider inicioItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Inicio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInicioAdapter() {
		if (inicioItemProvider == null) {
			inicioItemProvider = new InicioItemProvider(this);
		}

		return inicioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.DeclaracionVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaracionVariableItemProvider declaracionVariableItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.DeclaracionVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclaracionVariableAdapter() {
		if (declaracionVariableItemProvider == null) {
			declaracionVariableItemProvider = new DeclaracionVariableItemProvider(this);
		}

		return declaracionVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.LlamadaFuncion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LlamadaFuncionItemProvider llamadaFuncionItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.LlamadaFuncion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLlamadaFuncionAdapter() {
		if (llamadaFuncionItemProvider == null) {
			llamadaFuncionItemProvider = new LlamadaFuncionItemProvider(this);
		}

		return llamadaFuncionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.VariableID} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableIDItemProvider variableIDItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.VariableID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableIDAdapter() {
		if (variableIDItemProvider == null) {
			variableIDItemProvider = new VariableIDItemProvider(this);
		}

		return variableIDItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.cadena} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected cadenaItemProvider cadenaItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.cadena}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createcadenaAdapter() {
		if (cadenaItemProvider == null) {
			cadenaItemProvider = new cadenaItemProvider(this);
		}

		return cadenaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.ConstCadena} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstCadenaItemProvider constCadenaItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.ConstCadena}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstCadenaAdapter() {
		if (constCadenaItemProvider == null) {
			constCadenaItemProvider = new ConstCadenaItemProvider(this);
		}

		return constCadenaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.NumeroEntero} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumeroEnteroItemProvider numeroEnteroItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.NumeroEntero}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumeroEnteroAdapter() {
		if (numeroEnteroItemProvider == null) {
			numeroEnteroItemProvider = new NumeroEnteroItemProvider(this);
		}

		return numeroEnteroItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Asignacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsignacionItemProvider asignacionItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Asignacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAsignacionAdapter() {
		if (asignacionItemProvider == null) {
			asignacionItemProvider = new AsignacionItemProvider(this);
		}

		return asignacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Escribir} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EscribirItemProvider escribirItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Escribir}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEscribirAdapter() {
		if (escribirItemProvider == null) {
			escribirItemProvider = new EscribirItemProvider(this);
		}

		return escribirItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Funcion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuncionItemProvider funcionItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Funcion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFuncionAdapter() {
		if (funcionItemProvider == null) {
			funcionItemProvider = new FuncionItemProvider(this);
		}

		return funcionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.ParametroFuncion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametroFuncionItemProvider parametroFuncionItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.ParametroFuncion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParametroFuncionAdapter() {
		if (parametroFuncionItemProvider == null) {
			parametroFuncionItemProvider = new ParametroFuncionItemProvider(this);
		}

		return parametroFuncionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Leer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeerItemProvider leerItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Leer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeerAdapter() {
		if (leerItemProvider == null) {
			leerItemProvider = new LeerItemProvider(this);
		}

		return leerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.NumeroDecimal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumeroDecimalItemProvider numeroDecimalItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.NumeroDecimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumeroDecimalAdapter() {
		if (numeroDecimalItemProvider == null) {
			numeroDecimalItemProvider = new NumeroDecimalItemProvider(this);
		}

		return numeroDecimalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.operacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected operacionItemProvider operacionItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.operacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createoperacionAdapter() {
		if (operacionItemProvider == null) {
			operacionItemProvider = new operacionItemProvider(this);
		}

		return operacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.operando_izq} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected operando_izqItemProvider operando_izqItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.operando_izq}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createoperando_izqAdapter() {
		if (operando_izqItemProvider == null) {
			operando_izqItemProvider = new operando_izqItemProvider(this);
		}

		return operando_izqItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.operando_der} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected operando_derItemProvider operando_derItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.operando_der}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createoperando_derAdapter() {
		if (operando_derItemProvider == null) {
			operando_derItemProvider = new operando_derItemProvider(this);
		}

		return operando_derItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.ValorBooleano} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValorBooleanoItemProvider valorBooleanoItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.ValorBooleano}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValorBooleanoAdapter() {
		if (valorBooleanoItemProvider == null) {
			valorBooleanoItemProvider = new ValorBooleanoItemProvider(this);
		}

		return valorBooleanoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Si} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiItemProvider siItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Si}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSiAdapter() {
		if (siItemProvider == null) {
			siItemProvider = new SiItemProvider(this);
		}

		return siItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Sino} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinoItemProvider sinoItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Sino}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSinoAdapter() {
		if (sinoItemProvider == null) {
			sinoItemProvider = new SinoItemProvider(this);
		}

		return sinoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.mientras} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected mientrasItemProvider mientrasItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.mientras}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createmientrasAdapter() {
		if (mientrasItemProvider == null) {
			mientrasItemProvider = new mientrasItemProvider(this);
		}

		return mientrasItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.repetir} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected repetirItemProvider repetirItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.repetir}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createrepetirAdapter() {
		if (repetirItemProvider == null) {
			repetirItemProvider = new repetirItemProvider(this);
		}

		return repetirItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.desde} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected desdeItemProvider desdeItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.desde}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createdesdeAdapter() {
		if (desdeItemProvider == null) {
			desdeItemProvider = new desdeItemProvider(this);
		}

		return desdeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.incremento} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected incrementoItemProvider incrementoItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.incremento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createincrementoAdapter() {
		if (incrementoItemProvider == null) {
			incrementoItemProvider = new incrementoItemProvider(this);
		}

		return incrementoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Procedimiento} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedimientoItemProvider procedimientoItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Procedimiento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcedimientoAdapter() {
		if (procedimientoItemProvider == null) {
			procedimientoItemProvider = new ProcedimientoItemProvider(this);
		}

		return procedimientoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Caracter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaracterItemProvider caracterItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Caracter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCaracterAdapter() {
		if (caracterItemProvider == null) {
			caracterItemProvider = new CaracterItemProvider(this);
		}

		return caracterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Internas} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternasItemProvider internasItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Internas}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternasAdapter() {
		if (internasItemProvider == null) {
			internasItemProvider = new InternasItemProvider(this);
		}

		return internasItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.segun} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected segunItemProvider segunItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.segun}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createsegunAdapter() {
		if (segunItemProvider == null) {
			segunItemProvider = new segunItemProvider(this);
		}

		return segunItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Devolver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevolverItemProvider devolverItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Devolver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDevolverAdapter() {
		if (devolverItemProvider == null) {
			devolverItemProvider = new DevolverItemProvider(this);
		}

		return devolverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Caso} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CasoItemProvider casoItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Caso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCasoAdapter() {
		if (casoItemProvider == null) {
			casoItemProvider = new CasoItemProvider(this);
		}

		return casoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.unaria} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected unariaItemProvider unariaItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.unaria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createunariaAdapter() {
		if (unariaItemProvider == null) {
			unariaItemProvider = new unariaItemProvider(this);
		}

		return unariaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Constantes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantesItemProvider constantesItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Constantes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantesAdapter() {
		if (constantesItemProvider == null) {
			constantesItemProvider = new ConstantesItemProvider(this);
		}

		return constantesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Vector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorItemProvider vectorItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Vector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVectorAdapter() {
		if (vectorItemProvider == null) {
			vectorItemProvider = new VectorItemProvider(this);
		}

		return vectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.DeclaracionPropia} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaracionPropiaItemProvider declaracionPropiaItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.DeclaracionPropia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclaracionPropiaAdapter() {
		if (declaracionPropiaItemProvider == null) {
			declaracionPropiaItemProvider = new DeclaracionPropiaItemProvider(this);
		}

		return declaracionPropiaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Declaracion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaracionItemProvider declaracionItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Declaracion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclaracionAdapter() {
		if (declaracionItemProvider == null) {
			declaracionItemProvider = new DeclaracionItemProvider(this);
		}

		return declaracionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.Matriz} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrizItemProvider matrizItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.Matriz}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatrizAdapter() {
		if (matrizItemProvider == null) {
			matrizItemProvider = new MatrizItemProvider(this);
		}

		return matrizItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link diagramapseudocodigo.TipoComplejo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TipoComplejoItemProvider tipoComplejoItemProvider;

	/**
	 * This creates an adapter for a {@link diagramapseudocodigo.TipoComplejo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTipoComplejoAdapter() {
		if (tipoComplejoItemProvider == null) {
			tipoComplejoItemProvider = new TipoComplejoItemProvider(this);
		}

		return tipoComplejoItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (codigoItemProvider != null) codigoItemProvider.dispose();
		if (inicioItemProvider != null) inicioItemProvider.dispose();
		if (declaracionVariableItemProvider != null) declaracionVariableItemProvider.dispose();
		if (llamadaFuncionItemProvider != null) llamadaFuncionItemProvider.dispose();
		if (variableIDItemProvider != null) variableIDItemProvider.dispose();
		if (cadenaItemProvider != null) cadenaItemProvider.dispose();
		if (constCadenaItemProvider != null) constCadenaItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (numeroEnteroItemProvider != null) numeroEnteroItemProvider.dispose();
		if (asignacionItemProvider != null) asignacionItemProvider.dispose();
		if (escribirItemProvider != null) escribirItemProvider.dispose();
		if (funcionItemProvider != null) funcionItemProvider.dispose();
		if (parametroFuncionItemProvider != null) parametroFuncionItemProvider.dispose();
		if (leerItemProvider != null) leerItemProvider.dispose();
		if (numeroDecimalItemProvider != null) numeroDecimalItemProvider.dispose();
		if (operacionItemProvider != null) operacionItemProvider.dispose();
		if (operando_izqItemProvider != null) operando_izqItemProvider.dispose();
		if (operando_derItemProvider != null) operando_derItemProvider.dispose();
		if (valorBooleanoItemProvider != null) valorBooleanoItemProvider.dispose();
		if (siItemProvider != null) siItemProvider.dispose();
		if (sinoItemProvider != null) sinoItemProvider.dispose();
		if (mientrasItemProvider != null) mientrasItemProvider.dispose();
		if (repetirItemProvider != null) repetirItemProvider.dispose();
		if (desdeItemProvider != null) desdeItemProvider.dispose();
		if (incrementoItemProvider != null) incrementoItemProvider.dispose();
		if (procedimientoItemProvider != null) procedimientoItemProvider.dispose();
		if (caracterItemProvider != null) caracterItemProvider.dispose();
		if (internasItemProvider != null) internasItemProvider.dispose();
		if (segunItemProvider != null) segunItemProvider.dispose();
		if (devolverItemProvider != null) devolverItemProvider.dispose();
		if (casoItemProvider != null) casoItemProvider.dispose();
		if (unariaItemProvider != null) unariaItemProvider.dispose();
		if (constantesItemProvider != null) constantesItemProvider.dispose();
		if (vectorItemProvider != null) vectorItemProvider.dispose();
		if (declaracionPropiaItemProvider != null) declaracionPropiaItemProvider.dispose();
		if (declaracionItemProvider != null) declaracionItemProvider.dispose();
		if (matrizItemProvider != null) matrizItemProvider.dispose();
		if (tipoComplejoItemProvider != null) tipoComplejoItemProvider.dispose();
	}

}
