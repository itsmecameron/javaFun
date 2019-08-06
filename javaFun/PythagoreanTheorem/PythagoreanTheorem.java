import java.lang.Math;
public class PythagoreanTheorem{
    public double calculateHypotenuse(double legA, double legB){
        return Math.sqrt(Math.pow(legA,2) +Math.pow(legB,2));
    }
}