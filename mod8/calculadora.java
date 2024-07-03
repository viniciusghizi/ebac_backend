import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1= sc.nextDouble();
        
        System.out.println("Digite a segunda nota");
        double nota2= sc.nextDouble();

        System.out.println("Digite a terceira nota");
        double nota3= sc.nextDouble();

        System.out.println("Digite a quarta  nota");
       double nota4= sc.nextDouble();

        double media = calcularMedia(nota1,nota2,nota3,nota4);
        System.out.println("A média é: ");
        System.out.println(media);
        
    }
    public static double calcularMedia(double nota1, double nota2, double nota3,double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}
