
import Libs.Producto;
import Libs.Cliente;
import java.util.Scanner;

public class App_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Producto prod = new Producto();
        Cliente cliente = new Cliente();

        System.out.println("Ingrese la opción a realizar");
        System.out.println("1. Ingresar Producto");
        System.out.println("2. Ingresar Cliente");

        int resp = scan.nextInt();
        scan.nextLine();

        switch (resp) {
            case 1:
                System.out.println("Ingrese los datos del Producto:");
                //prod.setNumSerie();
                //prod.setNombre();
                //prod.setPrecio();
                break;

            case 2:
                System.out.println("Ingrese los datos del Cliente:");
                //cliente.setNumCliente();
                //cliente.setNombre();
                //cliente.setTelefono();
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        if (resp == 1) {
            System.out.println("Datos del Producto:");
            System.out.println("Número de Serie: " + prod.getNumSerie());
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
        } else if (resp == 2) {
            cliente.getNumCliente();
            cliente.getNombre();
            cliente.getTelefono();
        }

        scan.close();
    }
}
