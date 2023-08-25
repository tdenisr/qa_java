import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import ru.practicum.Feline;
import ru.practicum.LionAlex;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    Feline feline;

    @Test
    public void getFriendsTest() throws Exception {
        List<String> expected = List.of("Марти", "Глории", "Мелман");
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals(expected, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        String expected = "Нью-Йоркский зоопарк";
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals(expected, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() throws Exception {
        int expected = 0;
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals(expected, alex.getKittens());
    }
}
