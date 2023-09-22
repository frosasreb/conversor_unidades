package Interfaz;

import conversoresMonedas.ConversionMonedas;
import conversoresTemperatura.ConversionTemperatura;

import javax.swing.JOptionPane;

public class MenuPrincipal {

    public static void main( String[] args ){

        ConversionMonedas monedas = new ConversionMonedas();
        ConversionTemperatura temperatura = new ConversionTemperatura();

        String opcionesDeConversion = (JOptionPane.
                showInputDialog(null, "Seleccione el conversion ", "Conversor",
                        JOptionPane.QUESTION_MESSAGE, null,
                        new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

        switch(opcionesDeConversion) {
            case "Conversor de Moneda":
                int seguirConversionMoneda = JOptionPane.OK_OPTION;
                while(seguirConversionMoneda == JOptionPane.OK_OPTION) {
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (NumeroValido(input)) {
                        double inputMoneda = Double.parseDouble(input);
                        if (inputMoneda >= 0) {
                            monedas.ConvertirMonedas(inputMoneda);
                            seguirConversionMoneda = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        } else {
                            JOptionPane.showMessageDialog(null, "Valor debe ser positivo");
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;


            case "Conversor de Temperatura":
                int seguirConversionTemperatura = JOptionPane.OK_OPTION;
                while(seguirConversionTemperatura == JOptionPane.OK_OPTION) {
                    String input = JOptionPane.showInputDialog("Ingresa el valor de temperatura que deseas convertir: ");
                    if (NumeroValido(input)) {
                        double inputTemperatura = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(inputTemperatura);
                        seguirConversionTemperatura = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                    }
                }
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;

            }

    }

    private static boolean NumeroValido(String input) {
        try{
            double x = Double.parseDouble(input);
            return true ;
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor debe ser numerico");
            return false;
        }
    }
}

