import ru.netology.javaqa.sqrmvn.SqrtService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SqrtService service = new SqrtService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);
        System.out.println(expected + " ==?== " + actual);

    }
}
