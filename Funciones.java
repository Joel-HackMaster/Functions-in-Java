import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y, z;
        System.out.print("Ingresa el valor de X: "); x = scan.nextInt();
        System.out.print("Ingresa el valor de Y: "); y = scan.nextInt();
        System.out.print("Ingresa el valor de Z: "); z = scan.nextInt();
        int sumax = suma(x,y,z);
        System.out.println("Ingresa el valor de la suma: "+sumax);

        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        miCoche.AumentarPuertas();
        miCoche.AumentarPuertas();
        System.out.print("El numero de puertas es: "+miCoche.puertas);
    }
    public static int suma (int x, int y, int z){
        int suma;
        suma = x +y+z;
        return suma;
    }
}
class Coche{
    public int puertas = 4;
    public void AumentarPuertas(){
        this.puertas++;
    }
}