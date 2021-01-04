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

  public static String pigLatin(String s){
    int length = s.length();
    String result;
    if(s.charAt(0) == 'a' | s.charAt(0) == 'e' | s.charAt(0) == 'i' | s.charAt(0) == 'o' | s.charAt(0) == 'u'){
      result = s + "hay";
      return result;
    }
    else if(s.substring(0,2).equals("bl") | s.substring(0,2).equals("br") | s.substring(0,2).equals("ch") | s.substring(0,2).equals("ck") | s.substring(0,2).equals("cl") | s.substring
    (0,2).equals("cr") | s.substring(0,2).equals("dr") | s.substring(0,2).equals("fl") | s.substring(0,2).equals("fr") | s.substring(0,2).equals("gh") | s.substring(0,2).equals
    ("gl") | s.substring(0,2).equals("gr") | s.substring(0,2).equals("ng") | s.substring(0,2).equals("ph") | s.substring(0,2).equals("pl") | s.substring(0,2).equals("pr") | s.
    substring(0,2).equals("qu") | s.substring(0,2).equals("sc") | s.substring(0,2).equals("sh") | s.substring(0,2).equals("sk") | s.substring(0,2).equals("sl") | s.substring(0,2).equals
    ("sm") | s.substring(0,2).equals("sn") | s.substring(0,2).equals("sp") | s.substring(0,2).equals("st") | s.substring(0,2).equals("sw") | s.substring(0,2).equals("th") | s.
    substring(0,2).equals("tr") | s.substring(0,2).equals("tw") | s.substring(0,2).equals("wh") | s.substring(0,2).equals("wr")){
      result = s.substring(2,length) + s.substring(0,2) + "ay";
      return result;
    }
    else
    result = s.substring(1,length) + s.charAt(0) + "ay";
    return result;
  }

  public static String pigLatinBest(String s){
    int length = s.length();
    String result;
    if(s.charAt(0) < 97){
      return s;
    }
    else if(s.charAt(0) == 'a' | s.charAt(0) == 'e' | s.charAt(0) == 'i' | s.charAt(0) == 'o' | s.charAt(0) == 'u'){
      if((s.charAt(length - 1) > 32 && s.charAt(length - 1) < 48) | (s.charAt(length - 1) > 57 && s.charAt(length - 1) < 65) | (s.charAt(length - 1) > 90 && s.charAt(length - 1) <
      97) | (s.charAt(length - 1) > 122 && s.charAt(length - 1) < 127)){
        result = s.substring(0,length-1) + "hay" + s.charAt(length - 1);
        return result;
      }
      else
      result = s + "hay";
      return result;
    }
    else if(s.substring(0,2).equals("bl") | s.substring(0,2).equals("br") | s.substring(0,2).equals("ch") | s.substring(0,2).equals("ck") | s.substring(0,2).equals("cl") | s.substring
    (0,2).equals("cr") | s.substring(0,2).equals("dr") | s.substring(0,2).equals("fl") | s.substring(0,2).equals("fr") | s.substring(0,2).equals("gh") | s.substring(0,2).equals
    ("gl") | s.substring(0,2).equals("gr") | s.substring(0,2).equals("ng") | s.substring(0,2).equals("ph") | s.substring(0,2).equals("pl") | s.substring(0,2).equals("pr") | s.
    substring(0,2).equals("qu") | s.substring(0,2).equals("sc") | s.substring(0,2).equals("sh") | s.substring(0,2).equals("sk") | s.substring(0,2).equals("sl") | s.substring(0,2).equals
    ("sm") | s.substring(0,2).equals("sn") | s.substring(0,2).equals("sp") | s.substring(0,2).equals("st") | s.substring(0,2).equals("sw") | s.substring(0,2).equals("th") | s.
    substring(0,2).equals("tr") | s.substring(0,2).equals("tw") | s.substring(0,2).equals("wh") | s.substring(0,2).equals("wr")){
      if((s.charAt(length - 1) > 32 && s.charAt(length - 1) < 48) | (s.charAt(length - 1) > 57 && s.charAt(length - 1) < 65) | (s.charAt(length - 1) > 90 && s.charAt(length - 1) <
      97) | (s.charAt(length - 1) > 122 && s.charAt(length - 1) < 127)){
        result = s.substring(2,length-1) + s.substring(0,2) + "ay" + s.charAt(length - 1);
        return result;
      }
      result = s.substring(2,length) + s.substring(0,2) + "ay";
      return result;
    }
    else
    if((s.charAt(length - 1) > 32 && s.charAt(length - 1) < 48) | (s.charAt(length - 1) > 57 && s.charAt(length - 1) < 65) | (s.charAt(length - 1) > 90 && s.charAt(length - 1) <
    97) | (s.charAt(length - 1) > 122 && s.charAt(length - 1) < 127)){
      result = s.substring(1,length-1) + s.charAt(0) + "ay" + s.charAt(length - 1);
      return result;
    }
    result = s.substring(1,length) + s.charAt(0) + "ay";
    return result;
  }
}
