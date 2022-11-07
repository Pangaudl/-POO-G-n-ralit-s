public class chien {

  String race, couleur;
  int age;

  public chien(String race, String couleur, int age) {
    this.race = race;
    this.couleur = couleur;
    this.age = age;
  }

  public String toString() {
    return "C'est un chien de race " + race + "de couleur " + couleur + "et d'age " + age;
  }

  public int getAge() {
    return age;
  }

  public String getRace() {
    return race;
  }

  public void aboyer() {
    System.out.println("aboyer");
  }

  public void dormir() {
    System.out.println("dormir");
  }
}