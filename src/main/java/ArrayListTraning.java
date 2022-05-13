import java.util.ArrayList;

public class ArrayListTraning {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int x = 0; x<10; x++) {
            arrayList.add(x);
        }
            arrayList.add(11);
            System.out.println(arrayList);
            arrayList.remove(2);
        System.out.println(arrayList);

//        for (Integer i : arrayList)
//            System.out.println(i);
//        for (int x = 0; x< arrayList.size(); x++) {
//            System.out.println(arrayList.get(x));
        }
//        System.out.println(arrayList);
//        System.out.println(arrayList.get(5));
//        System.out.println(arrayList.get(19));
//        System.out.println(arrayList.size());
    }

