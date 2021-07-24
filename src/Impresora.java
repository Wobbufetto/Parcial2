public class Impresora {
    //---------------------------------------------
    //Atributos
    //---------------------------------------------
    private String serial;
    private String marca;
    private boolean escaner;

    //---------------------------------------------
    //Constructores
    //---------------------------------------------
    /**
     * @param serial Serial de la impresora
     * @param marca Marca de la impresora
     * @param escaner Indicador de escaner
     */
    public Impresora(String serial, String marca, boolean escaner) {
        this.serial = serial;
        this.marca = marca;
        this.escaner = escaner;
    }

    //---------------------------------------------
    //Metodos getters and setters
    //---------------------------------------------
    /**
     * Retorna el serial de la impresora
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Retorna la marca de la impresora
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna true o false, si tiene escaner o no
     * @return the escaner
     */
    public boolean isEscaner() {
        return escaner;
    }

    
    
}
