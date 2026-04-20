package deitel14.negocio;

import javax.swing.*;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño(int i) {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void mostrarFecha (){
        String textoFecha = dia + "/" + mes + "/" + año;

        //Centrado de Diálogos (JOptionPane): Cuando usas JOptionPane.showMessageDialog(null, "Mensaje")
        // , el null indica que la ventana de diálogo no depende de otra ventana principal.
        // Como resultado, el diálogo se centra automáticamente en la pantalla.

        JOptionPane.showMessageDialog(null, "La fecha ingresada es: " + textoFecha);
    }
}
