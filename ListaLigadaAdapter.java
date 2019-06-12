import java.util.LinkedList;

public class ListaLigadaAdapter<T> implements IListaLigada<T> {
    private LinkedList<T> lista;
    
    public ListaLigadaAdapter(LinkedList<T> lista) {
    	this.lista = lista;
    }
    
	@Override
	public void add(POS p, T element) {
		if (p == POS.FIRST) {
			lista.addFirst(element);
		}else {
			lista.addLast(element);
		}
	}

	@Override
	public T get(POS p) {
		if (p == POS.FIRST) {
			return lista.getFirst();
		}else {
			return lista.getLast();
		}
	}

	@Override
	public T remove(POS p) {
		if (p == POS.FIRST) {
			return lista.removeFirst();
		}else {
			return lista.removeLast();
		}
	}    
}
