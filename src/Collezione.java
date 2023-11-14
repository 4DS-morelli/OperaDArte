class Collezione {
    private String nome;
    private String luogo;
    private OperaDarte[] opere;
    private int dimLogica;

    public Collezione(String nome, int capacita, String luogo) throws Exception{
        if (capacita<=0){
            throw new Exception("Inserire la capacità della collezione maggiore di 0\n");
        }
        this.nome= nome;
        this.opere= new OperaDarte[capacita];
        this.luogo= luogo;
        dimLogica= 0;
    }

    public void inserisciOpera(OperaDarte opera) throws Exception{
        if (dimLogica==opere.length){
            throw new Exception("Collezione piena\n");
        }
        opere[dimLogica]=opera;
        dimLogica++;
    }

    public String stampaCollezione() {
        String ret= "Collezione: " + nome + "\n";
        for (int i=0; i<dimLogica; i++) {
            ret+=opere[i].titolo + " di " + opere[i].artista+"\n";
        }

        return ret;
    }

    public String stampaIngombroOpera(OperaDarte op) throws Exception {
        String ing="";
        for (int i = 0; i < dimLogica; i++) {
            if (opere[i].equals(op)){
                ing += opere[i].calcolaIngombro();
            }else{
                throw new Exception("Opera non trovata\n");
            }
        }
        return ing;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }
}