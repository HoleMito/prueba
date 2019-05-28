package prueba;

public class Plan {
    protected int precio;
    protected String localidad;
    private static int numElementos;
    
    public Plan(){
        this.precio = 0;
        this.localidad = null;
        numElementos++;
        System.out.println("El número de planes vacacionales es: " + numElementos);
    }
    
    public Plan(int precio, String localidad){
        this.precio = precio;
        this.localidad = localidad;
        numElementos++;
        System.out.println("El número de planes vacacionales es: " + numElementos);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "#####" + this.getClass().getName() + "#####" + "\nPrecio: " + precio + "\nLocalidad: " + localidad;
    }
    
}
