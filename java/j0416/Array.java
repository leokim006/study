import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        String[] names = new String[30];
        ArrayList<String> namesList = new ArrayList<>/*<String>*/();
        int[] scores = new int[30];
        int studentCount = 0;

        namesList.add("Lee");
        namesList.add("Park");
        namesList.add("Choi");

        for (int i = 0; i < namesList.size(); ++i) {
            System.out.println(namesList.get(i));
        }
        System.out.println();
        for (String name : namesList) {
            System.out.println(name);
        }

        names[0] = "Kim";
        scores[0] = 92;
        studentCount++;
        // System.out.println(names[51]); Exception 오류. 왜 하필 51일까. Area 51 ㄷㄷ

        System.out.println();
        // for (int i = 0; i < names.length; ++i) {
        for (int i = 0; i < studentCount; ++i) {
            // System.out.println(i);
            System.out.println(names[i]);
        }
    }
}
