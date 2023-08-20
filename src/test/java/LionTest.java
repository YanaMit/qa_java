import com.example.IFeline;
import com.example.Lion;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runners.Parameterized;

import org.junit.Assert;

@RunWith(Enclosed.class)
public class LionTest {

    @RunWith(Parameterized.class)
    public static class LionTestParametrized {
        IFeline feline = Mockito.mock(IFeline.class);
        private String sex;
        private boolean expected;

        public LionTestParametrized(String sex, boolean expected) {
            this.sex = sex;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Object[][] myLionTests() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false},
            };
        }

        @Test
        public void checkHasManeTest() throws Exception {
            Lion lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals(actual, expected);
        }
    }
        @RunWith(MockitoJUnitRunner.class)
        public static class LionTestSingle {
            IFeline feline = Mockito.mock(IFeline.class);
            private String sex = "Самец";


        @Test
        public void lionHaveExceptionTest() {
            Exception thrown = Assert.assertThrows(Exception.class, () -> {
                new Lion("Самк", feline);
            });
            Assert.assertEquals(thrown.getMessage(), "Используйте допустимые значения пола животного - самец или самка");

        }

        @Test
        public void lionGetKittensNoArgumentsTest() throws Exception {
            Lion lion = new Lion(sex, feline);
            lion.getKittens();
            Mockito.verify(feline, Mockito.times(1)).getKittens();
        }

        @Test
        public void lionGetFoodTest() throws Exception {
            Lion lion = new Lion(sex, feline);
            lion.getFood();
            Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        }
    }
}
