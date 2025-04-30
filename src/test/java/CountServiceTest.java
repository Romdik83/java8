import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountServiceTest {
    @Test
    void heWillRest() {
        CountService service = new CountService();
        int income = 10_000;
        int expenses = 3_000;
        int count = service.calculate(10_000, 3_000, 20_000);
      //  Assertions.assertEquals(count);
        System.out.println(count);
    }

    @Test
    void howLongWillItTakeToRest() {
        CountService service = new CountService();
        int income = 100_000;
        int expenses = 60_000;
        int count = service.calculate(100_000, 60_000, 150_000);
        //  Assertions.assertEquals(count);
        System.out.println(count);
    }
}
