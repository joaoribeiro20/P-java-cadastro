package exemplo.dio;
import java.util.Scanner;


public class Principalexecutacodigo {
    public static void main(String[] args) {
        Usuario usuariop = new Usuario();
        Scanner ler = new Scanner(System.in);

        usuariop.setNome("joao");
        System.out.println(usuariop.getNome());

        System.out.println("Digite o seu nome e primeiro sobrenome:");
        String nome = ler.nextLine();
        usuariop.setNome(nome);

        System.out.println("Digite o seu gmail:");
        String gmail = ler.nextLine();
        usuariop.setGmail(gmail);

        System.out.println("Digite um nome para ser seu login:");
        String login = ler.nextLine();
        usuariop.setLogin(login);

        System.out.println("Digite sua senha:");
        int chave = ler.nextInt();
        usuariop.setChave(chave);

        System.out.println("Os dados cadastrados foram: -----");
        System.out.println("nome pessoal: -----" + usuariop.getNome());
        System.out.println("gmail: -----" + usuariop.getGmail());
        System.out.println("login de acesso: -----" + usuariop.getLogin());
        System.out.println("senha: -----" + usuariop.setChave(chave));
    }
}

        /*System.out.println("O nome cadastrado foi:" + usuariop.getNome());
        System.out.println("deseja continuar:");
        String opcao = ler.nextLine();
        if (opcao == ("sim")){
            System.out.println("ok");
        }
        if (opcao == ("nao")){
            System.out.println("foi um prazer " + usuariop.getNome());
        }
        if (opcao.equals("sim")){
            System.out.println("ok");
        }
        if (opcao.equals("nao")){
            System.out.println("foi um prazer " + usuariop.getNome());
        }*/


