public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        int myBMI = service.calculate(1.67, 105);
        System.out.println(myBMI);
    }
}