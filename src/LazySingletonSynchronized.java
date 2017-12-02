import java.io.Serializable;

public class LazySingletonSynchronized implements Serializable {
    private static LazySingletonSynchronized instance;
    private int number;

    private LazySingletonSynchronized() {
    }

    public static LazySingletonSynchronized getInstance(){
        if(instance==null) {
            synchronized (LazySingletonSynchronized.class) {
                if (instance == null) {
                    instance = new LazySingletonSynchronized();
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

    protected LazySingletonSynchronized readResolve() {
        return getInstance();
    }
}
