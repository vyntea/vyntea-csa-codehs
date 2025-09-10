public class WordGames
{
    
    public static String scramble(String word)
    {
        // switch first half
        // and second half
        String res = word.substring(word.length() / 2);
        res += word.substring(0, word.length() / 2);
        return res;
    }
    
    
    public static String bananaSplit(String word, int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        String res = word.substring(0, insertIdx);
        res += insertText;
        res += word.substring(insertIdx);
        return res;
    }
    
    
    public static String bananaSplit(String word, String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        return bananaSplit(word, word.indexOf(insertChar), insertText);
        
    }

    
}
