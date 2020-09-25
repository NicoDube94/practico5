package practico5;

import java.util.*;

public class Practica {

    public static void main(String[] args) {

        Map<Integer, Empleado> emp = new HashMap<>();
        emp.put(2, new Empleado("Jose", 52000));
        emp.put(3, new Empleado("Pepe", 52000));
        emp.put(1, new Empleado("Juanito", 52000));
        emp.put(5, new Empleado("Lucas", 52000));
        System.out.println(emp);
        
        for(Map.Entry<Integer,Empleado> e: emp.entrySet()){
          int clave=e.getKey();
          Empleado valor=e.getValue();
            System.out.println("[ Clave : "+clave+"][ Valor : "+valor+" ]");
        }
    }
}
