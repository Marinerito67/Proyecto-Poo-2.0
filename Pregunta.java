/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
public abstract class Pregunta {
    protected int peso; 
    protected String text; 

    public Pregunta(String text, int peso) {
        this.text = text;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getText() {
        return text;
    }

    public abstract boolean buscar();
}