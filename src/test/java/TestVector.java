import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by DK on 05.02.2015.
 */
public class TestVector {
    Vector currentVector,add1Vector,add2Vector,sumVector;
    public static final float[] VALUES_ADD1 = new float[] {1.f, 2.f};
    public static final float[] VALUES_ADD2 = new float[] {3.f, 4.f};
    public static final float[] VALUES_SUM = new float[]{VALUES_ADD1[0]+VALUES_ADD2[0],VALUES_ADD1[1]+VALUES_ADD2[1]};
    @Before
    public void setUp(){
        currentVector = new Vector(VALUES_ADD1.length);
        currentVector.coordinates = VALUES_ADD1;
        add1Vector = new Vector(VALUES_ADD1.length);
        add1Vector.coordinates = VALUES_ADD1;
        add2Vector = new Vector(VALUES_ADD2.length);
        add2Vector.coordinates = VALUES_ADD2;
        sumVector = new Vector(VALUES_SUM.length);
        sumVector.coordinates = VALUES_SUM;
    }
    @Test
    public void testVectorConstructor() {
        assertNotNull("Vector не был создан", currentVector);
        assertEquals("Размерности не совпадают", VALUES_ADD1.length, currentVector.coordinates.length);
    }
    @Test
    public void testEquals(){
        assertEquals("Одинаковые объекты различны",add1Vector,currentVector);
    }
    @Test
    public void testPlus(){
        assertEquals("Суммирование не сработало",sumVector,add1Vector.plus(add2Vector));
        assertEquals("Суммирование со сменой слагаемых не сработало",sumVector,add2Vector.plus(add1Vector));
    }
}
