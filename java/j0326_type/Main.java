public class Main{
    public static void main(String[] args){
        int i = 0; Integer cInt;
        float f = 0.1f; Float cFloat;
        double d = 0.001; Double cDouble;
        long l = 10L; Long cLong;
        byte b = 0x01; Byte cByte;
        boolean bool = true; Boolean cBool; // false
        
        cInt = Integer.valueOf(i); 
        cInt = Integer.parseInt("100"); // i other data type to integer type
        System.out.println(cInt);
        int j = cInt.intValue();
        System.out.println(j);


        String str = "500";
        float k = Float.parseFloat(str);

        System.out.println(k);
        String formattedFloat = String.format("%.3f", k);
        System.out.println(formattedFloat);
        // printf("%.3f", k);

        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE); // MAX_VALUE + 1 == MIN_VALUE
        System.out.println(Integer.MIN_VALUE); // MIN_VALUE - 1 == MAX_VALUE

        System.out.println(Math.abs(Integer.MIN_VALUE) >= 0);
        System.out.println(Math.abs(Integer.MIN_VALUE));

        System.out.println(Long.MAX_VALUE); // MAX_VALUE + 1 == MIN_VALUE
        System.out.println(Long.MIN_VALUE);

        System.out.println(Integer.SIZE);

        i = 0; j = 3; boolean flag = false;
        if ((i >= 1) || flag || ++j > 0){
            System.out.println("yes " + j);
        } else {
            System.out.println("no");
        }

        i = 0; j = 3; flag = true;
        if ((i >= 1) || flag || ++j > 0){
            System.out.println("yes " + j);
        } else {
            System.out.println("no");
        }

        i = 3;
        switch(i){
        case 0: System.out.println(i); break;
        case 1: System.out.println(i); break;
        case 2: System.out.println(i);
        case 3: System.out.println(i);
        case 4: System.out.println(i);
        default: System.out.println("default");
        }

        for (k = 0; k < 10; k++){
            System.out.println(k);
        }

        while (k < 11){
            System.out.println("k is less than 11");
        }
    }
}
