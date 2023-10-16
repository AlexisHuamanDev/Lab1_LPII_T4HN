package Views;

import Controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		
		String empleado;
		
		//-----------------Crear usuario------------------------------
		//empleado = new EmpleadoController().createEmpleado("Huaman", "Alexis", 28, "Masculino", 2500.00);
		//empleado = new EmpleadoController().createEmpleado("Aguilar", "Gianpier", 25, "Masculino", 3500.00);
		
		//-----------------------Borrar usuario-------------------
		//empleado = new EmpleadoController().deleteEmpleado(1);
		
		//---------------------UpdateEmpleado----------------------
		//empleado = new EmpleadoController().updateEmpleado(2, 4000);
		
		//---------------GetUsuario--------------------
		empleado = new EmpleadoController().getEmpleado(2);
		
		System.out.print(empleado);
		
		

	}

}
