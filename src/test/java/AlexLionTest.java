import com.example.AlexLion;
import com.example.IFeline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import org.junit.Assert;


@RunWith(MockitoJUnitRunner.class)

public class AlexLionTest {

    @Mock
    private IFeline feline;

    @Test
    public void alexGetFriendsTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        String[] expectedFriends =  {"Марти", "Глория", "Мелман"};
        Assert.assertEquals(alexLion.getFriends(), expectedFriends);
    }

    @Test
    public void alexGetPlaceOfLivingTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        Assert.assertEquals(alexLion.getPlaceOfLiving(), "Нью-Йоркский зоопарк");
    }

    @Test
    public void alexGetKittensTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        Assert.assertEquals(alexLion.getKittens(), 0);
    }

}
