package prueba;

public class PaseoBarco extends Plan{
    public enum TipoPB {RUTAKAYAK, CATAMARAN}
    private String nombreBarco;
    private TipoPB tipo;
    
    public PaseoBarco(int precio, String localidad, String nombreBarco, TipoPB tipo){
        super(precio, localidad);
        this.nombreBarco = nombreBarco;
        this.tipo = tipo;
    }

    public String getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }
    
    @Override
    public int getPrecio(){
        if(this.tipo == TipoPB.CATAMARAN){
            return super.precio + 10;
        }
        else return super.precio;
    }
}
