import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class oknoGlowne {

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


        //LAZY SINGLETON TEST
        LazySingleton single1=LazySingleton.getInstance();

        Class reflect=LazySingleton.class;
        Constructor conR= reflect.getDeclaredConstructor();
        conR.setAccessible(true);
        LazySingleton single2= (LazySingleton) conR.newInstance();

        single1.setNumber(1);
        single2.setNumber(2);
        System.out.print("\n"+single1+" : "+single1.getNumber()+"\n"+single2+" : "+single2.getNumber());

        //LAZY SINGLETON WITH DOUBLE CHECK TEST
        LazySingletonDoubleCheck single3=LazySingletonDoubleCheck.getInstance();

        reflect=LazySingletonDoubleCheck.class;
        conR=reflect.getDeclaredConstructor();
        conR.setAccessible(true);
        LazySingletonDoubleCheck single4= (LazySingletonDoubleCheck) conR.newInstance();

        single3.setNumber(3);
        single4.setNumber(4);
        System.out.print("\n"+single3+" : "+single3.getNumber()+"\n"+single4+" : "+single4.getNumber());

        //LAZY SINGLETON WITH SERIALIZATION TEST
        LazySingletonSerialization single5= LazySingletonSerialization.getInstance();

        reflect=LazySingletonSerialization.class;
        conR=reflect.getDeclaredConstructor();
        conR.setAccessible(true);
        LazySingletonSerialization single6= (LazySingletonSerialization) conR.newInstance();

        single5.setNumber(5);
        single6.setNumber(6);

        System.out.print("\n"+single5+" : "+single5.getNumber()+"\n"+single6+" : "+single6.getNumber());

        //ENUM SINGLETON TEST
        EnumSingleton single7=EnumSingleton.INSTANCE;
        single7.setNumber(7);
        EnumSingleton single8=EnumSingleton.INSTANCE;
        single8.setNumber(8);

        System.out.print("\n"+single7.hashCode()+" : "+single7.getNumber()+"\n"+single8.hashCode()+" : "+single8.getNumber());



    }


}
