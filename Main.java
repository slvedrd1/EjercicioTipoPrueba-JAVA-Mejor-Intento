public class Main {

    public static void main(String[] args){

        //Instanciamiento de objetos
        Excavadora exca1 = new Excavadora("MAQ-EX01", 3200, 210, 18.5, false);
        Excavadora exca2 = new Excavadora("MAQ-EX02", 800, 180, 14.0, true);

        CargadorFrontal carg1 = new CargadorFrontal("MAQ-CG01", 1500, 150, 3.5);
        CargadorFrontal carg2 = new CargadorFrontal("MAQ-CG02", 400, 130, 2.0);

        //Certificar maquina
        System.out.println("=== CERTIFICAR MAQUINA ===");
        exca1.certificarMaquina();
        System.out.println("Certificacion activa: "+exca1.consultarCertificacion());

        //Creacion de gestor y registro

        GestorMaquinaria gestor = new GestorMaquinaria();

        System.out.println("\n=== REGISTRO DE MAQUINAS ===");

        gestor.registrarMaquina(exca1);
        gestor.registrarMaquina(exca2);
        gestor.registrarMaquina(carg1);
        gestor.registrarMaquina(carg2);

        //Busqueda por codigo
        System.out.println("\n=== BUSQUEDA POR CODIGO: 'MAQ-EX01' === ");

        for(Maquina m: gestor.buscarCodigo("MAQ-EX01")) {
            System.out.println(m.obtenerDetalle());
        }

        //Listado de maquinas
        System.out.println("\n=== LISTADO DE MAQUINARIA ===");

        for(Maquina m: gestor.getMaquinas()){
            System.out.println(m);
        }

        //Prueba de excepcion
        System.out.println("\n=== PRUEBA DE EXCEPCION CON HORAS NEGATIVAS ===");

        try {
            Excavadora invalidExc = new Excavadora("MAQ-EXINV", -500, 100, 12.2, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepcion capturada con exito: "+e.getMessage());
        }

    }
}
