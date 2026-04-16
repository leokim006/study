package Box;

class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10); // <>로 써도 자동으로 Integer타입으로 적어줌.
        Box<String>  strBox = new Box<>("String0");
        Box<Box<Integer>> boxBox = new Box<>(new Box<Integer>(20));

        int i = intBox.getData();
        // int j = strBox.getData(); 오류
        System.out.println("i: " + intBox.getData() + " " +
                           "str: " + strBox.getData() + " " +
                           "Box: " + boxBox.getData().getData());
    }
}
