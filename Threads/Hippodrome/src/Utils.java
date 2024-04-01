public class Utils {
    private Utils(){}
    public static void SleepTime(){
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
