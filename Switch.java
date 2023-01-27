import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String estacion = "Primavera";

        switch (estacion){
            case "Primavera": System.out.println("Bonita estacion"); break;
            case "Verano": System.out.println("Muy caluroso"); break;
            case "Otoxo": System.out.println("Bonita estacion"); break;
            case "Invierno": System.out.println("Muy frio"); break;
            default: System.out.println("Esa no es una estacion");
        }
    }
}