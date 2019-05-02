package com.shivanika;

public class Main {

    public static  void main(String[] args) {
        int number = 1;
        int finishnumber =15;
        int evenNumbersFound = 0;
        while(number <= finishnumber){
            if(!IsEvenNumber(number)){
                number++;
                continue;
            }

            System.out.println("Even Number  " + number);
            number++;
            evenNumbersFound++;
            if (evenNumbersFound >=5){
                break;
            }
        }
        System.out.println("total even numbers fount ="+ evenNumbersFound);


    }
    public static boolean IsEvenNumber(int number){
if ((number %2) ==0){
    return true;
}else{
    return false;
}
    }
}
OUTPUT:
Even Number  2
Even Number  4
Even Number  6
Even Number  8
Even Number  10
total even numbers fount =5

Process finished with exit code 0

