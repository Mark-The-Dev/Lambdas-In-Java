public class Main {

    public static void main(String[] args) {

        // old school way.
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the runnable");
//            }
//        }).start();

        // lambda way!
        // 3 parts -- Argument list, Arrow Token, Body.
        new Thread(()-> System.out.println("Printing from the Runnable")).start();



    }

}
