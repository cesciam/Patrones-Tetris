package examen.principal.Obsevador.Interfaces;

public interface ISujeto {
    void addObserver(IObservador o);
    void notifyObservers();
    void notifyObservers(int points);
}
