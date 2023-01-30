package tarea5_rodrigovasquez;

public class GranosBasicos {
    private String nombre;
    private int quintales;
    private double precio;
    private String medida;
    private String procedencia;

    public GranosBasicos(String nombre, int quintales, double precio, String medida, String procedencia) {
        this.nombre = nombre;
        this.quintales = quintales;
        this.precio = precio;
        this.medida = medida;
        this.procedencia = procedencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getQuintales() {
        return quintales;
    }

    public void setQuintales(int quintales) {
        this.quintales = quintales;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return "[Nombre -> " + nombre + "]" + "\n[Quintales -> " + quintales + "]" + "\n[Precio -> " + precio + "]" + 
                "\n[Medida -> " + medida + "]"+ "\n[Procedencia -> " + procedencia + "]";
    }
    
    
    
}
