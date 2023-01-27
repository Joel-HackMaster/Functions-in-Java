import java.util.Scanner;

public class Condicional_IF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero=0;
        System.out.print("Ingresa un numero entero: "); numero=scan.nextInt();
        if(numero<0) System.out.println("El numero es negativo");
        else if(numero>0) System.out.println("El numero es positivo");
        else System.out.println("El numero es 0");
    }
}