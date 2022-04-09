public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double index = service.calculate(90, 1.88);
        System.out.println(index);
    }
}
