import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class PuzzleJava{
    public ArrayList <Integer> sumAndGreaterThan10(Integer[] arr){
        int sum = 0;
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (Integer elem : arr){
            sum += elem;
            if (elem > 10){
                results.add(elem);
            }
        }
        System.out.println(sum);
        return results;
    }
    public ArrayList <String> shuffleNameAndGreaterThan5(ArrayList<String> names){
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");

        Collections.shuffle(names);
        System.out.println(names);

        names.removeIf(name->(name.length() <= 5));
        return names;
    }
    public void shuffleAndFirstLast(){

        ArrayList<String> alphaArr = new ArrayList<String>();
        for (char alpha = 'A'; alpha <= 'Z'; alpha++) {
            alphaArr.add(Character.toString(alpha));
        }
        System.out.println(alphaArr);
        Collections.shuffle(alphaArr);
        System.out.println(alphaArr);

        System.out.println("First letter of shuffled array: " + alphaArr.get(0));
        System.out.println("Last letter of shuffled array: " + alphaArr.get(25));
        String sample = alphaArr.get(0);

        if ("AEIOU".indexOf(sample) > 0) {
            System.out.println("The first letter happens to be a vowel!");
        }
    }
    public ArrayList randomeNumbers(){
        ArrayList<Integer> number = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++){
            number.add(ThreadLocalRandom.current().nextInt(55, 100));
        }
        return number;
    }
    public ArrayList sortTenRandomNums() {
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        int min = 100;
        int max = 55;
        for (int i = 1; i <= 10; i++) {
            int newNum = ThreadLocalRandom.current().nextInt(55, 100);
            intArr.add(newNum);
            if (newNum < min) {
                min = newNum;
            } else if (newNum > max) {
                max = newNum;
            }
        }
        Collections.sort(intArr);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        return intArr;
    }

    public String randomString() {
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < 5; i++){
            randString.append(alpha.charAt(rand.nextInt(alpha.length())));
        }
        String finalString = randString.toString();
        return finalString;
    }
    public ArrayList randomStringOfStrings(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        ArrayList<String> randList = new ArrayList<String>();
        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i <10; i++){
            for(int j = 0; j < 5; j++){
                randString.append(alpha.charAt(rand.nextInt(alpha.length())));
            }
            String finalString = randString.toString();
            randList.add(finalString);
            randString.setLength(0);
        }
        return randList;    
        }
}

