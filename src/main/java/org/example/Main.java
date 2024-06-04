package org.example;

import java.util.Random;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Conditons


        // sintaksis(sert)
//        {
//
//
//        }
//        int num1 = 4;
//        int num2 = 4;
//
//        if (num1 == num2)
//        {
//            System.out.println("Beraberdi");
//        }else
//        {
//            System.out.println("Beraber deyil");
//        }


//        int num1 = 3;
//        int num2 = 4;
//
//        if (num1 > num2){
//            System.out.println(num1 +" ededi " + num2 + "den boyukdu");
//        }else if(num1 < num2)
//        {
//            System.out.println(num1 +" ededi " + num2 + "den kicikdi");
//        }else{
//            System.out.println(num1 +" ededi ve" + num2 + " ededi beraberdi");
//        }


//        int age = 18;
//
//        if (age >= 18 && age <= 65) // true true false
//        {
//            System.out.println("Siz qeydiyyatdan kece bilersiniz");
//        }else{
//            System.out.println("Ugursuz qeydiyyat");
//        }


//        boolean IsStudent =  true;
//        boolean IsTeacher = false;
//
//
//        if (IsStudent|| IsTeacher)
//        {
//            System.out.println("Siz daxil ola bilersiniz");
//        }else {
//            System.out.println("Giris qadagandir");
//        }


//        int age = 90;
//        boolean isStudent = true;
//
//        if (age < 65 || age > 18  && isStudent && 4 != 3)
//        {
//            System.out.println("Duzdu");
//        }else {
//            System.out.println("Sehfdi");
//        }
        // phoneNumber || userName || email && password


//        String userName = "elvin";
//        String password = "elvin@123";
//        if (userName == "elvin" && password == "elvin@123")
//        {
//            System.out.println("Xos geldiniz");
//        }else {
//            System.out.println("Email adi ve sifre yanlisdir");
//        }


//        int number1 = 5;
//        int number2 = 1;
//
//        if (number1 % 2 == 0)
//        {
//            System.out.println("Odd");
//        }else{
//            System.out.println("Even");
//        }

//        int number = 4;
//        int a = 3;
//        int b = 4;
//        int c = a++;
//        b = ++a;
//        a = b + b++; // 5 + 5
//        System.out.println(a); // 10 10 9  9   11
//        System.out.println(b); // 6 5   5  5   6
//        System.out.println(c); // 3 3   3  3   3


//        int a = 3;
//        int b = a++ - --a;
//        int c =b-- - --a + ++b;
//        int d = c++ + a-- - b--;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);


        int point = 67;

//        if(point >= 51 && point <= 60)
//        {
//            System.out.println("E");
//        }else if (point >= 61 && point <= 70) {
//            System.out.println("D");
//        }else if (point >= 71 && point <= 80) {
//            System.out.println("C");
//        }else if (point >= 81 && point <= 90) {
//            System.out.println("B");
//        }else if (point >= 91 && point <= 100) {
//            System.out.println("A");
//        }else{
//            System.out.println("Kesildin");
//        }


//        switch (1)
//        {
//            case 1:
//                System.out.println("Bazar ertesi");
//                break;
//            case 2:
//                System.out.println("Cersenbe axsami");
//                break;
//            case 3:
//                System.out.println("Cersenbe");
//                break;
//            case 4:
//                System.out.println("Cume axsami");
//                break;
//            case 5:
//                System.out.println("Cume");
//                break;
//            case 6:
//                System.out.println("Senbe");
//                break;
//            case 7:
//                System.out.println("Bazar");
//                break;
//            default:
//                System.out.println("Bele bir gun yoxdu");
//                break;
//        }
//
//        switch ("Salam"){
//            case "1":
//
//                break;
//        }


//        String[] students = {"Zaur","Sebuhi","Ayxan","Rehman","Cingiz","Ilham"};
////        System.out.println(students[0]);
////        System.out.println(students[1]);
////        System.out.println(students[2]);
////        System.out.println(students[3]);
//
//
//        for (int i = 0; i < students.length; i++){
//            System.out.println(students[i]);
//        }

//        int[] numbers1 = {1,2,5,3,4,44,76};
//        int[] numbers2 = {1,2,3,44,76,5};
//
//        int num1 = 0;
//        int num2 = 0;
//
//        for (int j = 0; j < numbers1.length; j ++)
//        {
//            num1 += numbers1[j];
//        }
//
//        for (int j = 0; j < numbers2.length; j ++)
//        {
//            num2 += numbers2[j];
//        }
//
//        System.out.println(num1 - num2);

//        Random rnd = new Random();
//        int randomNumber = rnd.nextInt(1,100); // 4
//
//        int myNum = 5;
//        int count = 0;
//
//        while (myNum != randomNumber) // true true true true false
//        {
//            randomNumber = rnd.nextInt(1,100);
//            count++;
//        }
//
//        System.out.println(myNum + " ededini " + count + " defeye tapdi.");

//        int n = 0;
//        int m = 0;
//
//        while (m != n){
//            System.out.println("Hellooo");
//        }
//
//
//        do {
//            System.out.println("Salam");
//        } while (false);



        Random rnd = new Random();
        int randomNumber = rnd.nextInt(1,100); // 4
        int count = 0;
        int[] numbers = {2, 5, 7};
        for (int i = 0; i < numbers.length; i++)
        {
            while (numbers[i] != randomNumber)
            {
                randomNumber = rnd.nextInt(1,100);
                count++;
            }
            System.out.println(numbers[i] + " ededini " + count + " defeye tapdi."); // 2 edi 4 defeye tapildi
            count = 0;
        }



        // 2 ededi 5 defeye tapildi
        // 5 ededi 1 defeye tapildi
        // 7 ededi 100 defeye tapildi
    }
}