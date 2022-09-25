package programer.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodio;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodio, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodio, String genero, String estudio) {
        this(nome, tipo, episodio, genero);
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtoror sem argumentos");
    }

    public void init(String nome, String tipo, int episodio){
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
    }

    public void init(String nome, String tipo, int episodio, String genero){
        this.init(nome, tipo, episodio);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.nome = nome);
        System.out.println(this.tipo = tipo);
        System.out.println(this.episodio = episodio);
        System.out.println(this.genero = genero);
        System.out.println(this.estudio = estudio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public static void main(String[] args) {
        Anime anime = new Anime("Akudama", "Anime", 12, "Acao", "Production");
//        anime.setNome("Akudama");
//        anime.setTipo("anime");
//        anime.setEpisodio(12);
        //anime.init("Akudama", "Anime", 12, "Acao");
        anime.imprime();

    }
}
