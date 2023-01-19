import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    Feline feline;

    @Test
    public void testCatSound() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testCatFood() {
        List<String> eat = List.of("Животные", "Птицы", "Рыба");
        Cat cat = new Cat(feline);
        try {
            Mockito.when(feline.eatMeat()).thenReturn(eat);
            Assert.assertEquals(eat, cat.getFood());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
