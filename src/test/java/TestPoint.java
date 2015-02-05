import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by DK on 05.02.2015.
 */
public class TestPoint {
    Point currentPoint;
    public static final int CURRENT_DIMENSION = 2;
    @Before
    public void setUp(){
        currentPoint = new Point(CURRENT_DIMENSION);
    }
    @Test
    public void testPointConstructor() {
        assertNotNull("Point не был создан", currentPoint);
        assertEquals("Размерности не совпадают",currentPoint.coordinates.length,CURRENT_DIMENSION);
    }
}
