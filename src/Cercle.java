public class Cercle {
    private double rayon;

    //Constructeur
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    //Retourne l'aire du cercle
    public double aire() {
        // Pi*R2
        return Math.PI*(rayon*rayon);
    }

    //Retourne le diametre du cercle
    public double diametre() {
        return rayon+rayon;
    }
}
