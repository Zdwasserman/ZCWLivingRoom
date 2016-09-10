package Wasserman.Zachary.ZCWLivingRoom;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by zacharywasserman on 9/10/16.
 */

public class TelevisionTest {
    @Test
    public void getVolumeTest(){
        Television television = new Television();
        Integer expectedValue = 0;
        Integer actualValue = television.getVolume();
        assertEquals("The value should be 0",expectedValue,actualValue);

    }
    @Test
    public void setVolumeTest(){
        Television television = new Television();
        Integer expectedValue = 5;

        Integer actualValue = television.getVolume();
        assertEquals("The value should be null",expectedValue,actualValue);
    }

}

