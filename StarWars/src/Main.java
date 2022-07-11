public class Main {
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa();
      Pessoa p2 = new Pessoa();
      p1.setNome("Leia");
      p1.setSobrenome("Organa");
      p1.setSexo("Feminino");

      p2.setNome("Luke");
      p2.setSobrenome("Skywalker");
      p2.setSexo("Masculino");

      Jedi j1 = new Jedi();
      j1.setNome("Obi-Wan Kenobi");
      j1.mindControl();
      j1.levitation();
      j1.shot();


      Sith s1 = new Sith();
      s1.setNome("Darth Vader");
      s1.mindControl();
      s1.levitation();
      s1.slash();

    }
}



