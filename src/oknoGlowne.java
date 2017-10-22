
public class oknoGlowne {

	public static void main(String[] args) {
		Singleton a1 = Singleton.getInstance();
		Singleton a2 = Singleton.getInstance();
		System.out.print(a1+"\n"+a2);
		
		Singleton2 b1=Singleton2.getInstance2();
		Singleton2 b2=Singleton2.getInstance2();
		System.out.print("\n"+b1+"\n"+b2);
		
		//Singleton a3= new Singleton();
		//Singleton a4= new Singleton();
		//System.out.print("\n"+a1+"\n"+a2+"\n"+a3+"\n"+a4);
		
	}

}
