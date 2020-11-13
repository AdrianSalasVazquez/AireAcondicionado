public class AireAcondicionado {

    private double temperatura;
    private double max;
    private double min;
    private double incremento;
    private int cambiosTemp;
    private double tempMax;
    private double tempMin;
    private String estadisticas;

    public AireAcondicionado (double maximo, double minimo) {
        temperatura = 15.0;
        max = maximo;
        min = minimo;
        incremento = 5.0;
        cambiosTemp = 0;
        tempMax = 15.0;
        tempMin = 15.0;
        estadisticas = ("Temperatura actual: " + temperatura + "º | Temp. máxima posible: " + max + "º | Temp. mínima posible:" + min + "º | Temp. minima seleccionada: " +tempMin + "º | Temp. máxima seleccionada: " + tempMax + "º | Cambios de Temperatura: " + cambiosTemp);
    }

    public double getTemperatura() {
        return temperatura;
    }
    
    public void setIncremento(double incrementoTemperatura) {
        if (incrementoTemperatura < 0){
            System.out.println("Error: No es un valor adecuado.");  
        }
        else{
            incremento = incrementoTemperatura;
        }
    }

    public void subirTemperatura() {
        if ((temperatura + incremento) > max){
            System.out.println("Error: No se puede incrementar mas la temperatura.");  
        }
        else{
            temperatura = temperatura + incremento;
            cambiosTemp = cambiosTemp + 1;
            tempMax = temperatura;
        }
    }

    public void bajarTemperatura() {
        if ((temperatura - incremento) < min){
            System.out.println("Error: No se puede reducir mas la temperatura.");  
        }
        else{
            temperatura = temperatura - incremento;
            cambiosTemp = cambiosTemp + 1;
            tempMin = temperatura;
        }
    }
    
    public void imprimirEstadisticas() {
        System.out.println(estadisticas);
    }
    
    public String getEstadisticas() {
        return estadisticas;
    }
}