package basic;
import java.util.Random;
public class random {
        public static void main(String[] args) {
            Random gerador = new Random();
            int i;
            int ale;
            for (i = 0; i < 5; i++) {
               ale = gerador.nextInt(25);
               System.out.println(ale);
            }
            System.out.println("numeros");
        }
    }
