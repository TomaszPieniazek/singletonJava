
public class Singleton2 {
	private static Singleton2 instance;
	private Singleton2() {
		
	}
	
	public static Singleton2 getInstance2() {
		if(instance==null)
		{
			instance=new Singleton2();
		}
		return instance;
	}
}
