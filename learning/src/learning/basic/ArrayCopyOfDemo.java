package learning.basic;

class ArrayCopyOfDemo {
    public static void main(String[] args) {
        
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
            
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 0, 9);
        
        /*Note that the second parameter of the copyOfRange method is the initial index of the range to be copied, inclusively, 
         * while the third parameter is the final index of the range to be copied, exclusively. 
         * In this example, the range to be copied does not include the array element at index 9 (which contains the character a).
         */
        
        System.out.println(new String(copyTo));
    }
}
