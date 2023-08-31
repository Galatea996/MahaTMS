public class test2 {
    public static void main(String[] args) {
        int[][] mas = {{1, 2, 3, 9}, {4, 5, 6, 7}, {4, 6, 8, 7}, {4, 3, 8, 7}};
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {   //убрать
                if (j == mas.length - i - 1) {  //убрать
                    sum = sum + mas[i][j]; //sum = sum + mas[i][mas.length - i - 1]
                }
            }
        }
        System.out.println(sum);
    }
}