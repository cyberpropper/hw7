import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] weight = new int []{1, 2, 3};
        double [] doubleWeight = {1.57, 7.654, 9.986};
        String [] stringWeight = new String []{"Молоко", "Мясо", "Майонез"};
        System.out.print(weight[0] + "," + weight[1] + "," + weight[2]);
        System.out.println();
        System.out.print(doubleWeight[0] + "," + doubleWeight[1] + "," + doubleWeight[2]);
        System.out.println();
        System.out.print(stringWeight[0] + "," + stringWeight[1] + "," + stringWeight[2]);
        System.out.println();
        System.out.print(weight[2] + "," + weight[1] + "," + weight[0]);
        System.out.println();
        System.out.print(doubleWeight[2] + "," + doubleWeight[1] + "," + doubleWeight[0]);
        System.out.println();
        System.out.print(stringWeight[2] + "," + stringWeight[1] + "," + stringWeight[0]);
        System.out.println();

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i]++;
            }
        }
        System.out.println(Arrays.toString(weight));

    }
}