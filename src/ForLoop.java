public class ForLoop {
    static boolean isTurnOnLigth = true;

    public static void main(String[] args) {
        turnOnOffLight();
        for(int i = 1;isTurnOnLigth && i<=10 ;i++){
            printSOS();
        }
    }

    public static void printSOS(){
        System.out.println("... _ _ _ ...");
    }

    public static boolean turnOnOffLight(){
        return isTurnOnLigth = !isTurnOnLigth;
    }
}
