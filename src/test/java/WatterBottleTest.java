import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WatterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasAVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrinkVolume(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        waterbottle.emptyBottle();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canFillBottleToFull(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
        waterbottle.fillBottle();
        assertEquals(100, waterbottle.getVolume());
    }

}
