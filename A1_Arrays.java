package f1;
  public class A1_Arrays {
      public static void main(String[] args){
          // declaration
          int[] arr = new int[5];
          arr[0] = 1;
          arr[1] = 2;
          arr[2] = 3;
          arr[3] = 4;
          arr[4] = 5;


          // reverse : 
          int i = 0, j = arr.length-1;
          while(i < j){
              // swap 
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;

              i++;
              j--;
          }

          // print : 
          for(i = 0; i < arr.length; i++){
              System.out.println(arr[i]);
          }
      }
  }