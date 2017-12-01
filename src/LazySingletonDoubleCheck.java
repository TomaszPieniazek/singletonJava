
public class LazySingletonDoubleCheck {
	private static LazySingletonDoubleCheck instance;
	private int number;

	private LazySingletonDoubleCheck() {
		
	}
	
	public static LazySingletonDoubleCheck getInstance() {
		if(instance==null){
				if (instance==null){
					instance=new LazySingletonDoubleCheck();
				}
		}
		return instance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
