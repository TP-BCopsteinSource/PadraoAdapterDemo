public interface IListaLigada<T> {
	  enum POS {FIRST, LAST}

    void add(POS p,T element);
    T get(POS p);
	  T remove(POS p);
}
