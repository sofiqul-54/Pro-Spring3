package com.example.demo;

class X {
    static int i;
    int j;

    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(
                x1.i + " " + x1.j + " " + x2.i + " " + x2.j
        );

    int a[] = {1,2,3,4,5};
    for (int e = 0; e<5; e+=2){
        System.out.println(a[e]);
    }
    }


}
