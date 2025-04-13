public class myMethods {
    static void checkHeight(int child){
        if (child < 5){
            System.out.println("It doesn't need a ticket");
        } else {
            System.out.println("It must buy a ticket");
        }
    }

    public static void main(String a[]){
        checkHeight(10);
    }
}