import java.util.ArrayList;

public class GestorMaquinaria {

    private ArrayList<Maquina> maquinas;

    public GestorMaquinaria() {
        this.maquinas = new ArrayList<>();
    }

    public void registrarMaquina(Maquina maquina) {
        this.maquinas.add(maquina);
        System.out.println(maquina.getCodigo()+" ("+maquina.getClass().getSimpleName()+") Registrada correctamente.");
    }

    public ArrayList<Maquina> buscarCodigo(String codigo) {

        ArrayList<Maquina> buscar = new ArrayList<>();

        for(Maquina m: maquinas) {
            if(m.getCodigo().equalsIgnoreCase(codigo)) {
                buscar.add(m);
            }
        }
        return buscar;
    }

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }
}
