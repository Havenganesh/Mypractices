package tamilnadu.chennai;

public class Tamilnadu extends SouthIndia {
	public Tamilnadu(String primeMinister) {
		super(primeMinister);
		// TODO Auto-generated constructor stub
	}
	static String capital = "chennai";
	public static void main(String[] args)
 {
		// TODO Auto-generated method stub
System.out.println("india's capital was " + India.capital);
System.out.println("Tamilnadu's capital was " + Tamilnadu.capital);
SouthIndia si = new Tamilnadu(capital);
Tamilnadu pm = new Tamilnadu("Chief Minister");
si.cultivate();
si.dress();
si.eat();
si.livingStyle();
si.speakLanguage();

	}

	@Override
	public void speakLanguage() {
		// TODO Auto-generated method stub
		System.out.println("tamil language speaking");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("only rice and other was hotel");
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		System.out.println("tamil traditions only");
	}
     public void cultivate()
    {
	System.out.println("Rice abd Sugarcane cultivation");
    }
    public void livingStyle()
    {
	System.out.println("above average development");
    }
}
