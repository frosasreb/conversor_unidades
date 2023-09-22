package conversoresMonedas;

import javax.swing.JOptionPane;
public class ConvertirAMonedas {
    public void ConvertirPesosADolares(double valor) {
        double valorDolar = valor / 3739.00;
        valorDolar = (double) Math.round(valorDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "$ " + valor + "pesos son $ " +valorDolar+ " Dolares");
    }

    public void ConvertirPesosAEuros(double valor) {
        double valorEuro = valor / 4050.48;
        valorEuro = (double) Math.round(valorEuro *100d)/100;
        JOptionPane.showMessageDialog(null, "$ " + valor + "pesos son $ " +valorEuro+ " Euros");
    }

    public void ConvertirPesosALibras(double valor) {
        double valorLibra = valor / 4890.52;
        valorLibra = (double) Math.round(valorLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "$ " + valor + "pesos son $ " +valorLibra+ " Libras Esterlinas");
    }

    public void ConvertirPesosAYen(double valor) {
        double valorYen = valor / 29.68;
        valorYen = (double) Math.round(valorYen *100d)/100;
        JOptionPane.showMessageDialog(null, "$ " + valor + "pesos son $ " +valorYen+ " Yuanes");
    }
    

}
