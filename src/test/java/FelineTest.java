import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Spy;

import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void felineEatMeatTest() throws Exception  {
            feline.eatMeat();
            Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        }

    @Test
    public void felineGetFamilyTest() {
       Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void felineGetKittensTest() {
       // feline.getKittens(2);
        Assert.assertEquals(2, feline.getKittens(2));
    }
    @Test
    public void felineGetKittensNoParamInvokeGetKittensWith1Test() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

}



