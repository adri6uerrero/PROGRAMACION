package Abstract;

public class Uso_persistencia {
	public class Main {
		public static void main(String[] args) {
			Persistencia persistenciaArchivo = new PersistenciaArchivo();
			Persistencia persistenciaBaseDatos = new PersistenciaBaseDatos();
			persistenciaArchivo.guardarDatos("Datos a guardar en archivo");
			persistenciaBaseDatos.guardarDatos("Datos a guardar en base de datos");
			Object datosDesdeArchivo = persistenciaArchivo.cargarDatos();
			Object datosDesdeBaseDatos = persistenciaBaseDatos.cargarDatos();

		}

	}

}
