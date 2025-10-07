package practica2.src.mx.edu.TESOEM.isc.principal;

import practica2.src.mx.edu.TESOEM.isc.informacion.datos.Datos;

public class principal {
    public static void main(String [] args){
        Datos objDatos = new Datos ("Hugo", 48, "victor.delao@tesoem.mx");
        System.out.println("Nombre: " + objDatos.getNombre());
        System.out.println("Edad: " + objDatos.getEdad());
        System.out.println("Correo: " + objDatos.getCorreo());
    }

    Datos objDatos2 = new Datos();

    
    objDatos2.setNombre("Juan Perez");
    objDatos2.setEdad(30);
    objDatos2.setCorreo("juan.perez@tesoem.edu.mx");
    System.out.println("Nombre: " + objDatos2.getNombre());
    System.out.println("Edad: " + objDatos2.getEdad());
        }
    }