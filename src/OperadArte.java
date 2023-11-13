abstract class OperaDarte {
    protected String titolo;
    protected String artista;

    public OperaDarte(String titolo, String artista) {
        this.titolo = titolo;
        this.artista = artista;
    }

    public abstract double calcolaIngombro();

}
