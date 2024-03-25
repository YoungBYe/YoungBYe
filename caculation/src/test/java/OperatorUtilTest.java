import constant.SymbolConstant;
import org.junit.Test;
import utils.OperatorUtil;

import static org.junit.Assert.*;

public class OperatorUtilTest {

    private final static Character[] operatorTypes = new Character[]{SymbolConstant.PLUS, SymbolConstant.MINUS,SymbolConstant.MULTIPLY,SymbolConstant.DIVIDE};
    @Test
    public void getOperatorsTest() {
        int num=3;
        Character[] operators = new Character[num];
        operators = OperatorUtil.getOperators(num);

        for(int i=0;i<num;i++){
            System.out.println("第"+(i+1)+"个符号"+operators[i]);
        }



    }
}