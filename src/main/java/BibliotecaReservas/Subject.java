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

    public void setReserva(boolean _flag) {
        this.reserva = _flag;
        //flag value changed .So notify observer(s)
        notifyObservers();
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
