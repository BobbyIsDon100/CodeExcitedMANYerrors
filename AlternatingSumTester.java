import java.util.Arrays;/*importing arrays */

/*this class computes the alternating sums of a set of a data values*/

public class DataSets{
    private double[] data;
    private int dataSize;

    /* Constructs an empty data set */
    public DataSets(){
        final int DATA_LENGTH = 100;
        data = new double[DATA_LENGTH];
        dataSize = 0;
    }

    /* ADD A DATA VALUE to the data set,@param x or data value */
    public void add(double x){
        if (dataSize == data.length)
            data = Arrays.copyOf(data, 2 * data.length);
        data[dataSize] = x;
        dataSize++;
    }

    /*
     * Get the alternating sum of the added data.@return sum the sum of the
     * alternating data or 0 if no data has been added
     */
    public double alternatingSum(){
        double alternatingSum = 0;
        if (data != null || dataSize > 0){
            for (int i = 0; i < dataSize; i = i + 2){
                alternatingSum += data[i];
            }
            for (int i = 1; i < dataSize; i = i + 2){
                alternatingSum -= data[i];
            }
        }
        return alternatingSum;
    }
}

/* PROGRAM TO CLACULATE ALTERNATING SUMM! */
public class AlternatingSumTester{
    public static void main(String[] args){
        DataSets data = new DataSets();
        data.add(9);
        data.add(1);
        data.add(0);
        data.add(6);
        data.add(7);
        data.add(8);
        double sum = data.alternatingSum();
        System.out.println("alternating sum: " + sum);
    }
}


























































