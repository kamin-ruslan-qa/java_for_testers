import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();

        int number = 14;
            System.out.println("Тест пройден");

            Assert.assertTrue("Ответ должен содержать число 14", number == mainClass.getLocalNumber());


        }
    }




