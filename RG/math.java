package RG;


import java.util.Random;
public class math {
  public static void main(String[] args) {
    String[] operate=new String[]{"+","-","¡Á","¡Â"};
      int[] numbers=new int[100];
      for(int i=1;i<=100;i++){
      numbers[i-1]=i;
    }
     Random r=new Random();
     for(int i=0;i<10;i++){
       System.out.println(numbers[r.nextInt(100)]+operate[r.nextInt(4)]+numbers[r.nextInt(100)]+"=");
    }
   }
   }