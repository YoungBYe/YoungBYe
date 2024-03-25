import org.junit.Test;
import utils.ExpressionUtil;
import utils.FileIO;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import static org.junit.Assert.*;

public class FileIOTest {

    @Test
    public void printExerciseFileAndAnswerFile() {
        int n=10000,round=100;
        Map<String,String> questionAndResult = ExpressionUtil.generate(n, round);
        FileIO.printExerciseFileAndAnswerFile(questionAndResult);
}
 //相对路径查找
    @Test
    public void validateAnswerFile() {
        String exerciseFileUrl="exercises.txt", answerFileUrl="Answers.txt";
        FileIO.validateAnswerFile(exerciseFileUrl,answerFileUrl);

    }
    //绝对路径查找
    @Test
    public void validateAnswerFile1() {
        String exerciseFileUrl="D:/idea/IntelliJ IDEA 2023.3.4/project/caculation/question_bank/exercises.txt";
        String answerFileUrl="D:/idea/IntelliJ IDEA 2023.3.4/project/caculation/question_bank/Answers.txt";
        FileIO.validateAnswerFile(exerciseFileUrl,answerFileUrl);

    }

}