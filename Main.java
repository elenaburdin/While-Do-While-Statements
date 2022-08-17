package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for (int i = 6; i != 6; i++) {
//            System.out.println("Count value is " + i);
//        }

//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//
//        } while (count != 6);
//
//        int number = 4;
//        int finishNumber = 20;
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Eben number " + number);
//        }


        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            evenNumbersFound++;
            System.out.println("Eben number " + number);
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);

    }
    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}