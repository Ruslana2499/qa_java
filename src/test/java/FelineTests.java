import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTests {

    @Test
    public void testEatMeat() {
        List<String> eat = List.of("Животные", "Птицы", "Рыба");
        try {
            Feline feline = new Feline();
            Assert.assertEquals(eat, feline.eatMeat());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Test
    public void testFamily() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKitten() {
        Feline feline = new Feline();
        Assert.assertEquals(5, feline.getKittens(5));
    }
}
