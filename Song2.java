 import java.util.concurrent.TimeUnit;

public class Song2 {

    public static void main(String[] args) {
        printLyrics();
    }

    public static void printLyrics() {
        String[] lyrics = {
            "Sagar ki gehrai se",
            "Gehra hai apna pyaar",
            "Sehraaon ki, in hawaon mein",
            "Kaise aayegi bahaar",
            "Kaha se ye hawa aayi?",
            "Ghataein khali kyun chahi?",
            "khafa ho gye hum",
            "juda ho gye hum"
        };

        double[] delays = {
            0.7, 0.7, 0.4, 0.7, 0.8, 0.9, 1.2
        };

        System.out.println(" woh lamhe : \n");

        try {
            TimeUnit.MILLISECONDS.sleep(1200); // 1.2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < lyrics.length; i++) {
            String line = lyrics[i];
            for (char character : line.toCharArray()) {
                System.out.print(character);
                System.out.flush(); // Flush the output buffer
                try {
                    TimeUnit.MILLISECONDS.sleep(200); // 0.06 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(); // Newline after each line

            if (i < delays.length) {
                try {
                    TimeUnit.MILLISECONDS.sleep((long) (delays[i] * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    TimeUnit.MILLISECONDS.sleep(800); // 0.8 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


