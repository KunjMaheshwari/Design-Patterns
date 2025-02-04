// Existing Interface (Old System)
interface OldSystem {
    void oldRequest();
}

// New System that needs to work with the Old System
class NewSystem {
    void newRequest() {
        System.out.println("New System Request");
    }
}

// Adapter to make NewSystem compatible with OldSystem
class Adapter implements OldSystem {
    private NewSystem newSystem;
    
    Adapter(NewSystem newSystem) { this.newSystem = newSystem; }
    
    @Override
    public void oldRequest() { newSystem.newRequest(); }
}

// Demo
public class AdapterPattern {
    public static void main(String[] args) {
        OldSystem adapter = new Adapter(new NewSystem());
        adapter.oldRequest();
    }
}
