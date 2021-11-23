public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);

        lives--;
        System.out.println(lives);

        lives++;
        System.out.println(lives);

        int gift = 100 + lives++; //Postfijo: Se accede al dato y se hace la operación y luego lo incrementa
        System.out.println(gift);

        gift = 100 + ++lives; //Prefijo: Se obtiene el dato incrementado
        System.out.println(gift);
    }
}
