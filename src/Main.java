public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 98;
        double heightM = 1.87 ;
        int miles = service.calculate(weightKg, heightM); // должно получиться 28
        System.out.println(miles);
    }
}