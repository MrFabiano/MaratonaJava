package calculadora;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() ->
        {
            Calculadora  calc = new Calculadora();
            calc.setVisible(true);
        });
    }
}
