import org.junit.Test;
import utils.NumberUtil;

import java.util.Random;

import static org.junit.Assert.*;

public class NumberUtilTest {

    @Test
    public void getNumbersTest() {
        int round=100,num=10000;
       String [] numbers = new String[num];
       numbers = NumberUtil.getNumbers(round, num);
        for(int i=0;i< numbers.length;i++)
        {
            System.out.printf("第%d个数为%s\n",i,numbers[i]);
        }

    }
}