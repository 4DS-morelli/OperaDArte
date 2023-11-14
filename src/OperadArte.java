abstract class OperaDarte {
    protected String titolo;
    protected String artista;

    public OperaDarte(String titolo, String artista) {
        this.titolo = titolo;
        this.artista = artista;
    }

    public abstract double calcolaIngombro();

    public boolean equals(OperaDarte op) {
        if (titolo.equals(op.titolo) && artista.equals(op.artista) && calcolaIngombro() == op.calcolaIngombro()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "OperaDarte{" +
                "titolo='" + titolo + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
