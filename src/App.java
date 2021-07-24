public class App {
    public static void main(String[] args){
        DatosImpresoras.crearImpresora("L355", "Hewlett-Packard", false);
        DatosImpresoras.crearImpresora("L3150", "EPSON", true);
        DatosImpresoras.crearImpresora("E471", "CANON", true);

        DatosImpresoras.buscarImpresora("L355");

        DatosImpresoras.consultarImpresoras();
        



    }
}
