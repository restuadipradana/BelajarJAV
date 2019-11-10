package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nilaiInt = 450;
        System.out.println("nilai int = " + nilaiInt);

        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);

        //casting pembagian
        int a = 10;
        float b = 4;

        float c = a/b;

        System.out.printf("%d / %f = %f\n", a, b, c);


        int x = 10;
        int y = 4;
        float z = (float)x/y; //ubah nilai jadi float
        System.out.printf("%d / %d = %f \n", x, y, z);


    }
}
