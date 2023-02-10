package ru.netology.javaqa.sqrmvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.sqrmvn.SqrtService;

public class SqrtServiceTest {

    @Test
    public void shouldCalcExact() {
        SqrtService service = new SqrtService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        SqrtService service = new SqrtService();

        int expected = 2;
        int actual = service.calcSqrt(250, 300);

        Assertions.assertEquals(expected, actual);

    }

}
