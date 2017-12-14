
public class ValeurAbsolue {

    public static void main(String[] args) {
        int a = -5;
        int b = 2;
        int valeurAbsolueDeA = calculerValeurAbsolue(a);
        int valeurAbsolueDeB = calculerValeurAbsolue(b);

        System.out.println("la valeur absolue de " + valeurAbsolueDeA + " est " + a);
        System.out.println("la valeur absolue de " + valeurAbsolueDeB + " est " + b);
    }

    public static int calculerValeurAbsolue(int entier) {
        int valeurAbsolue;
        valeurAbsolue = Math.abs(entier);
        return valeurAbsolue;
    }


}
