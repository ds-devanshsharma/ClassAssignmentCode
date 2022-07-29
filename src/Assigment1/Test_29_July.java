package Assigment1;

import java.util.Arrays;
import java.util.Collections;

/*
    ques1 :create int array of size 5
    ques 2 : greatest One
 */
class TestCode{

    public void arrayPrinter(int[] array){
        for(int num : array)
            System.out.print(num+" ");
        System.out.println();
    }
    public int greatestAmongArray(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    public int userGreatest(int index,int[] array){
        Integer[] intArray = new Integer[array.length];
        int i=0;
        for(int num : array) {
            intArray[i] = num;
            i++;
        }
        Arrays.sort(intArray, Collections.reverseOrder());

        return array[index-1];
    }

}
public class Test_29_July {
    public static void main(String[] args) {
        int[] array = {2,15,1,100,70};
        TestCode testCode =new TestCode();
        testCode.arrayPrinter(array);
        System.out.println(testCode.greatestAmongArray(array));
        System.out.println(testCode.userGreatest(3,array));

    }
}
