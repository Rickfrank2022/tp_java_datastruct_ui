package tp;

public class Fraction {
	
	private int num;
	private int den;
	
	public Fraction(int n, int d) throws Exception {
		
		if(d == 0)
			throw new Exception("Impossible de creer la fraction avec un denominateur nul");
		
		this.num=n;
		this.den=d;
	} 
	
	public int pgcd(int a, int b) {
		if(a == 0)
			return b;
		else if(b==0)
			return a;
		
		return pgcd(b, a%b);
	}
	
	public Fraction(int n) throws Exception {
		this(n, 1);
	}
	
	public Fraction normaliser() throws Exception {
		int p = pgcd(num, den);
		
		//System.out.println(p);
		
		return new Fraction(num/p, den/p);
	}
	
	public int getDen() { return this.den;}
	public int getNum() { return this.num;}
	
	public Fraction add(Fraction f) throws Exception {	
		int num = this.num*f.den + this.den*f.num;
		int den = this.den * f.den;	
		return new Fraction(num, den).normaliser();	
	}
	
	public Fraction mul(Fraction f) throws Exception {
		return new Fraction(num*f.num, den*f.den).normaliser();
	}
	
	public Fraction inverse() throws Exception {
		return new Fraction(den, num);
	}
	
	public Fraction toNegative() throws Exception {
		return new Fraction(-num, den);
	}
	
	public Fraction sub(Fraction f) throws Exception{
		return this.add(f.toNegative());
	}
	
	public Fraction div(Fraction f) throws Exception {
		return this.mul(f.inverse());
	}
	
	public void afficher(){
		if(den!=1)
			System.out.print(num+"/"+den);
		else
			System.out.println(num);
	}
	
}
