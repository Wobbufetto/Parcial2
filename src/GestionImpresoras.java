public class GestionImpresoras {
    public static void main(String[] args){
        Impresora i1 = new Impresora("L355", "Hewlett-Packard", false);
        Impresora i2 = new Impresora("L3150", "EPSON", true);
        Impresora i3 = new Impresora("E471", "CANON", true);

        DatosImpresoras.registrarImpresora(i1);
        DatosImpresoras.registrarImpresora(i2);
        DatosImpresoras.registrarImpresora(i3);

        DatosImpresoras.buscarImpresora("L355");

        DatosImpresoras.imprimirDatos();
    }
}
