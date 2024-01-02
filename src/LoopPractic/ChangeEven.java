public class ChangeEven {
    public static void main(String[] args) {

        /*
        -create array;
        -Find even number;
        -Override even num to 0;
        -show updated array;
         */
        int[] intArray = {1, 3, 6, 9, 12, 5664, 12, 13, 18};


        for(int i = 0; i < intArray.length; i++) {
            if(intArray[i] % 2 == 0) {
                intArray[i] = 0;
            }
        }


        for(int arrayValue : intArray ) {
            System.out.print(arrayValue + ", ");

        }


    }
}

