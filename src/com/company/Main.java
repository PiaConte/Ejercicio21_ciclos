package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Pedir 10 numeros, y mostrar al final si se ha introducido alguno negativo
        int num;
        boolean hayNegativos = false;
        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + i + " numero: "));
            if (num < 0) {
                hayNegativos = true;
            }
        }
        if (hayNegativos == true) {
            JOptionPane.showMessageDialog(null, "Hubo al menos un numero negativo");
        } else {
            JOptionPane.showMessageDialog(null, "No hubieron numeros negativos turrito");
        }
    }
}
