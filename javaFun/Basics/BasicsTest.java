public class BasicsTest {
    public static void main (String[] args){
        Basics x = new Basics();
        x.print1To255();
        x.printOddNumbers();
        x.printSum();

        //Arrays

        int[] arr = {1,3,5,7,9,13};
        x.iteratingThroughAnArray(arr);
        int[] arr2 = {-3,-5,-7};
        x.findMax(arr2);
        int[] arr3 = {2,10,3};
        x.findAverage(arr3);
        x.createOddArray();
        int Y = 3;
        int[] arr4 = {1,3,5,7};
        x.greaterThanY(arr4, Y);
        int[] arr5 = {1, 5, 10, -2};
        x.squareValues(arr5);
        int[] arr6 = {1, 5, 10, -2};
        x.eliminateNegatives(arr6);
        int [] arr7 = {1, 5, 10, -2};
        double[] maxminavg = x.maxMinAvg(arr7);
        System.out.println(maxminavg[0]);
        System.out.println(maxminavg[1]);
        System.out.println(maxminavg[2]);
        int[] arr8 = {1,5,10,7,-2};
        x.shiftValues(arr8);
    }
}