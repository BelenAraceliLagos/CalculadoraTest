import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //pedir dos numeros al usuario
        System.out.println("Ingrese un número: ");
        Scanner n1 = new Scanner(System.in);
        int numero1 = n1.nextInt();

        System.out.println("Ingrese otro número: ");
        Scanner n2 = new Scanner(System.in);
        int numero2 = n2.nextInt();

        System.out.println("Escriba una operación matemática(+, -, x, :)");
        Scanner op = new Scanner(System.in);
        String operacion = op.nextLine();

        if(operacion.equals("+")){
            int suma = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + suma);
        }

        if(operacion.equals("-")){
            int resta = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resta);
        }

        if(operacion.equals("x")){
            int multiplicacion = numero1 * numero2;
            System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        }

        if(operacion.equals(":")){
            int division = numero1 / numero2;
            System.out.println("El resultado de la división es: " + division);
        }






    }
}