package JavaMavenNetology.JavaMavenNetology_2.ru.netology.sqr;

public class SQRService {

    public int calcSquare(int bot, int top) {

        int counter = 0;
        for (int i = 10; i <= 99; i++) {

            int square = i * i;
            if (square >= bot) {
                if (square <= top) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
