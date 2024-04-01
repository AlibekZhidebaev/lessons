public class Run {
    public static void main(String[] args) throws InterruptedException {
        Hippodrome hippo = new Hippodrome(
                new Horse ("White horse"),
                new Horse ("Black horse"),
                new Horse ("Red horse"),
                new Horse ("Blue horse"),
                new Horse ("Yellow horse"),
                new Horse ("Green horse")
        );
        hippo.start();
        Thread.sleep(13000);


        System.out.println("\n"+"--------------------WINNER: " + Hippodrome.horsesScore.get(0)+"--------------------");


        //-----------------------------------
//        Thread[] horses = new Thread[5]; // Создаем массив потоков для каждой лошади
//
//        for (int i = 0; i < 5; i++) {
//            horses[i] = new Thread(new HorseTest(i + 1)); // Создаем потоки для каждой лошади
//            horses[i].start(); // Запускаем потоки
//        }
//
//        // Ждем завершения всех потоков
//        for (Thread horse : horses) {
//            try {
//                horse.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println("All horses finished!");
        //----------------------
    }
}