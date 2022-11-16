package tp;
import java.util.ArrayList;
public class Pile <T>{
	
	private ArrayList<T> liste;
	
	public Pile() {
		liste = new ArrayList<T>();
	}
	
	public void empiler(T n) {
		liste.add(n);
	}
	
	public T depiler() throws Exception {
		if(estvide()) 
			throw new Exception("Pile vide"); 
		return liste.remove(liste.size()-1);
	}
	public boolean estvide() {
		return liste.size()==0;
	}

}
