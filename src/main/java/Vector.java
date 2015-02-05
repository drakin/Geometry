import java.util.Arrays;

import static java.lang.Math.max;

/**
 * Created by DK on 05.02.2015.
 */
public class Vector extends GeometricPrimitive{
    public Vector(int dimension){
        super(dimension);
    }
    public  Vector plus(Vector add){
        int length = max(add.coordinates.length,this.coordinates.length);
        Vector result = new Vector(length);
        result.coordinates = Arrays.copyOf(coordinates, length);
        for(int i=0;i<add.coordinates.length;i++)
            result.coordinates[i]+=add.coordinates[i];
        return result;
    }
}
