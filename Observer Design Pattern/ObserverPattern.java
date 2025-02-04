import java.util.*;

// Observer Interface
interface Observer { void update(String msg); }

// Subject
class Subject {
    List<Observer> observers = new ArrayList<>();
    void add(Observer o) { observers.add(o); }
    void notifyAll(String msg) { observers.forEach(o -> o.update(msg)); }
}

// Demo
public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.add(msg -> System.out.println("Alice: " + msg));
        subject.add(msg -> System.out.println("Bob: " + msg));
        
        subject.notifyAll("Observer Pattern in Java!");
    }
}
