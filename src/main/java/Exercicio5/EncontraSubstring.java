package Exercicio5;

public class EncontraSubstring {
    public int countSubstring(String str, String str2){
        char[] chars = str.toCharArray();
        char[] substring = str2.toCharArray();

        return countSubstring(chars, substring);
    }

    public int countSubstring(char[] chars, char[] substring){
        int lengthMax = Math.max(chars.length, substring.length);
        int count = 0;

        for(int i=0;i<lengthMax;i++){
            if(substring[0]==chars[i]){
                boolean isEquals = equalSequenceFromAnPosition(substring, chars, i);
                if(isEquals)
                    count++;
            }
        }

        return count;
    }

    private boolean equalSequenceFromAnPosition(char[] subCaracters, char[] caracteres, int pos){
        int lengthMin = Math.min(subCaracters.length, caracteres.length);
        boolean equals = true;

        for(int j=0; j<lengthMin; j++){
            if(subCaracters[j]!=caracteres[pos+j]){
                equals = false;
                break;
            }
        }

        return equals;
    }
}
