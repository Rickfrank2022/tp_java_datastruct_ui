package tp;

public class Complexe {
	private double reel;
	private double img;
	
	public Complexe() {
		this(0, 0);
	}
	
	public Complexe(double r,double i) {
		this.reel=r;
		this.img=i;
	}
	
	public Complexe conjugate() {
		return new Complexe(reel, -img);
	}
	
	public Complexe add(Complexe a) {
		return new Complexe(reel+a.reel, img+a.img);
	}
	
	public Complexe toNegative() {
		return new Complexe(-reel, -img);
	}
	
	public Complexe sub(Complexe a) {
		return this.add(a.toNegative());
	}
	
	public Complexe mul(Complexe a) {
		return new Complexe((reel*a.reel)-(img*a.img), (reel*a.img)+(img*a.reel));
	}
	
	public Complexe div(Complexe a) {
		Complexe tmp = this.mul(a.conjugate());
		double r = a.norme();
		return new Complexe(tmp.reel/(r*r), tmp.img/(r*r));
	}
	
	public double norme(){
		return Math.sqrt(reel*reel + img*img);
	}
	
	public String toString() {
		String t = (img < 0) ? " - i" + Math.abs(img) : " + i" + img;
		return reel + t;		
	}
	

}
