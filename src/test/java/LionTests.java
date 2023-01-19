import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    Feline feline;


    @Test
    public void testLionSexIncorrect() {
        Exception exception = null;
        try {
            new Lion(null, feline);
        } catch (Exception e) {
            exception = e;
        } finally {
            Assert.assertNotNull(exception);
        }
    }


    @Test
    public void testLionGetKittens() {
        try {
            Lion lion = new Lion("Самка", feline);
            Mockito.when(feline.getKittens()).thenReturn(3);
            Assert.assertEquals(3, lion.getKittens());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Test
    public void testLionFood() {
        List<String> eat = List.of("Животные", "Птицы", "Рыба");
        try {
            Lion lion = new Lion("Самка", feline);
            Mockito.when(feline.getFood("Хищник")).thenReturn(eat);
            Assert.assertEquals(eat, lion.getFood());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
