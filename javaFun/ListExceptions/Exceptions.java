import java.util.ArrayList;

public class Exceptions{
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
    
        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("This is the integer: " + castedValue);
            } catch (ClassCastException e) {
                System.out.println(" This value is not an Integer " + e.getMessage());
                // System.out.println("Line: " + e.getStackTrace()[0].getLineNumber());
            }
        }
    }
}