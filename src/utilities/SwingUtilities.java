/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author enzoq
 */
public class SwingUtilities {

    public static void showJOptionPane(String string) {
        JOptionPane.showMessageDialog(null, string);
    }

    public static boolean includesValidChar(int type, String text) {
        if (text.isEmpty()) {
            showJOptionPane("Rellenar espacio(s) vacíos.");
            return false;
        } else {
            switch (type) {
                case 1://numero
                    if (!text.matches("[0-9]+")) {
                        showJOptionPane("NO se permiten letras.");
                        return false;
                    }

                    break;
                case 2://letra
                    if (!text.matches("[a-zA-Z_]+")) {
                        showJOptionPane("Digite letras. No pueden haber espacios.");
                        return false;
                    }
                    break;
                case 3://decimales

                    try {
                        Double.parseDouble(text);
                    } catch (NumberFormatException nfe) {
                        showJOptionPane("Solo se permiten decimales");
                        return false;
                    }

            }
        }

        return true;
    }

    public static Border colorBorder(int color) {
        switch (color) {
            case 1:
                return BorderFactory.createLineBorder(java.awt.Color.red);
            case 2:
                return new JTextField().getBorder();
            default:
                return BorderFactory.createLineBorder(java.awt.Color.white);
        }
    }

    public static void registerSwitch(int res) throws HeadlessException {
        switch (res) {
            case 0:
                showJOptionPane("Registrado");
                break;
            case 1:
                showJOptionPane("No se pudo conectar a la BD");
                break;
            case 2:
                showJOptionPane("No se permite duplicacion de informacion");
                break;
            case 3:
                showJOptionPane("Error inesperado");
                break;
        }
    }

    public static void updateSwitch(int res) {
        switch (res) {
            case 0:
                showJOptionPane("Modificado");
                break;
            case 1:
                showJOptionPane("No se pudo conectar a la BD");
                break;
            case 2:
                showJOptionPane("No se permite duplicacion de informacion");
                break;
            case 3:
                showJOptionPane("Error inesperado");
                break;
        }
    }

    public static void deleteSwitch(int res) {
        switch (res) {
            case 0:
                showJOptionPane("NO eliminado");
                break;
            case 1:
                showJOptionPane("ELIMINADO");
                break;
            case 2:
                showJOptionPane("NO hubo conexion con base de datos");
                break;
            case 3:
                showJOptionPane("Error inesperado");
                break;
            case 4:
                showJOptionPane("Tiene registros asociados");
        }
    }
}
