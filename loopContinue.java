class loopContinue {
    public static void main(String a[]){
        int point = 5;

        while (point > 0){
            if (point == 3) {
                point--;
                continue;
            }
            System.out.println(point);
            point--;
        }
    }
}
