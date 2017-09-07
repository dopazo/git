import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa la altura de la piramide");

        Scanner leer = new Scanner(System.in); //scanner para leer, equivalente a scanf
        System.out.print("Ingrese un numero: ");
        Integer h = leer.nextInt();
        //System.out.println(num);

        Piramide p = new Piramide(h);
        p.imprime();
        //System.out.println("la piramide tiene altura "+ p.Altura(num));
    }

}