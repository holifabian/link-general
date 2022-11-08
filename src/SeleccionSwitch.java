import java.util.Scanner;

/**
 * Programa para devolver el dia de la semana en palabras dado un numero del 1 al 7
 * programa creado por Fabián Galarza
 */

public class SeleccionSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 7");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("error");


        }
    }
}
