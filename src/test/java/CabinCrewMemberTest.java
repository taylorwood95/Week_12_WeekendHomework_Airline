import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Taylor", CabinCrewMemberRank.CAPTAIN);
    }

    @Test
    public void canGetName(){
        assertEquals("Taylor", cabinCrewMember.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals("Captain",cabinCrewMember.getRank() );
    }

    public void canTalk(){
        assertEquals("Hello people!", cabinCrewMember.canTalk());
    }



}
