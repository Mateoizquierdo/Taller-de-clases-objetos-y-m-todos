package deitel14.interfaz;

import deitel14.negocio.Fecha;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha FechaDePrueba = new Fecha(23,04, 2007);
        // Llamamos al método mostrarFecha que se creo en la clase Fecha
        FechaDePrueba.mostrarFecha();

        //establecemos otro nuevo año con el metodo set
        FechaDePrueba.setAño(2027);

        //Mostramos la nueva fecha actualizada
        FechaDePrueba.mostrarFecha();
    }
}
