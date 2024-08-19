// Строковый двумерный массив

public class Les_16 {
    public static void main(String[] args) {
        String[][] words = {
                {"cat", "rat", "bat"},
                {"male", "female"}
        };
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.print(words[i][j] + " ");
            }
            System.out.println();
        }
    }
}
