package coreJava;
import java.util.*;
public class copyArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<String> list1 = new ArrayList<>();
        for(int i=0; i<size; i++){
            list1.add(i,sc.next());
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        int size2 = sc.nextInt();
        for(int i=0; i<size2; i++){
            list2.add(i,sc.nextInt());
        }
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        for(int i=0; i<size2; i++){
            list3.add(list2.get(i).toString());
        }
        System.out.println(list3);
    }
}
