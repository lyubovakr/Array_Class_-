import java.util.ArrayList;

public class Lesson8ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(0);
        myArray.add(0);
        myArray.add(0);
        myArray.add(0);
        myArray.add(0);
        myArray.add(0);
        myArray.add(0);
        myArray.set(2, 15);
        System.out.println(myArray);
    }
}
