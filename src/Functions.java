public class Functions {
    public static void main(String[] args) {
        double y = 3;
        //Área de un círculo
        //PI * r^2
        double area = circleArea(y);
        System.out.println(area);

        //Área de una esfera
        //4*PI*r^2
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        //(4/3)*PI * r^3
        System.out.println(sphereVolume(y));

        System.out.println("PESOS A DOLARES: " + convertToDolar(1000, "COP"));
    }


    public static double circleArea(double radio){
        return Math.PI * Math.pow(radio,2);
    }

    public static double sphereArea(double radio){
        return 4 * Math.PI * Math.pow(radio,2);
    }

    public static double sphereVolume(double radio){
        return (4/3)*Math.PI *Math.pow(radio,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la candtidad actualizada en dólares
     */
    public  static double convertToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
