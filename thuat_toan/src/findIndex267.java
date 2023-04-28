public class findIndex267 {
    public static void main(String[] args) {
        int[] numberArray = {1,9,11,4,6,8,3,15,7,2 };
        int number = 5;
        findIndex(numberArray,number);
    }
    public static void findIndex(int[] numberArray, int number){
        for (int i = 0; i < numberArray.length-1; i ++){
            for (int j = i +1; j < numberArray.length; j ++){
                if (numberArray[i]+numberArray[j]==number){
                    System.out.print(numberArray[i] + " as index " + i+" and ");
                    System.out.println(numberArray[j] + " as index " + j);
                }
            }
        }
    }
}
