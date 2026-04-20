package deitel12.interfaz;
import deitel12.negocio.Factura;
import javax.swing.JOptionPane; // Importamos la librería para las ventanas

public class PruebaFactura {
    public static void main(String[] args) {
        // 1. Pedir datos al usuario mediante ventanas de entrada (Input Dialog)
        String numeroPieza = JOptionPane.showInputDialog(null, "Ingrese el número de la pieza:",
                "Datos de la Factura", JOptionPane.QUESTION_MESSAGE);

        String descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripción de la pieza:",
                "Datos de la Factura", JOptionPane.QUESTION_MESSAGE);

        // Para la cantidad, leemos el texto y lo convertimos a un número entero (int)
        String cantidadTexto = JOptionPane.showInputDialog(null, "Ingrese la cantidad de artículos a comprar:",
                "Datos de la Factura", JOptionPane.QUESTION_MESSAGE);
        int cantidad = Integer.parseInt(cantidadTexto);

        // Para el precio, leemos el texto y lo convertimos a decimal (double)
        String precioTexto = JOptionPane.showInputDialog(null, "Ingrese el precio por artículo:",
                "Datos de la Factura", JOptionPane.QUESTION_MESSAGE);
        double precio = Double.parseDouble(precioTexto);

        // 2. Crear el objeto Factura con los datos ingresados
        Factura miFactura = new Factura(numeroPieza, descripcion, cantidad, precio);

        // 3. Construir el mensaje que se mostrará al final
        String mensajeFinal = "--- DETALLE DE LA FACTURA ---\n\n"
                + "Número de pieza: " + miFactura.getPiezan() + "\n"
                + "Descripción: " + miFactura.getDescripieza() + "\n"
                + "Cantidad: " + miFactura.getCantarticulo() + "\n"
                + "Precio unitario: $" + miFactura.getArticuloprec() + "\n"
                + "------------------------------------\n"
                + "MONTO TOTAL: $" + miFactura.obtenerMontoFactura();

        // 4. Mostrar el resultado final en una ventana de mensaje (Message Dialog)
        JOptionPane.showMessageDialog(null, mensajeFinal, "Factura Generada Exitosamente", JOptionPane.INFORMATION_MESSAGE);
    }
}
