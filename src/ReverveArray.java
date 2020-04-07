import java.util.Stack;

public class ReverveArray<E> {
    private E[] array;
    private Stack<E> stack;

    public ReverveArray(E[] array) {
        this.array = array;
    }

    public void reverse() {
        Stack<E> stack = new Stack<E>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        System.out.print("Reverse of the array is: {");
        for (int i = 0; i < array.length; i++) {
            array[i] = (E) stack.pop();
            if (i == array.length -1 ) {
                System.out.println(array[i] + "}");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
