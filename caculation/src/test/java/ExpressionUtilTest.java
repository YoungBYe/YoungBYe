import org.junit.Test;
import utils.ExpressionUtil;
import utils.NumberUtil;
import utils.OperatorUtil;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ExpressionUtilTest {

    @Test
    public void generate() {
        int n=3,round=100;
        Map<String,String> questionAndResultMap = new HashMap<String,String>();
        questionAndResultMap = ExpressionUtil.generate(n,round);

    }

    @Test
    public void getExpressStr() {
        int num=3,round=100;
        Character[] curOperators = OperatorUtil.getOperators(num);
        String[] curNumbers = NumberUtil.getNumbers(round,num+1);
        String [] express = ExpressionUtil.getExpressStr(curOperators,curNumbers);
    }
}