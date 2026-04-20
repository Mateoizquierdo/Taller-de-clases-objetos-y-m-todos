import java.util.Scanner;

public class PruebaFrecuenciaCardiacas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CALCULADORA DE FRECUENCIA CARDIACA ---");

        System.out.print("Ingrese el primer nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese el día de nacimiento (DD): ");
        int dia = sc.nextInt();

        System.out.print("Ingrese el mes de nacimiento (MM): ");
        int mes = sc.nextInt();

        System.out.print("Ingrese el año de nacimiento (AAAA): ");
        int anio = sc.nextInt();

        // Crear el objeto
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        // Mostrar resultados tal como en tu captura
        System.out.println("\n--- RESUMEN DEL PACIENTE ---");
        System.out.printf("Nombre completo: %s %s%n", persona.getNombre(), persona.getApellido());
        System.out.printf("Fecha de nacimiento: %02d/%02d/%d%n", persona.getDiaNacimiento(), persona.getMesNacimiento(), persona.getAnioNacimiento());
        System.out.printf("Edad calculada: %d años%n", persona.calcularEdad());
        System.out.printf("Frecuencia cardiaca máxima: %d bpm%n", persona.calcularFrecuenciaMaxima());
        System.out.printf("Rango de frecuencia esperada: %s%n", persona.calcularFrecuenciaEsperada());

        sc.close();
    }
}