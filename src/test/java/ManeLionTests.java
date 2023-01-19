import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;


@RunWith(Parameterized.class)
public class ManeLionTests {
    private final String sex;
    private final boolean expectedHasMane;

    public ManeLionTests(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getLion() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false},
        });
    }


    @Test
    public void testLionDoesHaveMane() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(expectedHasMane, lion.doesHaveMane());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}