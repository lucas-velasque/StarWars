public class Sith {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }

    private String nome;
    private String titulo;
    private String weapons[];

    void lighting(){
        System.out.println("Toma raio na cara");

    }

    public void levitation() {
        System.out.println("Levitation Something");
    }

    public void mindControl() {
        System.out.println("Do what I wish");
    }

    public void slash() {
        System.out.println("Joããããããããããããão");
    }
}
