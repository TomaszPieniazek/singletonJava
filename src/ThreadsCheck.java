import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsCheck {
    public static void main(String[] args) throws InterruptedException {
        //to make singleton thread safe add synchronized keyword before getInstance method
        int size =5;

        /*
        //LAZY SINGLETON TEST
        Thread myThreadsLS[]=new Thread[size];
        for (int i = 0; i < size; i++) {
            myThreadsLS[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                LazySingleton single1=LazySingleton.getInstance();
                    System.out.print("\n"+single1);
                }

            });
            myThreadsLS[i].start();
        }
        */
        

        //LAZY SINGLETON WITH DOUBLE CHECKING TEST
        Thread myThreadsLSDC[]=new Thread[size];
        for (int i = 0; i < size; i++) {
            myThreadsLSDC[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    LazySingletonDoubleCheck single1=LazySingletonDoubleCheck.getInstance();
                    System.out.print("\n"+single1);
                }

            });
            myThreadsLSDC[i].start();
        }

/*
        //LAZY SINGLETON SYNCHRONIZED TEST
        Thread myThreadsLSS[]=new Thread[size];
        for (int i = 0; i < size; i++) {
            myThreadsLSS[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    LazySingletonSynchronized single1=LazySingletonSynchronized.getInstance();
                    System.out.print("\n"+single1);
                }

            });
            myThreadsLSS[i].start();
        }*/

        /*
        //LAZY SINGLETON TEST
        Thread myThreadsE[]=new Thread[size];
        for (int i = 0; i < size; i++) {
            myThreadsE[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    EnumSingleton single1=EnumSingleton.INSTANCE;
                    System.out.print("\n"+single1.hashCode()   );             }

            });
            myThreadsE[i].start();
        }
        */

    }

}
