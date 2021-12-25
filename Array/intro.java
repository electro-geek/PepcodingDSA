public class intro{
    public static void main(String[] args){
        //Declaration of an array
        int [] arr;
        //Assigning of an array
        arr = new int[5];
        //the above declaration and assigning can be done together
        int [] marks = new int[5];
        arr[0] = 25;
        arr[1] = 24;
        arr[2] = 23;
        arr[3] = 22;
        arr[4] = 21;
        // System.out.println(arr.length);
        //to print the elemest of the array
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
    }
}