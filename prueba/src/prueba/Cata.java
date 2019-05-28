package prueba;

public class Cata extends Plan{
    private String bodega;
    private int ano;
    
    public Cata(){
        super();
        this.bodega = null;
        this.ano = 0;
    }
    
    public Cata(int precio, String localidad, String bodega, int ano){
        super(precio, localidad);
        this.bodega = localidad;
        this.ano = ano;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public int getPrecio(){
        if(this.ano < 2015){
            return super.precio + 15;
        }
        return super.precio;
    }
}
