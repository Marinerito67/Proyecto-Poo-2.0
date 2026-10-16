/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
import java.util.Scanner;

public class Selec_Mul_Pregunta extends Pregunta {
    private String[] elecciones;
    private int respuestaCorrecta; 

    public Selec_Mul_Pregunta(String text, String[] elecciones, int respuestaCorrecta, int peso) {
        super(text, peso);
        this.elecciones = elecciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public boolean buscar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        
        for (int i = 0; i < elecciones.length; i++) {
            char letra = (char) ('a' + i);
            System.out.println("  " + letra + ". " + elecciones[i]);
        }

        int indexUsuario = -1;
        
        while (indexUsuario < 0 || indexUsuario >= elecciones.length) {
            try {
                System.out.print("ingrese la letra de su eleccion: ");
                String input = sc.nextLine().trim().toLowerCase();
                
                if (input.length() != 1) {
                    throw new IllegalArgumentException("Debe ingresar una sola letra.");
                }
                
                indexUsuario = input.charAt(0) - 'a'; 
                
                if (indexUsuario < 0 || indexUsuario >= elecciones.length) {
                    throw new IllegalArgumentException("Letra fuera de rango.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                indexUsuario = -1; 
            }
        }

        boolean correcta = (indexUsuario == respuestaCorrecta);
        if (correcta) {
            System.out.println("correcta!");
        } else {
            System.out.println("no, la respuesta correcta es " + elecciones[respuestaCorrecta]);
        }
        
        return correcta;
    }
}
