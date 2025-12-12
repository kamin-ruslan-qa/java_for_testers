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
        @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        int result = mainClass.getClassNumber();
        Assert.assertTrue("Метод getClassNumber должен возвращать число больше 45, а вернул " + result,
                result > 45);

        }
    }




