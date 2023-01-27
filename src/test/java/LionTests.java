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
    public void testLionGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        Assert.assertEquals(3, lion.getKittens());
    }

    @Test
    public void testLionFood() throws Exception {
        List<String> eat = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(eat);
        Assert.assertEquals(eat, lion.getFood());
    }
}
