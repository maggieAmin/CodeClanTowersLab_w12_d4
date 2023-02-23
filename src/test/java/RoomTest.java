import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void before(){
        ArrayList<Guest> list = new ArrayList<>();
        list.add("Pob");
        room = new Room(2, list) {
        };
    }
    @Test
    public void canAddGuest(){
        room.addGuest("Pob");
        assertEquals("Pob", room.getCollectionOfGuests());
    }

}
