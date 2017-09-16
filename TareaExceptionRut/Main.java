public class Main {
    public static void main(String[] args){
        //usar try/catch
        try {
            System.out.println("Primer Rut 19.666.753-9: ");
            CarnetIdentidad ci1 = new CarnetIdentidad(196667539,9);
        } catch(DigitoVerificadorException dve) { // si "atrapa" un error...
            System.out.println("El RUT ingresado es inválido");
            System.err.println("RUT INVALIDO");
        }

        try {
            System.out.println("Segundo Rut 19.666.753-1");
            CarnetIdentidad ci2 = new CarnetIdentidad(196667531, 1);
        } catch (DigitoVerificadorException dve){ // si "atrapa" un error...
            System.out.println("El RUT ingresado es inválido");
            System.err.println("RUT INVALIDO");
        }
    }
}
