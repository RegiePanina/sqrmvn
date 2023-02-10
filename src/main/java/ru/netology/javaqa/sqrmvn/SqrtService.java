package ru.netology.javaqa.sqrmvn;

public class SqrtService {

    public int calcSqrt(int x, int y) {

        int low = 10;
        int high = 99;
        int counter = 0;
        int sqr = 0;
        for (int i = low; i <= high; i++) {
            sqr = i * i;
            if (sqr >= x && sqr <= y) {
                counter = counter + 1;

            }
        }
        return counter;
    }
}


