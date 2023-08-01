import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.practicum.Animal;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {
    private final List<String> food;
    private final String animalKind;

    public AnimalParameterizedTest(List<String> food, String animalKind) {
        this.food = food;
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodData() {
        return new Object[][]{
                {List.of("Трава", "Различные растения"), "Травоядное"},
                {List.of("Животные", "Птицы", "Рыба"), "Хищник"},
                {List.of(""), "Null"},
        };
    }

    @Test
    public void getFoodForAnimalKindTest() {
        Animal animal = new Animal();
        try {
            Assert.assertEquals(food, animal.getFood(animalKind));
        } catch (Exception exception) {
            Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                    exception.getMessage());
        }
    }
}
