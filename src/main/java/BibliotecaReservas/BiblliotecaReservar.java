package BibliotecaReservas;

import java.util.Scanner;

/**
 *
 * @author Alejandro Bernal Garnica
 */
public class BiblliotecaReservar {

    public static void main(String[] args) {
        String libro;
        int opc;
        Scanner in = new Scanner(System.in);

        System.out.println("***Bienvenido a la biblioteca***\n");

        Observer o1 = new Observer();
        Subject sub1 = new Subject();
        sub1.register(o1);
        while (true) {
            System.out.println("1. Reservar un libro\n"
                    + "2. Devolución de un libro\n"
                    + "3. Extender tiempo plazo de entrega\n"
                    + "4. Salir");
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    in.nextLine();
                    System.out.print("Escriba el libro que desea reservar: ");
                    libro = in.nextLine();
                    System.out.println("Reservando libro " + libro.toUpperCase());
                    sub1.setReserva(true, 1);
                    break;
                case 2:
                    sub1.setReserva(false, 2);
                    break;
                case 3:
                    sub1.setReserva(false, 3);
                    break;
                case 4:
                    sub1.unregister(o1);
                    System.out.println("Reserva finalizada con exito.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
                    break;
            }
        }
        
    }
}