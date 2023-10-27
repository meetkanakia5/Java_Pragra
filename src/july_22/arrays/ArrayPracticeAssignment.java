package july_22.arrays;

public class ArrayPracticeAssignment {
    public static void main(String[] args) {
        int arr[] = {5,10,3,7,90};
        int temp = 0;

        // find large number
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > temp) {
                temp = arr[i];
            }
        }

        System.out.println("Large Number is: " + temp);


        //find Small number
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < temp) {
                temp = arr[i];
            }
        }

        System.out.println("Small Number is: " + temp);

        // reverse an array
        int reverseArr[] = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            reverseArr[j] = arr[i];
            j++;
        }

        //print reversed array
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.print(reverseArr[i]+",");
        }

        // finding an element in an array
        int elementPosition = 3;
        System.out.println("Value is: "+arr[elementPosition]);

    }
}
