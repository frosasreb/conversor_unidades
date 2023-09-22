package conversoresMonedas;

import javax.swing.JOptionPane;
public class ConversionMonedas {
    ConvertirAMonedas monedas = new ConvertirAMonedas();
    ConvertirAPesos pesos = new ConvertirAPesos();

    public void ConvertirMonedas(double inputMoneda) {
        String opcionConversion = (JOptionPane.showInputDialog(null,
                "Elige la conversion que quieras hacer", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"Pesos a Dólar", "Pesos a Euro", "Pesos a Libras","Pesos a Yen","Dólar a Pesos", "Euro a Pesos", "Libras a Pesos","Yen a Pesos"},
                "Seleccion")).toString();
        switch(opcionConversion) {
            case "Pesos a Dólar":
                monedas.ConvertirPesosADolares(inputMoneda);
                break;
            case "Pesos a Euro":
                monedas.ConvertirPesosAEuros(inputMoneda);
                break;
            case "Pesos a Libras":
                monedas.ConvertirPesosALibras(inputMoneda);
                break;
            case "Pesos a Yen":
                monedas.ConvertirPesosAYen(inputMoneda);
                break;
            case "Dólar a Pesos":
                pesos.ConvertirDolaresAPesos(inputMoneda);
                break;
            case "Euro a Pesos":
                pesos.ConvertirEurosAPesos(inputMoneda);
                break;
            case "Libras a Pesos":
                pesos.ConvertirLibrasAPesos(inputMoneda);
                break;
            case "Yen a Pesos":
                pesos.ConvertirYenAPesos(inputMoneda);
                break;
        }
    }
}
