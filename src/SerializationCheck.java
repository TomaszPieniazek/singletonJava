import java.io.*;

public class SerializationCheck {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        LazySingletonSynchronized single1= LazySingletonSynchronized.getInstance();

        ObjectOutput out=null;
        out= new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(single1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        LazySingletonSynchronized single2 = (LazySingletonSynchronized) in.readObject();
        in.close();

        System.out.print("\n"+single1+"\n"+single2);


    }
}
