public class StringManipulator{
    public String trimAndConcat(String word1, String word2){
        return word1.trim() + word2.trim() ;
    }
    public Integer getIndexOrNull(String word, char letter){
        if (word.indexOf(letter) == -1){
            return null;
        }else{
        return word.indexOf(letter);
        }
    }
    public Integer getIndexOrNull(String word, String subString){
        if (word.indexOf(subString) == -1){
            return null;
        }else{
        return word.indexOf(subString);
        }
    }
    public String concatSubstring(String word, int num, int num2, String word2){
        return word.substring(num, num2) + word2;
    }
}