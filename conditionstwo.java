class ConditionsTwo {
    public static void main(String a[]){
        int fault = 0;

        if (fault >= 2){
            System.out.println("Yellow Card");
        } else if (fault >= 3){
            System.out.println("Red Card");
        } else {
            System.out.println("No fault");
        }
    }
}
