public class Casting {
    public static void main(String[] args) {
        //En un año he ubicado en hogares 30 perros
        //Cuántos perros ubiqué al mes?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimación
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;

        System.out.println(nI); // El 49 equivale a 1 en la tabla ASCII.

        short nS = (short) n;
        System.out.println(nS);

    }
}
