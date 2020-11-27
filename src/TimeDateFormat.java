import java.util.Date;

public class TimeDateFormat {

    public static void main(String[] args) {

        double x = 690000000.0 / 7.0;
        String name = "cipek";
        int age = 69;
        double c = 1.0;

        System.out.printf("Cipek ma na imie %s i ma %d lat! \n" , name, age);

        System.out.printf("%, .6f\n", x);

        System.out.printf("%1$x\n", age);
        System.out.printf("%1$o\n", age);
        System.out.printf("%2$a\n", c, x);
        System.out.printf("%2$e\n", c, x);

        System.out.printf("%1$s %2$tA %2$te %2$tB %2$tY %2$tZ %2$tN" , "Data:", new Date());

    }
}
