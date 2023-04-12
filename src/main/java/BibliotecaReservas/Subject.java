package BibliotecaReservas;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alejandro Bernal Garnica
 */
class Subject implements ISubject {

    List <Observer> observerList = new ArrayList<Observer>();
    private boolean reserva;

    public boolean getReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva, int opc) {
        this.reserva = reserva;
        if (reserva)
            notifyObservers();
        else
            if(opc==2)
                System.out.println("Devolucion realizada con exito\n");
            else
                System.out.println("Se ha extendido el plazo 15 dias mas. Recuerde devolverlo a tiempo\n");
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update();
        }
    }
}
