package Assigment1;

import java.util.Arrays;

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
        Arrays.sort(array);
        return array[array.length-4+index-1];
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
