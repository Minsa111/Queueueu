package Latihan1;

class Stack {
    private int size;
    private Object[] dDatas;
    private int top;

    public Stack(int a) {
        size = a;
        dDatas = new Object[size];
        top = -1;
    }

    public void push(Object data) {
        if(isFull()){
            throw new RuntimeException("Latihan1.Stack Overflow");
        }
        top++;
        dDatas[top] = data;
    }

    public Object pop() {
        if (empty()) {
            throw new RuntimeException( "Latihan1.Stack underflow" );
        }
        Object element = dDatas[top];
        dDatas[top] = null;
        top--;
        return element;
    }

    public Object peek() {
        if (empty()) {
            throw new RuntimeException( "Latihan1.Stack is empty" );
        }
        return dDatas[top];
    }

    public boolean empty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int search(Object element) {
        int distance = -1;
        for (int i = 0; i <= top; i++) {
            if (dDatas[i].equals( element )) {
                distance = top - i + 1;
                break;
            }
        }
        return distance;
    }
}


public class ExampleStack {

    public static void main(String[] args) {
        Stack st = new Stack( 4 );

        st.push( "Aku" );
        st.push( "Anak" );
        st.push( "Indonesia" );

        System.out.println( "Next : " + st.peek() );

        st.push( "Raya" );
        System.out.println( st.pop() );
        st.push( "!" );

        int count = st.search( "Aku" );
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }
        System.out.println( st.pop() );
        System.out.println( st.empty() );
    }
}
