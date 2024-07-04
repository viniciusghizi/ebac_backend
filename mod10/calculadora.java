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
        System.out.println(situacaoAluno(media));
        

    }

    public static double calcularMedia(double nota1, double nota2, double nota3,double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
    public static String situacaoAluno(double media) {
        if (media >= 7.0) {
            return "Você foi aprovado!! Sua nota foi " + media;
        } else if ( media >= 5.0) {
            return "Você está em recuperação. Sua nota foi: " + media;
        } else {
            return "Você está reprovado :( Estude mais e tente novamente. Sua nota foi " + media;
        }
    }
}