package j0402_Exception;

public class Main {
    public static void main(String[] args) {
        int j = 10;
        try {
            j = -1;
            System.out.println(j);
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        } catch (java.lang.Exception e){
            e.printStackTrace();
            j = -1;
        } finally {
            if (j < 0) {
                j = 0;
            }
        }

        System.out.println(j);
    }
}
