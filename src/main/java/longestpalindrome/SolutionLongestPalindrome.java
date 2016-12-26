package longestpalindrome;

/**
 * Created by adem on 26/12/2016.
 */
public class SolutionLongestPalindrome {

    public String solvePalindrome(String str){
        if(str==null || str.length()<=1) return str;

        boolean [][] palindromes = new boolean[str.length()][str.length()];
        int longestFrom=0, longestTo=0, longestLen=0;

        for(int len=0;len<str.length();len++){
            for(int i=0;i+len<str.length();i++) {
                if (str.charAt(i) == str.charAt(i + len)) {
                    if (len <= 1 || palindromes[i + 1][i + len - 1]) {
                        palindromes[i][i + len] = true;
                        if(len>longestLen) {
                            longestFrom = i;
                            longestTo = i + len;
                        }
                    }
                }
            }
        }

        return str.substring(longestFrom,longestTo+1);
    }


}
