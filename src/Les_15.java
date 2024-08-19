// Двумерный числовой массив

public class Les_15 {
    public static void main(String[] args) {
        int[][] nums = new int[10][5];  // сначала строки, потом колонки
        for (int i = 0; i < nums.length; i++) {  // выводим сначала строки
            for (int j = 0; j < nums[i].length; j++) {  // затем выводим колонки
                System.out.print(nums[i][j] + " ");  // пробел, чтобы не все слитно было
            }
            System.out.println();  // новая строка после одной итерации
        }
    }
}
