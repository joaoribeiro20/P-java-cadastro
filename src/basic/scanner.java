package basic;
import java.util.Scanner;

public class scanner { // TUDO FORA DESSA CLASS É UMA NOVA CLASS, POREM DENTRO DELA SÃO FORMADOS METODOS
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("digite qualquer numero");
        int valor = leitor.nextInt();
        System.out.println(valor);
        //////////////////////////////////////////////
        System.out.println("digite qualquer palavra");
        String letra = leitor.next();
        System.out.println(letra);
        ///////////////////////////////////////////////
        boolean validacao = leitor.hasNext();
        System.out.println(validacao);
    }
}

