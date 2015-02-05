/**
 * Created by DK on 05.02.2015.
 */
public abstract class GeometricPrimitive {
    public float[] coordinates;
    public GeometricPrimitive(int dimension){
        coordinates = new float[dimension];
    }

    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (other == null) return false;
        if (!(other instanceof GeometricPrimitive))return false;
        GeometricPrimitive x = (GeometricPrimitive) other;
        if (coordinates.length!= x.coordinates.length) return false;
        for (int i=0; i<coordinates.length; i++)
            if (coordinates[i] != x.coordinates[i]) return  false;
        return true;
    }
}
