import com.springcloud.order.CandyCrushLetter;
import org.junit.Test;

/**
 * CandyCrushLetterTest.java
 *
 * @author huogongchen
 * @since 2024.06.22
 **/
public class CandyCrushLetterTest {
    @Test
    public void testExample() {
        CandyCrushLetter candyCrushLetter = new CandyCrushLetter();
        String[] testCases= new String[]{"aabcccbbad","ccc","aabbba","afdsafsadfweqrdsffasdfsdfafffdsa","aa"};
        for (String testCase : testCases) {
            candyCrushLetter.example(testCase);
        }
    }

}
