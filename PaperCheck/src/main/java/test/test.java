package test;

import org.junit.Test;
import main.main;

public class test {
    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = main.readTxt("D:/test/orig.txt");
        str[1] = main.readTxt("D:/test/orig_0.8_add.txt");
        str[2] = main.readTxt("D:/test/orig_0.8_del.txt");
        str[3] = main.readTxt("D:/test/orig_0.8_dis_1.txt");
        str[4] = main.readTxt("D:/test/orig_0.8_dis_10.txt");
        str[5] = main.readTxt("D:/test/orig_0.8_dis_15.txt");
        String ansFileName = "D:/test/ans.txt";
        for(int i = 0; i <= 5; i++){
            double ans = main.getSimilarity(main.getSimHash(str[0]), main.getSimHash(str[i]));
            main.writeTxt(ans, ansFileName);
        }
    }

    @Test
    public void getHammingDistanceTest() {
        String str0 = main.readTxt("D:/test/orig.txt");
        String str1 = main.readTxt("D:/test/orig_0.8_add.txt");
        int distance = main.getHammingDistance(main.getSimHash(str0), main.getSimHash(str1));
        System.out.println("海明距离：" + distance);
        System.out.println("相似度: " + (100 - distance * 100 / 128) + "%");
    }

    @Test
    public void getHammingDistanceFailTest() {
        // 测试str0.length()!=str1.length()的情况
        String str0 = "10101010";
        String str1 = "1010101";
        System.out.println(main.getHammingDistance(str0, str1));
    }

    @Test
    public void getSimilarityTest() {
        String str0 = main.readTxt("D:/test/orig.txt");
        String str1 = main.readTxt("D:/test/orig_0.8_add.txt");
        int distance = main.getHammingDistance(main.getSimHash(str0), main.getSimHash(str1));
        double similarity = main.getSimilarity(main.getSimHash(str0), main.getSimHash(str1));
        System.out.println("str0和str1的汉明距离: " + distance);
        System.out.println("str0和str1的相似度:" + similarity);
    }

    @Test
    public void getHashTest(){
        String[] strings = {"今天", "是", "星期天", "天气", "晴", "今天","晚上","我","要","去","看","电影"};
        for (String string : strings) {
            String stringHash = main.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String str0 = main.readTxt("D:/test/orig.txt");
        String str1 = main.readTxt("D:/test/orig_0.8_add.txt");
        System.out.println(main.getSimHash(str0));
        System.out.println(main.getSimHash(str1));
    }

    @Test
    public void readTxtTest() {
        // 路径存在，正常读取
        String str = main.readTxt("D:/test/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxtTest() {
        // 路径存在，正常写入
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            main.writeTxt(elem[i], "D:/test/ans1.txt");
        }
    }

    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = main.readTxt("D:/test/none.txt");
    }

    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            main.writeTxt(elem[i], "User:/test/ans1.txt");
        }
    }
    
}
