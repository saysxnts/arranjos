import java.util.Arrays;

public class Arranjo {
    public int menor(Integer[] arr) {
        return Arrays.stream(arr)
                .min(Integer::compare)
                .orElseThrow(()->new IllegalArgumentException("O Array não pode ser nulo."));
    }

    public int maior(Integer[] arr) {
        return Arrays.stream(arr)
                .max(Integer::compare)
                .orElseThrow(()->new IllegalArgumentException("O Array não pode ser nulo."));
    }

    public int soma(Integer[] arr) {
        return Arrays.stream(arr)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public int repeticoes(Integer[] arr, int numero) {
        return (int) Arrays.stream(arr)
                .filter(n -> n.equals (numero))
                .count();
    }

    public void exibirResultados(Integer[] arr) {
        System.out.println("Array fornecido:" + Arrays.toString(arr));
        System.out.println("Menor número: " + menor(arr));
        System.out.println("Maior número: " + maior(arr));
        System.out.println("Soma dos números: " + soma(arr));
        System.out.println("O número 940 repete " + repeticoes(arr, 940) + " vezes.");
    }

    public static void main(String[]args){
        Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
        Arranjo arranjo = new Arranjo();
        arranjo.exibirResultados(a);
    }
}
