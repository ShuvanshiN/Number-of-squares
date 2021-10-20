package ru.netology.sqr;

public class SQRService {

    public int squaresAreCertainRangeOfNumbers(int initial, int past) {
        int counter = 0;
        for (int i = 10; i <= 99; i++  ) {

            if (i * i >= initial && i * i <= past){

        counter = counter +1;
        }
}
    return counter;
          }
    }


