package Abstract;

class PersistenciaArchivo extends Persistencia {

	public void guardarDatos(Object datos) {

		System.out.println("Guardando datos en un archivo...");

	}

	public Object cargarDatos() {

		System.out.println("Cargando datos desde un archivo...");

		return null;

	}

}
