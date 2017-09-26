import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

    public static String menu() {
        StringBuffer sb = new StringBuffer();
        sb.append("¿Qué desea dibujar?\n");
        // FigurasGeometricas es un enum
        Object[] fgs = FigurasGeometricas.values();
        for(Integer i=0; i<fgs.length; i++) {
            sb.append(i+1);
            sb.append(": ");
            sb.append(fgs[i]);
            sb.append("\n");
        }
        sb.append("Presione 0 para salir.");
        return sb.toString();
    }

    public static void main(String[] args) {
        // variables
        Integer option, ancho, alto;
        PropFigs fg;
        Collection c;
        c = new ArrayList();
        fg = new Rectangulo(1,1);
        // paso 1: creo el scanner que lee lo que escribe el usuario :)
        Scanner scanner = new Scanner(System.in);
        // paso 2: creo el menú y espero la opción del usuario
        do {
            System.out.println(menu());
            option = scanner.nextInt();
            // paso 3: pregunto las dimensiones de la figura a dibujar
            //         y la creo
            if ((option - 1) == FigurasGeometricas.CUADRADO.ordinal()) {
                System.out.println("Ingrese el tamaño del lado: ");
                ancho = alto = scanner.nextInt();
                fg = new Cuadrado(ancho);
            } else if ((option - 1) == FigurasGeometricas.TRIANGULO.ordinal()) {
                System.out.println("Ingrese el tamaño de la base: ");
                ancho = alto = scanner.nextInt();
                fg = new Triangulo(ancho);
            } else if ((option - 1) == FigurasGeometricas.RECTANGULO.ordinal()) {
                System.out.println("Ingrese el tamaño del ancho: ");
                ancho = scanner.nextInt();
                System.out.println("Ingrese el tamaño del alto: ");
                alto = scanner.nextInt();
                fg = new Rectangulo(ancho, alto);
            } else if (option == 0) {
                Iterator iter = c.iterator();
                while (iter.hasNext()) {
                    Dibuja d = (Dibuja)iter.next();
                    d.dibuja();
                    System.out.println();
                }
            }
            // paso 4: agrego la figura a mi coleccion
            c.add(fg);
        } while (option != 0);
    }

}