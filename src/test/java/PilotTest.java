import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Brian", "123456", CabinCrewMemberRank.CAPTAIN);
    }

    @Test
    public void canGetName(){
        assertEquals("Brian", pilot.getName());

    }

    @Test
    public void canGetLicenceNumber(){
        assertEquals("123456", pilot.getLicenceNumber());
    }

    @Test
    public void canGetRank(){
        assertEquals("Captain", pilot.Rank.getRank());
    }

    @Test
    public void canFly(){
        assertEquals("I can flyyy!", pilot.canFlyPlane());
    }

}
