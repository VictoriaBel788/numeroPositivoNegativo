import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double numero = 0;

        System.out.println("Ingrese un numero: ");
        numero = sc.nextDouble();

        if (numero >= 0) {
            System.out.println("El número " + numero + " es positivo");
        } 
        else{
            System.out.println("El número " + numero + " es negativo");
        }

    }
}
