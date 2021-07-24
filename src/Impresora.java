public class Impresora {
    private String serial;
    private String marca;
    private boolean escaner;

    

    /**
     * @param serial
     * @param marca
     * @param escaner
     */
    public Impresora(String serial, String marca, boolean escaner) {
        this.serial = serial;
        this.marca = marca;
        this.escaner = escaner;
    }

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the escaner
     */
    public boolean isEscaner() {
        return escaner;
    }

    /**
     * @param escaner the escaner to set
     */
    public void setEscaner(boolean escaner) {
        this.escaner = escaner;
    }

    
    
}
