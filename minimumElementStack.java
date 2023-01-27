package coreJava;
import java.util.Stack;

class stackelem {
    Stack<Integer> s = new Stack<>();
    int min;
    public void push(int num) {
        if (s.empty()) {
            s.push(num);
            min = num;
        }
        else if (num > min) {
            s.push(num);
        }
        else {
            s.push(2*num - min);
            min = num;
        }
    }
    public void pop()
    {
        if (s.empty()) {
            System.out.println("Stack underflow!!");
            System.exit(-1);
        }

        int top = s.peek();
        if (top < min) {
            min = 2*min - top;
        }
        s.pop();
    }

    public int getMin() {
        return min;
    }
}

class minimumElementStack {

    public static void main(String[] args) {
       stackelem st = new stackelem();
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(5);
        st.push(1);
        st.push(0);

        System.out.println(st.getMin());
    }
}
