/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
import java.util.Scanner;

public class Resp_Cortas_Pregunta extends Pregunta {
    private String respuestaCorrecta;

    public Resp_Cortas_Pregunta(String text, String respuestaCorrecta, int peso) {
        super(text, peso);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public boolean buscar() {
        Scanner sc = new Scanner(System.in);
        String input = "";

        while (input.isEmpty()) {
            try {
                System.out.print(text + ": ");
                input = sc.nextLine().trim();
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("La respuesta no puede estar vacía.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        boolean correcta = input.equalsIgnoreCase(respuestaCorrecta);
        if (correcta) {
            System.out.println("correcta!");
        } else {
            System.out.println("no, la respuesta correcta es " + respuestaCorrecta);
        }
        
        return correcta;
    }
}
