import java.util.*;
public class MakeStars{
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    while(n.hasNextLine()){
      String a = n.nextLine();
      Scanner m = new Scanner(a);
      while(m.hasNext()){
        String b = m.next();
        for(int i = 0; i < b.length(); i++){
        System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
