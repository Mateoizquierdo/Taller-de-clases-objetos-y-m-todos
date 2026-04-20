package deitel12.negocio;

public class Factura {
    String piezan;
    String descripieza;
    int cantarticulo;
    Double articuloprec;

    public Factura(String piezan, String descripieza, int cantarticulo, Double articuloprec) {
        this.piezan = piezan;
        this.descripieza = descripieza;

        //validacion de negativo
        if (cantarticulo<0){
        cantarticulo = 0;
        }else {this.cantarticulo = cantarticulo;}

        //validacion de negativo
        if (articuloprec < 0.0){
        articuloprec = 0.0;
        }else {this.articuloprec = articuloprec;}
    }

    public String getPiezan() {
        return piezan;
    }

    public void setPiezan(String piezan) {
        this.piezan = piezan;
    }

    public String getDescripieza() {
        return descripieza;
    }

    public void setDescripieza(String descripieza) {
        this.descripieza = descripieza;
    }

    public int getCantarticulo() {
        return cantarticulo;
    }

    public void setCantarticulo(int cantarticulo) {
        if (cantarticulo>0){
        this.cantarticulo = cantarticulo;}else {
            cantarticulo = 0;
        }
    }

    public Double getArticuloprec() {
        return articuloprec;
    }

    public void setArticuloprec(Double articuloprec) {
        if (articuloprec >0) {
            this.articuloprec = articuloprec;
        } else {articuloprec = 0.0;}
    }
    public double obtenerMontoFactura(){
        return  cantarticulo*articuloprec;
    }
}
