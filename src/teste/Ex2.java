package teste;

public class Ex2 {
    String palavra = "JAVA";

    public int[] verificarLetraA() {
        int indices[] = new int[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'A') {
                indices[i] = i;
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();

        int indices[] = ex2.verificarLetraA();
        System.out.print("A letra 'A' está presente nas posições: ");
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] != 0) {
                System.out.print(indices[i] + " ");
            }
        }
    }
}
