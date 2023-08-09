package net.alex9849.arm.adapters;

import com.sk89q.worldedit.math.BlockVector2;
import org.junit.Before;
import org.junit.Test;

import static com.sk89q.worldedit.math.BlockVector2.at;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WG7RegionTest {

    private WG7Region region;

    @Before
    public void setUp() throws Exception {
        region = new WG7Region(null);
    }

    // X000X
    // 00000
    // 00000
    // 00000
    // X000X
    //25
    @Test
    public void test5x5(){
        BlockVector2[] points = {at(0,0),at(4,0),at(4,4),at(0, 4)};
        assertEquals(25, region.getFakeArea(points));
    }

    // 0X000X
    // 000000
    // 000000
    // 000000
    // 0X000X
    //25
    @Test
    public void test5x5offsetx1(){
        BlockVector2[] points = {at(1,0),at(5,0),at(5,4),at(1, 4)};
        assertEquals(25, region.getFakeArea(points));
    }
    // 000000
    // 0X000X
    // 000000
    // 000000
    // 000000
    // 0X000X
    //25
    @Test
    public void test5x5offsetx1y1(){
        BlockVector2[] points = {at(1,1),at(5,1),at(5,5),at(1, 5)};
        assertEquals(25, region.getFakeArea(points));
    }
    // 00X000X
    // 0000000
    // 0000000
    // 0000000
    // 00X000X
    //25
    @Test
    public void test5x5offsetx2(){
        BlockVector2[] points = {at(2,0),at(6,0),at(6,4),at(2, 4)};
        assertEquals(25, region.getFakeArea(points));
    }
    @Test
    public void test5x5offsetx1dot5y1dot5(){
        BlockVector2[] points = {at(1.5,1.5),at(5.5,1.5),at(5.5,5.5),at(1.5, 5.5)};
        assertEquals(25, region.getFakeArea(points));
    }

    // X00X
    // 0000
    // 0000
    // X00X
    //16
    @Test
    public void test4x4(){
        BlockVector2[] points = {at(0,0),at(3,0),at(3,3),at(0, 3)};
        assertEquals(16, region.getFakeArea(points));
    }
    // XX0X
    // 0000
    // 0000
    // X00X
    //16
    @Test
    public void test4x4p1(){
        BlockVector2[] points = {at(0,0),at(1,0),at(3,0),at(3,3),at(0, 3)};
        assertEquals(16, region.getFakeArea(points));
    }

    // XX0X
    // 0000
    // X00X
    //12
    @Test
    public void test4x3p1(){
        BlockVector2[] points = {at(0,0),at(1,0),at(3,0),at(3,2),at(0, 2)};
        assertEquals(12, region.getFakeArea(points));
    }
    //  01234567
    //0 XX0X
    //1 0000
    //2 X00X
    //3 000X000X
    //4 X0000000
    //5 X0000X0X
    //36
    @Test
    public void test4x3p8x3(){
        BlockVector2[] points = {
                at(0,0),at(1,0),at(3,0),
                at(3,2),at(3,3), at(7,3),
                at(7,5),at(5,5),at(0,5),
                at(0,4), at(0, 2)};
        assertEquals(36, region.getFakeArea(points));
    }
}
