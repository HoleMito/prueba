package prueba;

public class Chiringuito extends Plan{
    private String playa;
    private boolean niños;
    
    public Chiringuito(){
        super();
        this.playa = null;
        this.niños = false;
    }
    
    public Chiringuito(int precio, String localidad, String playa, boolean niños){
        super(precio, localidad);
        this.playa = playa;
        this.niños = niños;
    }

    public String getPlaya() {
        return playa;
    }

    public void setPlaya(String playa) {
        this.playa = playa;
    }

    public boolean isNiños() {
        return niños;
    }

    public void setNiños(boolean niños) {
        this.niños = niños;
    }
    
    @Override
    public int getPrecio(){
        if(this.niños){
            return super.precio + 5;
        }
        return super.precio;
    }
}
