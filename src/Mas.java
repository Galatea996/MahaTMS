public class Mas {
    public static void main(String[] args) {
        int max = 0;
        // int min = 0;
        // int max = mas [0];
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
            for (int i = 1; i < mas.length; i++) {
                // if (min > mas[i]);
                // min = mas[i];
            if (max < mas[i]) ;
            max = mas[i];
        }
        System.out.println("Max is " + max);
            //System.out.println("Min is " + min);
    }
}
