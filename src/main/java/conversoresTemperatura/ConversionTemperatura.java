package conversoresTemperatura;
import javax.swing.JOptionPane;

public class ConversionTemperatura {
    ConvertirATemperatura temperatura = new ConvertirATemperatura();

    public void ConvertirTemperatura(double inputTemperatura) {
        String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
            case "Grados Celcius a Grados Farenheit":
                temperatura.ConvertirCelciusAFarenheit(inputTemperatura);
                break;
            case "Grados Celcius a Kelvin":
                temperatura.ConvertirCelciusAKelvin(inputTemperatura);
                break;
            case "Grados Farenheit a Grados Celcius":
                temperatura.ConvertirFarenheitACelcius(inputTemperatura);
                break;
            case "Kelvin a Grados Celcius":
                temperatura.ConvertirKelvinACelcius(inputTemperatura);
                break;
            case "Kelvin a Grados Farenheit":
                temperatura.ConvertirKelvinAFarenheit(inputTemperatura);
                break;
        }
    }
}
