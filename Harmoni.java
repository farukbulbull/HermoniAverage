public class Harmoni {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Örnek dizi
        double harmonicSum = 0.0;

        for (int number : numbers) {
            harmonicSum += 1.0 / number;
        }

        double harmonicAverage = numbers.length / harmonicSum;
        System.out.println("Dizideki sayıların harmonik ortalaması: " + harmonicAverage);
    }
}
