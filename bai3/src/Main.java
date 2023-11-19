import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        while (true) {
            int numb = Integer.parseInt(scanner.nextLine());
            if (numb == 0) {
                stopWatch.stop();
                break;
            }
        }
        System.out.println(stopWatch.getElapsedTime());

    }
}