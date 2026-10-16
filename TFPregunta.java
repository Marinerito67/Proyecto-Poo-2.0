/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
import java.util.Scanner;

public class TFPregunta extends Pregunta {
    private boolean respuestaCorrecta;

    public TFPregunta(String text, boolean respuestaCorrecta, int peso) {
        super(text, peso);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public boolean buscar() {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        boolean respuestaUsuario = false;

        while (!valid) {
            try {
                System.out.print(text + " (ingrese T o F): ");
                String input = sc.nextLine().trim().toUpperCase();

                if (input.equals("T")) {
                    respuestaUsuario = true;
                    valid = true;
                } else if (input.equals("F")) {
                    respuestaUsuario = false;
                    valid = true;
                } else {
                    throw new IllegalArgumentException("Entrada inválida. Solo se permite 'T' o 'F'.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        boolean correcta = (respuestaUsuario == respuestaCorrecta);
        if (correcta) {
            System.out.println("correcta!");
        } else {
            System.out.println("no, la respuesta " + (respuestaCorrecta ? "correcta es T" : "es falsa"));
        }
        
        return correcta;
    }
}
