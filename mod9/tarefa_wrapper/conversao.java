import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        
        int idade = sc.nextInt();
        byte idadeEmByte = (byte) idade;
        System.out.println("Sua idade em byte " + idadeEmByte);
    }
    
}
