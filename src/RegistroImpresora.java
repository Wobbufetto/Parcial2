import java.util.List;
import java.util.Scanner;

public class RegistroImpresora {
    private List<Impresora> impresoras;
    public void crearImpresora(String newSerial, String newMarca, Boolean newEscaner){
        
        Impresora newImpresora = new Impresora(newSerial, newMarca, newEscaner);

        impresoras.add(newImpresora);

    }
}
