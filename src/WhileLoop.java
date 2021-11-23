public class WhileLoop {
    static boolean isTurnOnLigth = false;

    public static void main(String[] args) {
        turnOnOffLight();
        int i = 1;
        while (isTurnOnLigth && i <= 10){
            printSOS();
            i++;
        }
    }

    public static void printSOS(){
        System.out.println("... _ _ _ ...");
    }

    public static boolean turnOnOffLight(){
       return isTurnOnLigth = !isTurnOnLigth;
    }
}
