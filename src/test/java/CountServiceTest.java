import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CountServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "10000,3000,20000",
//            "100000,60000,150000"
//    })
    @CsvFileSource(files="src/test/resources/count.csv")
   public void testHowLongWillItTakeToRest(int income, int expenses, int threshold) {
        CountService service = new CountService();

        int count = service.calculate(income,expenses,threshold);
        System.out.println(count);
    }



 //   @Test
//    void howLongWillItTakeToRest() {
  //      CountService service = new CountService();

    //    int count = service.calculate(100_000, 60_000, 150_000);
      //  System.out.println(count);
//    }
}
