public class Arrays {
    public static void main(String[] args) {
        String [] androidVersions = new String[17];
        String days [] = new String[7];

        String[][] cities = new String[4][2]; //[filas] [columnas]

        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println("--- For loop ---");
        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(i + ". " + androidVersions[i]);
        }

        System.out.println();

        System.out.println("--- Foreach loop ---");
        int index = -1;
        for (String androidversion : androidVersions) {
            index++;
            System.out.println(index+ ". " + androidversion);
        }

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        System.out.println("--- For loop ---");
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("--- Foreach loop ---");
        for (String [] pair:cities) {
            for (String cityName:pair) {
                System.out.println(cityName);
            }
        }

        System.out.println();
        System.out.println();

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                for (int k = 0; k < animals[i][j].length; k++) {
                    for (int l = 0; l < animals[i][j][k].length; l++) {
                        System.out.println("i = "+ "[" + i +"] "
                                + "j = " + "[" + j +"] "
                                + "k = " + "[" + k +"] "
                                + "l = " + "[" + l +"]"
                                +" --> "
                                + animals[i][j][k][l]);
                    }
                }
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <=1 ; i++) {
            for (int j = 0; j <=0 ; j++) {
                for (int k = 0; k <=0 ; k++) {
                    for (int l = 0; l <=1 ; l++) {
                        System.out.println(i + " " + j + " " + k + " " + l);
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
    }
}
