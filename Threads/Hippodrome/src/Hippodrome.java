import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Hippodrome extends Thread {
    private final Set<Horse> horses = new HashSet<>();

    public static final List<String> horsesScore = new ArrayList<>();


    public Hippodrome(Horse... horses) {
        for (Horse horse : horses)
            this.horses.add(horse);
    }

    @Override
    public void run() {
        for (Horse horse : horses) {
            new Thread(horse).start();
        }

    }
}
