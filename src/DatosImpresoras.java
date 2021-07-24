import java.util.ArrayList;
import java.util.List;

public class DatosImpresoras {
    //---------------------------------------------
    //Atributos
    //---------------------------------------------
    private static List<Impresora> impresoras = new ArrayList<>();

    //---------------------------------------------
    //Metodos lógica de negocio
    //---------------------------------------------

    /**
     * Consulta la lista de impresoras, retorna los elementos
     * corresponientes a esta.
     * @return Lista impresoras
     */
    public static List<Impresora> consultarImpresoras(){
        return impresoras;
    }

    /**
     * Imprime los datos de las impresoras encontradas en la lista, 
     * mostrandolas en pantalla
     */
    public static void imprimirDatos(){
        for (int i = 0; i < DatosImpresoras.consultarImpresoras().size(); i++) {
            System.out.println("Impresora "+DatosImpresoras.consultarImpresoras().get(i).getMarca()+" con serial "+DatosImpresoras.consultarImpresoras().get(i).getSerial());
        }
    }

    /**
     * Busca una impresora en la lista, y segun el parametro serial
     * que ingrese, se muestra la impresora consultada o se muestra un null
     * @param serial Serial de la impresora a buscar
     * @return retorna la impresora con el serial consultado
     */
    public static Impresora buscarImpresora(String serial){
        for(Impresora i: impresoras){
            if(i.getSerial() == serial){
                System.out.println("Impresora: serial "+i.getSerial()+" marca "+i.getMarca());
                return i;
            }
        }
        return null;
    }

    /**
     * Registra una impresora a la lista de impresoras.
     * @param impresora Impresora con parametros
     */
    public static void registrarImpresora(Impresora impresora){
        impresoras.add(impresora);
    }
}
