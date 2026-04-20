package deitel13.interfaz;

import deitel13.negocio.Empleado;

import java.util.Scanner;
import javax.swing.JOptionPane; // NUEVO: Importamos la librería para usar ventanas emergentes

public class PruebaEmpleado {
    public static void main(String[] args) {
        // iniciamos las variales en 0 para que despues las podamos usar
        String nombre,apellido ;
        double salario;
        Empleado em1;
        Empleado em2;
        Scanner sc = new Scanner(System.in);

        //leer variables de em1
        //Usamos JOptionPane para pedir textos en ventanas emergentes
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado 1: ");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado 1: ");
        System.out.println("Ingrese el salario del empleado 1: ");
        salario = Double.parseDouble(sc.nextLine());

        //Crear el objeto con la datos ingresados
        em1 = new Empleado(nombre,apellido,salario);

        //copiar la lectura varibles em1 Get
        System.out.println("El nombre completo del empleado 1 es: "+em1.getNombre()+" "+em1.getApellido());
        System.out.println("El salario del empleado 1 es: "+em1.getSalario());
        System.out.println();

        //leer variables de em2
        //Usamos JOptionPane para pedir textos en ventanas emergentes
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado 2: ");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado 2: ");
        System.out.println("Ingrese el salario del empleado 2: ");
        salario = Double.parseDouble(sc.nextLine());

        //Creamos el objeto con la datos ingresados
        em2 = new Empleado(nombre,apellido,salario);
        
        //copiar la lectura varibles em2 Get
        System.out.println("El nombre completo del empleado 2 es: "+em2.getNombre()+" "+ em2.getApellido());
        System.out.println("El salario del empleado 2 es: "+em2.getSalario());
        System.out.println();

        System.out.println("El salario del empleado em1 es: "+em1.getSalario()*12);
        double nuevoSal = em1.getSalario()*1.1;
        em1.setSalario(nuevoSal);

        System.out.println("El salario del empleado em2 es: "+em2.getSalario()*12);
        nuevoSal = em2.getSalario()*1.1;
        em2.setSalario(nuevoSal);
        System.out.println("El nuevo salario anual de em1 es: " + em1.getSalario() * 12);
        System.out.println("El nuevo salario anual de em2 es: " + em2.getSalario() * 12);
    }
}



/*package deitel13.interfaz;

import deitel13.negocio.Empleado;

import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        // iniciamos las variales en 0 para que despues las podamos usar
        String nombre,apellido ;
        double salario;
        Empleado em1;
        Empleado em2;
        Scanner sc = new Scanner(System.in);


        //NOTA: El "buffer" (o búfer) que queda después de
        // utilizar scanner.nextDouble() en Java es el carácter de nueva línea (\n o salto de línea)
        // que se genera al presionar la tecla "Enter" para confirmar el número.


        //leer variables de em1
        System.out.println("Ingrese el nombre del empleado 1: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido  del empleado 1: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el salario del empleado 1: ");
        salario = sc.nextDouble();
        //limpiamos el buffer
        sc.nextLine();

        //Creamos el objeto con la datos ingresados
        em1 = new Empleado(nombre,apellido,salario);
        //copiar la lectura varibles em1 Get
        System.out.println("El nombre completo del empleado 1 es: "+em1.getNombre()+" "+em1.getApellido());
        System.out.println("El salario del empleado 1 es: "+em1.getSalario());
        System.out.println();

        //leer variables de em2
        System.out.println("Ingrese el nombre del empleado 2: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido  del empleado 2: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el salario del empleado 2: ");
        salario = sc.nextDouble();
        //limpiamos el buffer
        sc.nextLine();

        //Creamos el objeto con la datos ingresados
        em2 = new Empleado(nombre,apellido,salario);
        //copiar la lectura varibles em2 Get
        System.out.println("El nombre completo del empleado 2 es: "+em2.getNombre()+" "+ em2.getApellido());
        System.out.println("El salario del empleado 2 es: "+em2.getSalario());
        System.out.println();

        System.out.println("El salario del empleado em1 es: "+em1.getSalario()*12);
        double nuevoSal = em1.getSalario()*1.1;
        em1.setSalario(nuevoSal);

        System.out.println("El salario del empleado em2 es: "+em2.getSalario()*12);
        nuevoSal = em2.getSalario()*1.1;
        em2.setSalario(nuevoSal);
        System.out.println("El nuevo salario anual de em1 es: " + em1.getSalario() * 12);
        System.out.println("El nuevo salario anual de em2 es: " + em2.getSalario() * 12);
    }
}*/