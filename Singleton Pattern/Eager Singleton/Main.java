class EagerSingleton{
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Eager Loading Singleton Instance");
    }
}

public class Main {
    public static void main(String args[]){
        EagerSingleton obj1 = EagerSingleton.getInstance();
        obj1.showMessage();
    }
}


/*
 * Instance is created when the class is loaded.
 * 
 * This can lead to unnecessary resource consumption.
 * 
 * Used when singleton instance is lightweight and frequently needed.
 */