package teste;

public class Ex3 {

    int indice = 12;
    int soma = 0;

    public void soma() {
        int k = 1;
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
    }

    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();

        ex3.soma();
        System.out.println(ex3.soma);
    }
}
