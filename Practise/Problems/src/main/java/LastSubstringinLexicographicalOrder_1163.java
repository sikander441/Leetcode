import java.util.Arrays;

public class LastSubstringinLexicographicalOrder_1163 {
    public String lastSubstring(String s) {
        char max='a';
       for(char c:s.toCharArray()){
           if(c>max)max=c;
       }
       String result = "";
       for(int i=0;i<s.length();i++){
            if(s.charAt(i)==max && s.substring(i).compareTo(result)>0)
                result=s.substring(i);
       }
       return result;
    }
}
