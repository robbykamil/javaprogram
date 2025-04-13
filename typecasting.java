class TypeCasting {
    public static void main(String a[]){
        //Set the maximum possible point
        int maxPoint = 500;

        //Get the actual point
        int teamPoint = 367;

        //calculate the percentage of user's points in relation to the maximum point
        float percentage = (float) teamPoint / maxPoint * 100.0f;
        System.out.println(percentage);
    }
}
