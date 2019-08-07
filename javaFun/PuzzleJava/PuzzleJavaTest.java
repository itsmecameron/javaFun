import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJavaTest {
    public static void main(String[] args) {
    PuzzleJava p = new PuzzleJava();
    
    Integer[] sumArr = {3,5,1,2,7,9,8,13,25,32};
    ArrayList<Integer> results_arr = p.sumAndGreaterThan10(sumArr);
    System.out.println(results_arr);

    ArrayList<String> names = new ArrayList<String>();
    System.out.println(p.shuffleNameAndGreaterThan5(names));

    p.shuffleAndFirstLast();
    System.out.println(p.randomeNumbers());
    System.out.println(p.sortTenRandomNums());
    System.out.println(p.randomString());
    System.out.println(p.randomStringOfStrings());
    }
}