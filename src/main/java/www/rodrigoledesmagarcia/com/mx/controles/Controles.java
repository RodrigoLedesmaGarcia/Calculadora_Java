package www.rodrigoledesmagarcia.com.mx.controles;

import www.rodrigoledesmagarcia.com.mx.modelo.*;

import java.util.Scanner;

public class Controles {
    public static void main(String[] args) {

        float operando1, operando2;
        int opcion;
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("___  ___ _____ _   _ _   _       _        ___________  _____ _____ _____ _   _  _____ _____ \n" +
                "|  \\/  ||  ___| \\ | | | | |     | |      |  _  | ___ \\/  __ \\_   _|  _  | \\ | ||  ___/  ___|\n" +
                "| .  . || |__ |  \\| | | | |   __| | ___  | | | | |_/ /| /  \\/ | | | | | |  \\| || |__ \\ `--. \n" +
                "| |\\/| ||  __|| . ` | | | |  / _` |/ _ \\ | | | |  __/ | |     | | | | | | . ` ||  __| `--. \\\n" +
                "| |  | || |___| |\\  | |_| | | (_| |  __/ \\ \\_/ / |    | \\__/\\_| |_\\ \\_/ / |\\  || |___/\\__/ /\n" +
                "\\_|  |_/\\____/\\_| \\_/\\___/   \\__,_|\\___|  \\___/\\_|     \\____/\\___/ \\___/\\_| \\_/\\____/\\____/ \n" +
                "                                                                                            \n" +
                "                                                                                            ");
        System.out.println("                                   CALCULADORA");
        System.out.println("+-------------------------+-------------------------------+----------------------------+");
        System.out.println("| PRESIONE 1 PARA SUMAR   | PRESIONE 2 PARA RESTAR        | PRESIONE 3 PARA MULTIPLICAR|");
        System.out.println("|-------------------------+-------------------------------+----------------------------|");
        System.out.println("| PRESIONE 4 PARA DIVIDIR | PRESIONE 5 PARA RAIZ CUADRADA | PRESIONE 6 PARA SALIR      |");
        System.out.println("|-------------------------+-------------------------------+----------------------------|");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                Suma suma = new Suma();
                System.out.print("Ingrese el primer numero a sumar: ");
                operando1 = input.nextFloat();
                System.out.print("Ingrese el segundo numero a sumar: ");
                operando2 = input.nextFloat();
                suma.setOperando1(operando1);
                suma.setOperando2(operando2);
                suma.setResultado(operando1 + operando2);
                System.out.println(suma.verResultadoSuma());
                break;
            case 2:
                Resta resta = new Resta();
                System.out.print("Ingrese el primer numero a restar: ");
                operando1 = input.nextFloat();
                System.out.print("Ingrese el segundo numero a restar: ");
                operando2 = input.nextFloat();
                resta.setOperando1(operando1);
                resta.setOperando2(operando2);
                resta.setResultado(operando1 - operando2);
                System.out.println(resta.verResultadoResta());
                break;
            case 3:
                Multiplicacion multiplicacion = new Multiplicacion();
                System.out.print("Ingrese el primer numero a Multiplicar: ");
                operando1 = input.nextFloat();
                System.out.print("Ingrese el segundo numero a Multiplicar: ");
                operando2 = input.nextFloat();
                multiplicacion.setOperando1(operando1);
                multiplicacion.setOperando2(operando2);
                multiplicacion.setResultado(operando1 * operando2);
                System.out.println(multiplicacion.verResultadoMultiplicacion());
                break;
            case 4 :
                Division division = new Division();
                System.out.print("Ingrese el primer numero a Dividir: ");
                operando1 = input.nextFloat();
                System.out.print("Ingrese el segundo numero a Dividir: ");
                operando2 = input.nextFloat();
                division.setOperando1(operando1);
                division.setOperando2(operando2);
                division.setResultado(operando1 / operando2);
                System.out.println(division.verResultadoDivision());
                break;
            case 5:
                RaizCuadrada raizCuadrada = new RaizCuadrada();
                System.out.print("Ingrese el número del que quiere saver su raiz cuadrada: ");
                operando1 = input.nextFloat();
                raizCuadrada.setOperando1(operando1);
                raizCuadrada.setResultado(operando1);
                float resultado = (float) Math.sqrt(operando1);
                System.out.println(resultado);
            case 6:
                System.out.println("Adios, hasta la proxima");
                break;
            default:
                throw new RuntimeException("Esa opcion no existe");
        }

    }
}
