public class Jedi {
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

    void patience(){
        System.out.println("Minha paciencia está acabando");

    }

    public void mindControl() {
        System.out.println("Do what I wish");
    }
    public void levitation(){
        System.out.println("Levitation Something");
    }

    public void shot() {
        System.out.println("Pew pew pew");
    }
}
