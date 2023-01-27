package coreJava;
import java.util.Stack;

public class ReverseStackUsingRecurssion {
    static Stack<Character> st = new Stack<>();

    static void insert(char ch) {
        if(st.isEmpty()){
            st.push(ch);
        } else {
            char a = st.peek();
            st.pop();
            insert(ch);
            st.push(a);
        }
    }
    static void reverse(){
        if(st.size() > 0) {
            char x = st.peek();
            st.pop();
            reverse();

            insert(x);
        }
    }

    public static void main(String[] args) {
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        System.out.println(" original stack  : ");
        System.out.println(st);

        reverse();

        System.out.println("Reversed stack : ");
        System.out.println(st);
    }
}
