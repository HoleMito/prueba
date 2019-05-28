package prueba;

import java.util.Objects;


public class Restaurante extends Plan{
    private String nombre;
    private int estrellas;
    
    public Restaurante(){
        super();
        this.nombre = null;
        this.estrellas = 0;
    }
    
    public Restaurante(int precio, String localidad, String nombre, int estrellas){
        super(precio, localidad);
        this.nombre = nombre;
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Restaurante other = (Restaurante) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int getPrecio(){
        return super.precio * estrellas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNombre: " + nombre + "\nEstrellas: " + estrellas + "\n";
    }
    
    
    
}
