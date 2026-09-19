package alumnos;

public class Adaptacion {
	public enum TipoAdaptacion{
		TIEMPO_EXTRA,
		DEJAR_SALIR_DE_CLASE,
		ADAPTAR_CURRICULO,
		ADAPTAR_EVALUACION
		
	}
	public enum MotivoAdaptacion{
		TEA,
		TDAH,
		DEA,
		AACC
	}
	protected MotivoAdaptacion motivoAdaptacion;
	protected TipoAdaptacion tipoAdaptacion;
	
	public Adaptacion(MotivoAdaptacion motivoAdaptacion, TipoAdaptacion tipoAdaptacion) {
		this.motivoAdaptacion=motivoAdaptacion;
		this.tipoAdaptacion=tipoAdaptacion;
	}
	
	//para poder imprimir mis objetos de tipo Adaptacion
	@Override
	public String toString() {
		return motivoAdaptacion+", "+tipoAdaptacion;
	}
}

