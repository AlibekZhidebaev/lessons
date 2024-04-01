public class Horse extends Thread {


    private final String horseName;

    public Horse(String horseName) {
        this.horseName = horseName;
    }

    public void run() {

        for (int i = 0; i < 20; i++) {
            StringBuilder progress = new StringBuilder();
            for (int j = 0; j < i; j++) {
                progress.append(" "); // Прогресс представлен пробелами перед началом линии
            }
            progress.append(">");
            System.out.println("Lane " + horseName + ": " + progress);
            Utils.SleepTime();
        }

        System.out.println("Lane " + horseName + " finished! ");
        Hippodrome.horsesScore.add(horseName);

    }

    @Override
    public String toString() {
        return horseName;
    }
}
