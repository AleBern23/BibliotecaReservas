package BibliotecaReservas;
import java.util.Scanner;

/**
 *
 * @author Alejandro Bernal Garnica
 */
public class BiblliotecaReservar {

    public static void main(String[] args) {
        String libro;
        Scanner in = new Scanner(System.in);
        
        System.out.println("***Bienvenido a la biblioteca***\n");
        
        Observer o1 = new Observer();
        Subject sub1 = new Subject();
        sub1.register(o1);
        
        System.out.print("Escriba el libro que desea reservar: ");
        libro = in.nextLine();
        System.out.println("Reservando libro " + libro.toUpperCase());
        sub1.setReserva(true);
        
    }
}
