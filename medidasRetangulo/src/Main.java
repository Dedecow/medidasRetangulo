import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Locale locale;

    public static void main(String[] args) {

        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner(System.in);
        Double area, perim, diag, base, altura;

        System.out.println("Digite a base e a altura com separador de decimais formato americano - ponto: ");
        base = sc.nextDouble();
        altura = sc.nextDouble();
        area = base * altura;
        perim = base + base + altura + altura;
        diag = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.printf("AREA = %.4f m2 %n", area );
        System.out.printf("PERIMETRO = %.4f m %n", perim );
        System.out.printf("DIAGONAL = %.4f m", diag );
    }
}