package Views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		
		//String empleado = new EmpleadoController().createEmpleado("Vasquez Chavez","Renzo Leonel",21,"Masculino",1025.50);

		//String empleado = new EmpleadoController().createEmpleado("Mendieta Chavez","Piero Alessandro",19,"Masculino",2000.00);
		
		//String empleado = new EmpleadoController().deleteEmpleado(2);
		
		//String empleado = new EmpleadoController().updateEmpleado(1, "Vasquez Chavez", "Cajita Lio");
		
		String empleado = new EmpleadoController().getEmpleado(1);
		System.out.println(empleado);
	}

}
