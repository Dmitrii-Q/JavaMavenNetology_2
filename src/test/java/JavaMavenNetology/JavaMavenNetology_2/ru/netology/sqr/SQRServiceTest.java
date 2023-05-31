package JavaMavenNetology.JavaMavenNetology_2.ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public void equivalentValuesMid () {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSquare(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesBot () {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSquare(99, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesTop () {
        SQRService service = new SQRService();

        int expected = 2;
        int actual = service.calcSquare(9_604, 9_801);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesOut () {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSquare(9_802, 10_000);

        Assertions.assertEquals(expected, actual);
    }
}
