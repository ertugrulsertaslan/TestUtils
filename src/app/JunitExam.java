package app;

public class JunitExam {
    /**
     *
     wordsCount metodu verilen string array içerisindeki "len" uzunluğundaki kelimelerin sayısını döndürür.
     Input: String[] words: String (kelime) içeren dizi
     len: Sayılacak kelimenin uzunluğu
     <br>

     * <b>ÖRNEKLER:</b><br>
     wordsCount({"a", "bb", "b", "ccc"}, 1) <b>---></b> 2<br>   --- 1 harf içeren kelime sayısı 2 ("a" ve "b")
     wordsCount({"a", "bb", "b", "ccc"}, 3) <b>---></b> 1 <br>  --- 3 harf içeren kelime sayısı 1 ("ccc")
     wordsCount({"a", "bb", "b", "ccc"}, 4) <b>---></b> 0 <br>  --- 4 harf içeren kelime sayısı 0
     */

    public static int wordsCount(String[] words, int len) {
        int count=0;
        if(len <= 0){
            throw new IllegalArgumentException();
        }
        for(String str:words){
            if(str.length() == len){
                count++;
            }
        }
        return count;
    }

}
