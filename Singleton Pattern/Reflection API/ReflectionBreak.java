import java.lang.reflect.Constructor;

class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}

public class ReflectionBreak {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();

        // Reflection API
        Constructor<Singleton> c1 = Singleton.class.getDeclaredConstructor();
        // to make the private constructor accessible
        c1.setAccessible(true);
        System.out.println(s1.hashCode());
        System.out.println(c1.hashCode());
    }
}
