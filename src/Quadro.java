class Quadro extends OperaDarte {
    private double altezza;
    private double larghezza;

    public Quadro(String titolo, String artista, double altezza, double larghezza) throws Exception{
        super(titolo, artista);
        if (altezza<=0){
            throw new Exception("Inserire altezza positiva\n");
        }
        if (larghezza<=0){
            throw new Exception("Inserire larghezza positiva\n");
        }
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    @Override
    public double calcolaIngombro() {
        return altezza * larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Quadro{" +
                "altezza=" + altezza +
                ", larghezza=" + larghezza +
                '}';
    }
}
