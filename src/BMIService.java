public class BMIService {
    public int calculate(double height, int weight) {
        int BMI = (int) (weight / (height * height));
        return BMI;
    }
}
