import java.util.Arrays;
import java.util.List;
// array, arraylist 크기를 다루는 방식이 다르다. arraylist가 크기 부족하면 늘려주는건가?

package NumberBox;

public class Main {
    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>(20);
        NumberBox<Double> doubleBox = new NumberBox<>(20.1);

        @SuppressWarnings("removal")
        Number b = new Intiger(0); // 이거 없어졌대요.. ?????
        System.out.println(b);
// NumberBox/Main.java:8: error: incompatible types: NumberBox<Integer> cannot be converted to NumberBox<Number>
        // NumberBox<Number> numberBox = intBox;
        // Generic의 array는 만들 수 없대요: NumberBox<? extends Number>[] numList = {intBox, doubleBox};
        NumberBox<? extends Number>numberBox = intBox;
        

        for (NumberBox<? extends Number> ele : numList) {
            System.out.println("Number: " + ele.sqrt());
        }

        NumberBox<? extends Number> numBox = intBox;
        System.out.println("Number: " + numBox.sqrt());

        numBox = doubleBox;
        System.out.println("Number: " + numBox.sqrt());
    }
}
