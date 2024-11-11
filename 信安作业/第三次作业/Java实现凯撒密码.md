```
package Caesar;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        caesarPassword c=new caesarPassword();
        Scanner scanner=new Scanner(System.in);
        System.out.println("----------欢迎使用凯撒密码----------");
        do{
            System.out.println("输入0进行加密 输入1进行解密 输入2进行穷举攻击 输入-1退出");
            int n = scanner.nextInt();
            String str;
            int offset;
            switch (n) {
                case -1:
                    System.out.println("已退出");
                    return;
                case 0:
                    System.out.println("请输入明文：");
                    str = scanner.next();
                    System.out.println("请输入密钥：");
                    offset = scanner.nextInt();
                    c.encrypt(str,offset);
                    System.out.println();
                    break;
                case 1:
                    System.out.println("请输入密文：");
                    str = scanner.next();
                    System.out.println("请输入密钥：");
                    offset = scanner.nextInt();
                    System.out.println("解密后明文为：" + c.decrypt(str, offset) + '\n');
                    break;
                case 2:
                    System.out.println("请输入密文：");
                    str = scanner.next();
                    c.attack(str);
                    System.out.println();
                    break;
                default:
                    System.out.println("输入有误，请检查" + '\n');
                    break;
            }
        }while(true);
    }
} 
```

```
package Caesar;

public class caesarPassword {
    private static final char[] smallLetter=new char[26];
    private static final char[] bigLetter=new char [26];
    public caesarPassword(){
        for(int i=0;i<26;i++){
            smallLetter[i]=(char)('a'+i);
            bigLetter[i]=(char)('A'+i);
        }
    }

    public static void encrypt(String str,int offset){
        //加密功能
        char[] chars=str.toCharArray();
        String smallLetterStr=String.valueOf(smallLetter);
        String bigLetterStr=String.valueOf(bigLetter);
        for(int i=0;i<chars.length;i++){
            int i1;
            if(chars[i]>='a'&&chars[i]<='z'){
                i1=smallLetterStr.indexOf(chars[i])+offset;
                if(i1>25)chars[i]=smallLetter[(i1%=26)];
                else if(i1<0)chars[i]=smallLetter[(26-Math.abs(i1)%26)];
                else chars[i]+=offset;
            }
            else if(chars[i]>='A'&&chars[i]<='Z'){
                i1=bigLetterStr.indexOf(chars[i])+offset;
                if(i1>25)chars[i]=bigLetter[(i1%=26)];
                else if(i1<0)chars[i]=bigLetter[(26-Math.abs(i1)%26)];
                else chars[i]+=offset;
            }
        }

        //统计加密后密文数据的明文字符出现频率
        char[] chars1=str.toCharArray();
        int n=0;
        for(int j=0;j<chars.length;j++){
            for(int j1=0;j1<chars1.length;j1++){
                if(chars[j]==chars1[j1]){
                    n++;
                    break;
                }
            }
        }

        //输出结果
        System.out.println("加密后密文为："+String.valueOf(chars)+" ，明文字符出现频率为"+n+'/'+chars.length);
    }

    public static String decrypt(String str,int offset){
        //解密功能
        char[] chars=str.toCharArray();
        String smallLetterStr=String.valueOf(smallLetter);
        String bigLetterStr=String.valueOf(bigLetter);
        for(int i=0;i<chars.length;i++){
            int i1;
            if(chars[i]>='a'&&chars[i]<='z'){
                i1=smallLetterStr.indexOf(chars[i])-offset;
                if(i1>25)chars[i]=smallLetter[(i1%=26)];
                else if(i1<0)chars[i]=smallLetter[(26-Math.abs(i1)%26)];
                else chars[i]-=offset;
            }
            else if(chars[i]>='A'&&chars[i]<='Z'){
                i1=bigLetterStr.indexOf(chars[i])-offset;
                if(i1>25)chars[i]=bigLetter[(i1%=26)];
                else if(i1<0)chars[i]=bigLetter[(26-Math.abs(i1)%26)];
                else chars[i]-=offset;
            }
        }
        return String.valueOf(chars);
    }

    public static void attack(String str){
        //穷举攻击功能
        char[] chars=str.toCharArray();
        String smallLetterStr=String.valueOf(smallLetter);
        String bigLetterStr=String.valueOf(bigLetter);
        for(int offset=1;offset<=26;offset++){
            char[] chars1=str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                int i1;
                if (chars[i] >= 'a' && chars[i] <= 'z') {
                    i1 = smallLetterStr.indexOf(chars[i]) + offset;
                    if (i1 > 25) chars1[i] = smallLetter[(i1 %= 26)];
                    else if (i1 < 0) chars1[i] = smallLetter[(26 - Math.abs(i1) % 26)];
                    else chars1[i] = (char)(chars[i]+offset);
                } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                    i1 = bigLetterStr.indexOf(chars[i]) + offset;
                    if (i1 > 25) chars1[i] = bigLetter[(i1 %= 26)];
                    else if (i1 < 0) chars1[i] = bigLetter[(26 - Math.abs(i1) % 26)];
                    else chars1[i] = (char)(chars[i]+offset);
                }
            }
            System.out.println("向后偏移" + offset + "位时，得到明文为：" + String.valueOf(chars1));
        }
    }
} 
```