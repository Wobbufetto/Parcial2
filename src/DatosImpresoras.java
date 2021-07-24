import java.util.List;

public class DatosImpresoras {

    private static List<Impresora> impresoras;

    public static List<Impresora> consultarImpresoras(){
        return impresoras;
    }

    public static Impresora buscarImpresora(String serial){
        for(Impresora i: impresoras){
            if(i.getSerial() == serial){
                return i;
            }
        }
        return null;
    }

    public static void crearImpresora(String newSerial, String newMarca, Boolean newEscaner){
        System.out.println(newSerial+"  "+newMarca+" "+newEscaner);
        Impresora newImpresora = new Impresora(newSerial, newMarca, newEscaner);

        impresoras.add(newImpresora);

    }
}
