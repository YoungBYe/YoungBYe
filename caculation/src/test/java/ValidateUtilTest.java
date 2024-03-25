import org.junit.Test;
import utils.ValidateUtil;

import java.util.Scanner;

import static org.junit.Assert.*;

public class ValidateUtilTest {

    @Test
    public void checkParams() {

        String command ="-n i -r j";
        String[] s=ValidateUtil.checkParams(command);
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
        System.out.println("\n");
    }
    @Test
    public void checkParams1() {

        String command ="-r i -n j";
        String[] s=ValidateUtil.checkParams(command);
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
        System.out.println("\n");
    }
    @Test
    public void checkParams2() {

        String command ="-e i -a j";
        String[] s=ValidateUtil.checkParams(command);
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
        System.out.println("\n");
    }
    @Test
    public void checkParams3() {

        String command ="-a i -e j";
        String[] s=ValidateUtil.checkParams(command);
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
        System.out.println("\n");
    }
    @Test
    public void checkParams4() {

        String command ="-j i -k j";
        String[] s=ValidateUtil.checkParams(command);
        if(s!=null)
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
        System.out.println("\n");
    }
    @Test
    public void improvePath() {
        String path1= "Answers.txt";
        String path2= "D:/idea/IntelliJ IDEA 2023.3.4/project/caculation/question_bank/Answers.txt";
        System.out.println("输入相对路径后获得的路径："+(ValidateUtil.improvePath(path1)));
        System.out.println("输入绝对路径后获得的路径："+(ValidateUtil.improvePath(path2)));
    }
}