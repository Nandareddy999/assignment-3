package coreJava;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        ArrayList<Integer>list = new ArrayList<>();

        for(int i=0; i<size; i++){
            list.add(i,sc.nextInt());
        }
        System.out.println("Enter the element you want to search : ");
        int num = sc.nextInt();
        int count = 0;
        if(list.contains(num)){
            System.out.println("Element found ");
            for(int i=0; i<size; i++){
                if(list.get(i) == num){
                    count++;
                }
            }
        }
        if(count>1) {
            int first = list.indexOf(num);
            int last = list.lastIndexOf(num);
            System.out.println(first + " " + last);
        } else {
            System.out.println("Element not found");
        }
    }
}
