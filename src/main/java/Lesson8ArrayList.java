import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

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
        myArray.set(5, 48);
        myArray.set(1, 98);
        System.out.println(myArray);
        for (int i = 0; i < myArray.size(); i++) {   //строки 17-18 идинтичне команде строк 21-22;
            System.out.println(myArray.get(i));
        }
        System.out.println("''''''''''''''''");
        for (Integer element : myArray) {    // == строкам 17-18;но этот цикл предпочтительней, не может быть ошибки
            System.out.println(element);
        }
        LinkedList<Integer> link = new LinkedList<>();
        link.add(10);
        link.add(10);
        link.set(1, 15);
        System.out.println(link);
        System.out.println(link.getLast());

        Vector<Integer> vec = new Vector<>(0, 10);
        vec.add(10);
        System.out.println(vec);

    }
}
