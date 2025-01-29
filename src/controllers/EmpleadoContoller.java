package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer, Empleado> empleados;

    public EmpleadoContoller() {
        
        empleados = new HashMap<>();

    }

    // Ingresar el empleado donde la clave sea el id del empleado
    // Empleado a ingresar al mapa
    // False si no ingreso porque ya existe
    // true si ingreso correctamente

    public boolean addEmpleado(Empleado empleado){
        if(empleados.containsKey(empleado.getId())){
            return false;
        }
        empleados.put(empleado.getId(), empleado);
        return true;
    }

    public Empleado getEmpleadoById(int id){
        return empleados.get(id);
    }

    public void displayEmpleados(){
        for(Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getKey()+ " - "+ empleadoEntry.getValue());
        }
    }

    public void displayEmpleadosSoloNombres(){
        for(Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getValue().getName());
        }
    }

    //Sin usar entrySet
    public void displayLlaves(){
        for (Integer key : empleados.keySet()) {
            System.out.println(key);
        }
    }

    //Sin usar entrySet
    public void diaplayEmpleadosValues(){
        for(Empleado valor : empleados.values()){
            System.out.println(valor);
        }
    }
}