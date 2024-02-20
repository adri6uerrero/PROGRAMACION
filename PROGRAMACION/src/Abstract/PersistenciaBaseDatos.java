package Abstract;

class PersistenciaBaseDatos extends Persistencia {

	public void guardarDatos(Object datos) {

		System.out.println("Guardando datos en una base de datos...");

	}

	public Object cargarDatos() {

		System.out.println("Cargando datos desde una base de datos...");

		return null;

	}

}
