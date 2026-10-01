public class Excavadora extends Maquina implements Certificable{

    private double peso;
    private boolean mantenAlDia;
    private boolean certiActiva;

    public Excavadora() {
    }

    public Excavadora(String codigo, int horasUso, int potencia, double peso, boolean mantenAlDia) {
        super(codigo, horasUso, potencia);
        this.setPeso(peso);
        this.setMantenAlDia(mantenAlDia);
        this.certiActiva = false;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public boolean isMantenAlDia() {
        return mantenAlDia;
    }
    public void setMantenAlDia(boolean mantenAlDia) {
        this.mantenAlDia = mantenAlDia;
    }
    public boolean isCertiActiva() {
        return certiActiva;
    }
    public void setCertiActiva(boolean certiActiva) {
        this.certiActiva = certiActiva;
    }

    @Override
    public double calcularCosto() {

        double costoBase = 150000;

        if(!mantenAlDia) {
            return costoBase * 1.25;
        }
        return costoBase;
    }

    @Override
    public String obtenerDetalle() {
        return "Tipo: "+getClass().getSimpleName()+" | "+super.toString()+
                " | Potencia: "+getPotencia()+
                " | Peso: "+peso+
                " | Mantencion al dia: "+mantenAlDia+
                " | Certificacion activa: "+certiActiva+
                " | Costo: "+calcularCosto();
    }

    @Override
    public boolean consultarCertificacion() {
        return certiActiva;
    }

    @Override
    public void certificarMaquina() {
        this.certiActiva = true;
    }
}
