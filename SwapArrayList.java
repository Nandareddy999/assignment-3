package coreJava;
import java.util.*;

public class SwapArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<size; i++) {
            list.add(i,sc.next());
        }
        Collections.swap(list,0,size-1);
        System.out.println(list);
    }
}
