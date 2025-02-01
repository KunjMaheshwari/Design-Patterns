class Singleton implements Cloneable {
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    // Cloning 
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class CloningBreak {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = (Singleton) s1.clone();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
