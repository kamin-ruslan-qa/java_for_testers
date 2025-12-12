import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();

        int number = mainClass.getLocalNumber();

        if (number == 14) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Ошибка! getLocalNumber должен быть 14");
        }
    }
}


