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


[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running JavaMavenNetology.JavaMavenNetology_2.ru.netology.sqr.SQRServiceTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.13 s - in JavaMavenNetology.JavaMavenNetology_2.ru.netology.sqr.SQRServiceTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
