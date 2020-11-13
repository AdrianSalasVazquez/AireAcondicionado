public class AireAcondicionado {
    
    private double temperatura;
    
    public AireAcondicionado () {
        temperatura = 15.0;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
    
    public void subirTemperatura() {
        temperatura = temperatura + 5.0;
    }
    
    public void bajarTemperatura() {
        temperatura = temperatura - 5.0;
    }
}