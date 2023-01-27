import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero=0,n=0;
        System.out.print("Ingresa un numero entero menor a 3: "); numero=scan.nextInt();

        do{
            n++;
            System.out.println(n+" iteracion");
            numero++;
            System.out.println(">Numero Actual: "+numero);
        }while(numero<3);
    }
}