public class PigLatin{
  public static String pigLatinSimple(String s){
    int length = s.length();
    String result;
    if(s.charAt(0) == 'a' | s.charAt(0) == 'e' | s.charAt(0) == 'i' | s.charAt(0) == 'o' | s.charAt(0) == 'u'){
      result = s + "hay";
      return result;
    }
    else
    result = s.substring(1,length) + s.charAt(0) + "ay";
    return result;
  }
}
