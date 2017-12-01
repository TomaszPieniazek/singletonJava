public class LazySingletonSerialization {
    private static  LazySingletonSerialization instance;
    private int number;

    private LazySingletonSerialization() {
    }

    public static LazySingletonSerialization getInstance(){
        if(instance==null) {
            synchronized (LazySingletonSerialization.class) {
                if (instance == null) {
                    instance = new LazySingletonSerialization();
                }
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
