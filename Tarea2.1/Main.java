import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa la altura de la piramide");

        Scanner leer = new Scanner(System.in); //scanner para leer, equivalente a scanf
        System.out.print("Ingrese un numero: ");
        Integer h = leer.nextInt();
        //System.out.println(num);
        System.out.print("Normal o invertida?(0 para normal, 1 para invertida): ");
        Integer inv = leer.nextInt();
        if (inv==0){
            Piramide p = new Piramide(h);
            p.imprime();
        }
        else if(inv==1){
            PiramideInv p = new PiramideInv(h);
            p.imprime();
        }

    }

}