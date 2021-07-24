import java.util.ArrayList;
import java.util.List;

public class DatosImpresoras {

    private static List<Impresora> impresoras = new ArrayList<>();

    public static List<Impresora> consultarImpresoras(){
        return impresoras;
    }

    public static void imprimirDatos(){
        for (int i = 0; i < DatosImpresoras.consultarImpresoras().size(); i++) {
            System.out.println("Impresora "+DatosImpresoras.consultarImpresoras().get(i).getMarca()+" con serial "+DatosImpresoras.consultarImpresoras().get(i).getSerial());
        }
    }

    public static Impresora buscarImpresora(String serial){
        for(Impresora i: impresoras){
            if(i.getSerial() == serial){
                System.out.println("Impresora: serial "+i.getSerial()+" marca "+i.getMarca());
                return i;
            }
        }
        return null;
    }

    public static void registrarImpresora(Impresora impresora){
        impresoras.add(impresora);
    }
}
