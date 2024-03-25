import org.junit.Test;
import utils.CalculateUtil;
import utils.ExpressionUtil;
import utils.NumberUtil;
import utils.OperatorUtil;

import static org.junit.Assert.*;

public class CalculateUtilTest {

    @Test
    public void getExpressResult() {
        CalculateUtil calculateUtil= new CalculateUtil();
        int num=1,round=100;
        Character[] curOperators = OperatorUtil.getOperators(num);
        String[] curNumbers = NumberUtil.getNumbers(round,num+1);
        String [] express = ExpressionUtil.getExpressStr(curOperators,curNumbers);
        for (int i = 0; i < express.length ; i=i+2) {
            System.out.println( calculateUtil.getExpressResult(express[i]));
        }

    }
}