import org.junit.Assert;
import org.junit.Test;
import ru.practicum.Animal;

public class AnimalTest {
    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                animal.getFamily());
    }
}
