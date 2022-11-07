package app;

import app.JunitExam;
import org.junit.Assert;
import org.junit.Test;
public class AppTest {



    @Test
    public void testWordsCountHowMany1Letter() {
        String [] words = new String [1];
        words = new String[]{"a", "bb", "b", "ccc" };
        int len ;
        int result = JunitExam.wordsCount( words,1);
        Assert.assertEquals(result,2);


    }

    @Test
    public void testWordsCountHowMany3Letter() {
        String [] words = new String [1];
        words = new String[]{"a", "bb", "b", "ccc"};
        int len;
        int result = JunitExam.wordsCount( words,3);
        Assert.assertEquals(result,1);



    }

    @Test
    public void testWordsCountHowMany4Letter() {
        String [] words = new String [1];
        words = new String[]{"a", "bb", "b", "ccc"};
        int len;
        int result = JunitExam.wordsCount( words,4);
        Assert.assertEquals(result,0);



    }

    @Test
    public void testWordsCountHowManyNumberLetter() {
        String [] words = new String [1];
        words = new String[]{"4","3","2", "1"};
        int len;
        int result = JunitExam.wordsCount( words,1);
        Assert.assertEquals(result,4);



    }
    @Test
    public void testWordsCountHowManySpaceLetter() {
        String[] words = new String[1];
        words = new String[]{" "};
        int len;
        int result = JunitExam.wordsCount(words, 1);
        Assert.assertEquals(result, 1);

    }
    @Test
    public void IllegalArgumentException() {
        String[] words = new String[1];
        words = new String[]{"  "};
        int len;
        int result = JunitExam.wordsCount(words, 0);
        Assert.assertEquals(result,0);
    }





}