public class AireAcondicionado {

    private double temperatura;
    private double max;
    private double min;
    private double incremento;

    public AireAcondicionado (double maximo, double minimo) {
        temperatura = 15.0;
        max = maximo;
        min = minimo;
        incremento = 5.0;
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
        }
    }

    public void bajarTemperatura() {
        if ((temperatura - incremento) < min){
            System.out.println("Error: No se puede reducir mas la temperatura.");  
        }
        else{
            temperatura = temperatura - incremento;
        }
    }
}