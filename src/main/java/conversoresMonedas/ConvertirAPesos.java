package conversoresMonedas;
import javax.swing.JOptionPane;
public class ConvertirAPesos {
    public void ConvertirDolaresAPesos(double valor) {
        double valorPesosDolar = valor * 3739.00;
        valorPesosDolar = (double) Math.round(valorPesosDolar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "Dolares son $ " +valorPesosDolar+ " Pesos");
    }

    public void ConvertirEurosAPesos(double valor) {
        double valorPesosEuro = valor * 4050.48;
        valorPesosEuro = (double) Math.round(valorPesosEuro *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "Euros son $ " +valorPesosEuro+ " Pesos");
    }

    public void ConvertirLibrasAPesos(double valor) {
        double valorPesosLibra = valor * 4890.52;
        valorPesosLibra = (double) Math.round(valorPesosLibra *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "Libras son $ " +valorPesosLibra+ " Pesos");
    }

    public void ConvertirYenAPesos(double valor) {
        double valorPesosYen = valor * 29.68;
        valorPesosYen = (double) Math.round(valorPesosYen *100d)/100;
        JOptionPane.showMessageDialog(null, valor + "Yenes son $ " +valorPesosYen+ " Pesos");
    }

}
