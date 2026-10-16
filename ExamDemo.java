/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
/**
 *
 */
public class ExamDemo {
    
    public static void main(String args[]) {
        
        Exam miExam = new Exam();

        System.out.println("=================================================");
        System.out.println("  INICIANDO SIMULADOR DE EXAMEN: USEC vs BEAR");
        System.out.println("=================================================\n");

        // 1. Pregunta V/F
        miExam.agregaPregunta(new TFPregunta("El desarrollador principal de Escape from Tarkov es Battlestate Games", true, 1));
        
        // 2. Pregunta Selección Múltiple
        String mapasElec[] = {"Woods", "Interchange", "Customs", "Factory", "Reserve"};
        miExam.agregaPregunta(new Selec_Mul_Pregunta("¿En cual de estos mapas aparece el jefe llamado Killa?", mapasElec, 1, 1)); // 1 es Interchange
        
        // 3. Pregunta Respuesta Corta
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("¿Como se llama la faccion PMC de origen occidental?", "USEC", 1));
        
        // 4. Pregunta V/F
        miExam.agregaPregunta(new TFPregunta("El estado 'MIA' (Missing in Action) significa que lograste extraer exitosamente", false, 1));
        
        // 5. Pregunta Selección Múltiple
        String lootElec[] = {"Comida", "Arma", "Objeto medico valioso", "Llave"};
        miExam.agregaPregunta(new Selec_Mul_Pregunta("¿Qué tipo de objeto es el codiciado 'LedX'?", lootElec, 2, 1)); // 2 es Objeto médico
        
        // 6. Pregunta Respuesta Corta
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("¿Cómo se llama el jefe Scav del mapa Customs (que anda con guardias)?", "Reshala", 1));
        
        // 7. Pregunta Respuesta Corta (Esta vale 2 puntos)
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Nombra a la facción PMC de origen ruso en el juego", "BEAR", 2));
        
        // 8. Pregunta V/F
        miExam.agregaPregunta(new TFPregunta("El mapa 'The Lab' requiere obligatoriamente una keycard (tarjeta de acceso) para poder entrar", true, 1));
        
        // 9. Pregunta Selección Múltiple
        String monedaElec[] = {"Rublos", "Euros", "Dólares", "Bitcoins"};
        miExam.agregaPregunta(new Selec_Mul_Pregunta("¿Cuál es la moneda principal que utiliza el vendedor Peacekeeper?", monedaElec, 2, 1)); // 2 es Dólares

        // Dar el examen y reportar el puntaje
        int puntaje = miExam.darExam();
        
        System.out.println("\n=================================================");
        System.out.println("EXAMEN FINALIZADO. Procesando extracción...");
        System.out.println("Su resultado de supervivencia es: " + puntaje + "%");
        
        if (puntaje >= 60) {
            System.out.println("Estado: EXTRAÍDO CON ÉXITO (Sobreviviste a Tarkov).");
        } else {
            System.out.println("Estado: K.I.A (Killed in Action). Perdiste todo tu loot.");
        }
        System.out.println("=================================================");
        
    }
}
