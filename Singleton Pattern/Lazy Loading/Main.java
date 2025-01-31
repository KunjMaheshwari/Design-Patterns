class LazySingleton {
    // Step 1 -> Create a private instance.
    private static LazySingleton instance;

    // Step 2 -> Create a private constructor.
    private LazySingleton() {

    }

    // Step 3 -> Create a public static method.
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy Loading Singleton Instance.");
    }
}


public class Main{
    public static void main(String[] args){
        LazySingleton obj1 = LazySingleton.getInstance();
        obj1.showMessage();
    }
}

/*
 * The instance is created only once when the getInstance() is called.
 * 
 * synchronized keyword ensures thread safety.
 */