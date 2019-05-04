package com.example.demo;

public class Vowel {
    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
        
        Vowel vowel = new Vowel();
        Vowel vowel1 = vowel;
        vowel.var = 'i';
        vowel1.var = '0';
        System.out.println(var1+","+var2);
        System.out.println(vowel.var+","+vowel1.var);
    }
}
