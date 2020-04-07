public class Main<E> {
    public static void main(String[] args) {
        Integer[] arrOfInt = {6, 4, 5, 9, 3, 3, 6};
        String[] arrOfStr = {"John", "Alex", "Tom", "Thomas", "Ken", "Hana"};

        ReverveArray<Integer> integerReverveArray = new ReverveArray<Integer>(arrOfInt);
        integerReverveArray.reverse();

        ReverveArray<String> stringReverveArray = new ReverveArray<String>(arrOfStr);
        stringReverveArray.reverse();

    }
}
