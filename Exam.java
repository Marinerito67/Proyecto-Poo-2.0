/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
public class Exam {
    private Pregunta[] preguntas; 
    private int contador; 

    public Exam() {
        this.preguntas = new Pregunta[10]; 
        this.contador = 0;
    }

    public void agregaPregunta(Pregunta p) {
        try {
            if (contador >= preguntas.length) {
                throw new ArrayIndexOutOfBoundsException("Límite máximo de 10 preguntas alcanzado."); 
            }
            preguntas[contador] = p;
            contador++;
        } catch (Exception e) {
            System.out.println("Error del sistema: " + e.getMessage());
        }
    }

    public int darExam() {
        int puntajeObtenido = 0;
        int puntajeTotal = 0;

        for (int i = 0; i < contador; i++) {
            Pregunta p = preguntas[i];
            puntajeTotal += p.getPeso();
            
            boolean esCorrecta = p.buscar();
            if (esCorrecta) {
                puntajeObtenido += p.getPeso();
            }
        }

        if (puntajeTotal == 0) return 0;

        double porcentaje = ((double) puntajeObtenido / puntajeTotal) * 100;
        return (int) Math.round(porcentaje);
    }
}
