import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double Numero = 0;

        System.out.println("Ingrese un numero: ");
        Numero = sc.nextDouble();

        if (Numero >= 0) {
            System.out.println("El numero " + Numero + " es positivo");
        } 
        else{
            System.out.println("El numero " + Numero + " es negativo");
        }

    }
}
