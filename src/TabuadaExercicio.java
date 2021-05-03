/*
Construa a tabela de multiplicação de números de 1 a 10 (ex.: 1 x 1 = 1, 1 x 2 = 2, etc.).
 */

public class TabuadaExercicio {
    public static void main(String[] args) {
        for(int numero = 0; numero <= 10; numero++){
            for(int contador = 0; contador <=10; contador++){
                System.out.println(numero*contador);
            }

        }

    }
}
