class Scultura extends OperaDarte {
    private double altezza;
    private double larghezza;
    private double profondita;

    public Scultura(String titolo, String artista, double altezza, double larghezza, double profondita) throws Exception{
        super(titolo, artista);
        if (altezza<=0){
            throw new Exception("Inserire altezza positiva\n");
        }
        if (larghezza<=0){
            throw new Exception("Inserire larghezza positiva\n");
        }
        if (profondita<=0){
            throw new Exception("Inserire profondità positiva\n");
        }
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }

    @Override
    public double calcolaIngombro() {
        return altezza * larghezza * profondita;
    }
}