public abstract class Maquina {

    private String codigo;
    private int horasUso;
    private int potencia;

    public Maquina() {
    }
    public Maquina(String codigo, int horasUso, int potencia) {
        this.setCodigo(codigo);
        this.setHorasUso(horasUso);
        this.setPotencia(potencia);
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {

        if(codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El codigo no debe ser nulo ni quedar vacio.");
        }
        this.codigo = codigo;
    }

    public int getHorasUso() {
        return horasUso;
    }
    public void setHorasUso(int horasUso) {

        if(horasUso < 0 || horasUso > 20000) {
            throw new IllegalArgumentException("Las horas deben estar en un margen de 0 a 20000.");
        }
        this.horasUso = horasUso;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {

        if(potencia <= 0) {
            throw new IllegalArgumentException("La potencia debe ser mayor que 0.");
        }
        this.potencia = potencia;
    }

    public abstract double calcularCosto();

    public abstract String obtenerDetalle();

    @Override
    public String toString() {
        return "Codigo: "+codigo+
                " | Horas: "+horasUso;
    }
}
