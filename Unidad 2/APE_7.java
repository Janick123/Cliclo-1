import java.util.Scanner;

public class APE_7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        double notaIndividual, notaGrupal, notaEvalFinal, promedio;
        String nivelDesempeno = "";
        String estadoFinal = "";

        // Entrada de datos
        System.out.println("=== CÁLCULO DE NOTA FINAL - UNIDAD 1 ===");
        System.out.print("Ingrese la calificación de la evaluación individual: ");
        notaIndividual = entrada.nextDouble();

        System.out.print("Ingrese la calificación del trabajo grupal: ");
        notaGrupal = entrada.nextDouble();

        System.out.print("Ingrese la calificación de la evaluación final: ");
        notaEvalFinal = entrada.nextDouble();

        // Validación de rango: ninguna calificación menor que 0 ni mayor que 10
        if ((notaIndividual >= 0 && notaIndividual <= 10) && 
            (notaGrupal >= 0 && notaGrupal <= 10) && 
            (notaEvalFinal >= 0 && notaEvalFinal <= 10)) {

            // Cálculo del promedio ponderado (30%, 30% y 40%)
            promedio = (notaIndividual * 0.30) + (notaGrupal * 0.30) + (notaEvalFinal * 0.40);

            // Estructura condicional múltiple para determinar el nivel de desempeño
            if (promedio >= 9.00) {
                nivelDesempeno = "Excelente";
            } else if (promedio >= 8.00) {
                nivelDesempeno = "Muy bueno";
            } else if (promedio >= 7.00) {
                nivelDesempeno = "Bueno";
            } else if (promedio >= 5.00) {
                nivelDesempeno = "Regular";
            } else {
                nivelDesempeno = "Deficiente";
            }

            // Estructura condicional doble para determinar si aprobó o reprobó
            if (promedio >= 7.00) {
                estadoFinal = "Aprobado";
            } else {
                estadoFinal = "Reprobado";
            }

            // Salida de resultados
            System.out.println("\n--- RESULTADOS DEL ESTUDIANTE ---");
            System.out.println("Calificación evaluación individual: " + notaIndividual);
            System.out.println("Calificación trabajo grupal: " + notaGrupal);
            System.out.println("Calificación evaluación final: " + notaEvalFinal);
            System.out.printf("Promedio ponderado: %.2f\n", promedio);
            System.out.println("Nivel de desempeño: " + nivelDesempeno);
            System.out.println("Estado final: " + estadoFinal);

            // Condicionales simples para los mensajes adicionales
            if (promedio < 7.00) {
                System.out.println("El estudiante requiere refuerzo académico");
            }

            if (promedio >= 9.00) {
                System.out.println("¡Felicitaciones! Rendimiento sobresaliente");
            }

        } else {
            System.out.println("Error: Ninguna calificación puede ser menor que 0 ni mayor que 10.");
        }

        
    }
}