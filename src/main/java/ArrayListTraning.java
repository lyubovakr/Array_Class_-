import java.util.ArrayList;

public class ArrayListTraning {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int x = 0; x<100; x++) {
            arrayList.add(x);
        }
        for (int x = 0; x< arrayList.size(); x++) {
            System.out.println(arrayList.get(x));
        }
//        System.out.println(arrayList);
//        System.out.println(arrayList.get(5));
//        System.out.println(arrayList.get(19));
//        System.out.println(arrayList.size());
    }
}
