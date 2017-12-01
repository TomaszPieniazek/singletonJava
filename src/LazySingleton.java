
public class LazySingleton {
	private static LazySingleton instance;
	private int number;
	private LazySingleton(){
		
	}
	public static LazySingleton getInstance(){

		if(instance==null){
			instance=new LazySingleton();
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

