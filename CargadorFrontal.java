public class CargadorFrontal extends Maquina{

    private double capacidadBalde;

    public CargadorFrontal() {
    }

    public CargadorFrontal(String codigo, int horasUso, int potencia, double capacidadBalde) {
        super(codigo, horasUso, potencia);
        this.setCapacidadBalde(capacidadBalde);
    }

    public double getCapacidadBalde() {
        return capacidadBalde;
    }
    public void setCapacidadBalde(double capacidadBalde) {
        this.capacidadBalde = capacidadBalde;
    }

    @Override
    public double calcularCosto() {
        double costoBase = 120000;

        if(capacidadBalde > 3) {
            return costoBase * 1.2;
        }
        return costoBase;
    }

    @Override
    public String obtenerDetalle() {
        return "Tipo: "+getClass().getSimpleName()+" | "+super.toString()+
                " | Potencia: "+getPotencia()+
                " | Capacidad de balde: "+capacidadBalde+
                " | Costo: "+calcularCosto();
    }
}
