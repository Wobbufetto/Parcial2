import java.util.List;

public class DatosImpresoras {

    private List<Impresora> impresoras;

    public List<Impresora> consultarImpresoras(){
        return impresoras;
    }

    public Impresora buscarImpresora(String serial){
        for(Impresora i: impresoras){
            if(i.getSerial() == serial){
                return i;
            }
        }
        return null;
    }

    
    public void crearImpresora(String newSerial, String newMarca, Boolean newEscaner){
        
        Impresora newImpresora = new Impresora(newSerial, newMarca, newEscaner);

        impresoras.add(newImpresora);

    }
}
