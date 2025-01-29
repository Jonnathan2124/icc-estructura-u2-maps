import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller emplCtrl = new EmpleadoContoller();
        

        boolean result = emplCtrl.addEmpleado(new Empleado(1, "Jonnathan", "Jefe"));
        System.out.println("Ingreso "+ result);
        result = emplCtrl.addEmpleado(new Empleado(1, "Jonnathan", "Mestro Pokemon"));
        System.out.println(result);

        emplCtrl.addEmpleado(new Empleado(1, "Jonnathan", "Maestro JEDAI"));
        emplCtrl.addEmpleado(new Empleado(2, "Jorge", "Senior"));
        emplCtrl.addEmpleado(new Empleado(3, "Ulises", "Senior"));

        emplCtrl.displayEmpleados();
        emplCtrl.displayEmpleadosSoloNombres();
        System.out.println("llaves");
        emplCtrl.displayLlaves();
        System.out.println("values");
        emplCtrl.diaplayEmpleadosValues();
        
    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
