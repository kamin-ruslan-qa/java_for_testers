// Импортируем необходимые аннотации и методы для тестирования
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {

    @Test
    public void testGetClassString() {

        MainClass mainClass = new MainClass();
        String result = mainClass.getClassString();
        boolean containsHello = result.contains("Hello") || result.contains("hello");

        Assert.assertTrue("Строка должна содержать 'hello' или 'Hello'. Сейчас она содержит:" + result, containsHello);
    }
}