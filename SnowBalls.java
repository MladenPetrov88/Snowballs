import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballs = scanner.nextInt();
        double snowballValue = 0;
        double highestValue = 0;
        int snowballSnowOut =0;
        int snowballTimeOut = 0;
        int snowballQualityOut = 0;

        for (int i = 0; i < snowballs; i++) {
            int snowballSnow =  scanner.nextInt();
            int snowballTime = scanner.nextInt();
            int snowballQuality = scanner.nextInt();

            snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

        if (snowballValue > highestValue) {
            highestValue = snowballValue;
            snowballSnowOut = snowballSnow;
            snowballTimeOut = snowballTime;
            snowballQualityOut = snowballQuality;
        }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowOut, snowballTimeOut, highestValue, snowballQualityOut);
    }
}
