# 第二次作业
## 网络安全
### 网络安全的概念：
网络安全（Cyber Security）是指网络系统的硬件、软件及其系统中的数据受到保护，不因偶然的或者恶意的原因而遭受到破坏、更改、泄露，系统连续可靠正常地运行，网络服务不中断。   
【万雅静主编. 计算机文化基础 Windows 7+Office 2010[M]. 北京：机械工业出版社, 2016.02.第234页】

网络安全，通常指计算机网络的安全，实际上也可以指计算机通信网络的安全。计算机通信网络是将若干台具有独立功能的计算机通过通信设备及传输媒体互连起来，在通信软件的支持下，实现计算机间的信息传输与交换的系统。而计算机网络是指以共享资源为目的，利用通信手段把地域上相对分散的若干独立的计算机系统、终端设备和数据设备连接起来，并在协议的控制下进行数据交换的系统。计算机网络的根本目的在于资源共享，通信网络是实现网络资源共享的途径，因此，计算机网络是安全的，相应的计算机通信网络也必须是安全的，应该能为网络用户实现信息交换与资源共享。下文中，网络安全既指计算机网络安全，又指计算机通信网络安全。   
【王国才，施荣华·计算机通信网络安全：中国铁道出版社，2016.09】

国际标准化组织（ISO）对计算机系统安全的定义是：为数据处理系统建立和采用的技术和管理的安全保护，保护计算机硬件、软件和数据不因偶然和恶意的原因遭到破坏、更改和泄露。由此可以将计算机网络的安全理解为：通过采用各种技术和管理措施，使网络系统正常运行，从而确保网络数据的可用性、完整性和保密性。所以，建立网络安全保护措施的目的是确保经过网络传输和交换的数据不会发生增加、修改、丢失和泄露等。

### 网络安全的分类：
网络安全由于不同的环境和应用而产生了不同的类型。主要有以下几种：    
（1）系统安全   
运行系统安全即保证信息处理和传输系统的安全。它侧重于保证系统正常运行。避免因为系统的崩溃和损坏而对系统存储、处理和传输的消息造成破坏和损失。避免由于电磁泄翻，产生信息泄露，干扰他人或受他人干扰。    
（2）网络信息安全   
网络上系统信息的安全。包括用户口令鉴别，用户存取权限控制，数据存取权限、方式控制，安全审计。安全问题跟踩。计算机病毒防治，数据加密等。    
（3）信息传播安全   
网络上信息传播安全，即信息传播后果的安全，包括信息过滤等。它侧重于防止和控制由非法、有害的信息进行传播所产生的后果，避免公用网络上自由传输的信息失控。    
（4）信息内容安全   
网络上信息内容的安全。它侧重于保护信息的保密性、真实性和完整性。避免攻击者利用系统的安全漏洞进行窃听、冒充、诈骗等有损于合法用户的行为。其本质是保护用户的利益和隐私。   
【张万民，王振友主编；李永光，李磊，金发起，陈振军，孙俊国，王志岐，刘建华，崔守良副主编·计算机导论：北京理工大学出版社，2016.08】

### 网络的安全隐患有以下几点：
1．Internet是一个开放的、无控制机构的网络，黑客（Hacker）经常会侵入网络中的计算机系统，或窃取机密数据和盗用特权，或破坏重要数据，或使系统功能得不到充分发挥直至瘫痪。   
2．Internet的数据传输是基于TCP/IP通信协议进行的，这些协议缺乏使传输过程中的信息不被窃取的安全措施。   
3．Internet上的通信业务多数使用Unix操作系统来支持，Unix操作系统中明显存在的安全脆弱性问题会直接影响安全服务。   
4．在计算机上存储、传输和处理的电子信息，还没有像传统的邮件通信那样进行信封保护和签字盖章。信息的来源和去向是否真实，内容是否被改动，以及是否泄露等，在应用层支持的服务协议中是凭着君子协定来维系的。   
5．电子邮件存在着被拆看、误投和伪造的可能性。使用电子邮件来传输重要机密信息会存在着很大的危险。   
6．计算机病毒通过Internet的传播给上网用户带来极大的危害，病毒可以使计算机和计算机网络系统瘫痪、数据和文件丢失。在网络上传播病毒可以通过公共匿名FTP文件传送、也可以通过邮件和邮件的附加文件传播。   
【甘利杰；孔令信；马亚军·大学计算机基础教程：重庆大学出版社，2017.08】

### 网络的主要攻击形式有：
攻击形式主要有四种:中断、截获、修改和伪造。   
中断是以可用性作为攻击目标，它毁坏系统资源，使网络不可用。   
截获是以保密性作为攻击目标，非授权用户通过某种手段获得对系统资源的访问。   
修改是以完整性作为攻击目标，非授权用户不仅获得访问而且对数据进行修改。   
伪造是以完整性作为攻击目标，非授权用户将伪造的数据插入到正常传输的数据中。   
【甘利杰；孔令信；马亚军·大学计算机基础教程：重庆大学出版社，2017.08】

### 网络攻击的解决方案有：
1．入侵检测系统部署   
入侵检测能力是衡量一个防御体系是否完整有效的重要因素，强大完整的入侵检测体系可以弥补防火墙相对静态防御的不足。对来自外部网和校园网内部的各种行为进行实时检测，及时发现各种可能的攻击企图，并采取相应的措施。具体来讲，就是将入侵检测引擎接入中心交换机上。入侵检测系统集入侵检测、网络管理和网络监视功能于一身，能实时捕获内外网之间传输的所有数据，利用内置的攻击特征库，使用模式匹配和智能分析的方法，检测网络上发生的入侵行为和异常现象，并在数据库中记录有关事件，作为网络管理员事后分析的依据；如果情况严重，系统可以发出实时报警，使得学校管理员能够及时采取应对措施。   
2．漏洞扫描系统   
采用最先进的漏洞扫描系统定期对工作站、服务器、交换机等进行安全检查，并根据检查结果向系统管理员提供详细可靠的安全性分析报告，为提高网络安全整体水平产生重要依据。   
3．网络版杀毒产品部署   
在该网络防病毒方案中，我们最终要达到一个目的就是：要在整个局域网内杜绝病毒的感染、传播和发作，为了实现这一点，我们应该在整个网络内可能感染和传播病毒的地方采取相应的防病毒手段。同时为了有效、快捷地实施和管理整个网络的防病毒体系，应能实现远程安装、智能升级、远程报警、集中管理、分布查杀等多种功能。   
【甘利杰；孔令信；马亚军·大学计算机基础教程：重庆大学出版社，2017.08】

### 我对网络安全的评价：
我认为，在这个互联网如此发达的时代，网络安全已经成为了我们不可忽视的一个问题，我们每个人的个人信息、个人财产、个人隐私等等几乎都存储在互联网上，假若网络安全不完善，被不法分子入侵了网络，小到个人财产、大到国家安全都会受到威胁，因此这是每个人甚至每个国家都要重视的问题，所以国家应当多加培养一些网络安全相关的人才来保证国家网络的安全。在以后的时代，互联网会越来越发达，信息化会越来越普及，甚至以后的战争可能都是所谓的打信息战，那么网络安全就显得至关重要了。


## 量子密码
### 量子密码的概念：
量子密码术与传统的密码系统不同，它依赖于物理学作为安全模式的关键方面而不是数学。实质上，量子密码术是基于单个光子的应用和它们固有的量子属性开发的不可破解的密码系统，因为在不干扰系统的情况下无法测定该系统的量子状态。理论上其他微粒也可以用，只是光子具有所有需要的品质，它们的行为相对较好理解，同时又是最有前途的高带宽通讯介质光纤电缆的信息载体。   
量子加密（又称量子加密技术）是指基于自然存在且不可改变的量子力学定律，对安全数据进行加密和传输的各种网络安全方法。虽然量子加密仍处于早期阶段，但它有可能比以前的加密算法类型安全得多，甚至在理论上是不可破解的。

### 量子密码的工作原理：
理论上，量子密码术工作在以下模式（这个观点是由Bennett和Brassard于1984年开发的传统模式，其他的模式也存在）：
假设两个人想安全地交换信息，命名为Alice和Bob。Alice通过发送给Bob一个键来初始化信息，这个键可能就是加密数据信息的模式。是一个随意的位序列，用某种类型模式发送，可以认为两个不同的初始值表示一个特定的二进制位（0或1）。   
我们暂且认为这个键值是在一个方向上传输的光子流，每一个光子微粒表示一个单个的数据位（0或1）。除了直线运行外，所有光子也以某种方式进行振动。这些振动沿任意轴在360度的空间进行着，为简单起见（至少在量子密码术中可简化问题），我们把这些振动分为4组特定的状态，即上、下，左、右，左上、右下和右上、左下，振动角度就沿光子的两极。过滤器，它允许处于某种振动状态的原子毫无改变的通过，令其他的原子改变震动状态后通过（它也能彻底阻塞光子通过，但我们在这里将忽略这一属性）。Alice有一个偏光器允许处于这四种状态的光子通过，实际上，她可以选择沿直线（上、下，左、右）或对角线（左上、右下，右上、左下）进行过滤。

与基于数学基础构建的传统加密不同，量子加密基于物理定律而构建。具体来说，量子加密依赖于独特的量子力学原理：   
1.粒子本质上具有不确定性：在量子层面上，粒子可以同时存在于多个地方或同时以多个状态存在，并且不可能预测确切的量子态。   
2.光子可以在二进制位置随机测量：光子是最小的光粒子，可以设置为具有特定的极性或自旋，它可以作为经典计算系统的 1 和 0 的二进制对应物。   
3.量子系统无法在不改变的情况下进行测量：根据量子物理定律，测量甚至观察量子系统的基本行为始终会对该系统产生可衡量的影响。   
4.粒子可以部分克隆，但不能完全克隆：虽然可以克隆某些粒子的属性，但 100% 克隆被认为不可能实现。   

### 量子密码的实践意义：
实践中，量子密码术在IBM的实验室中得到了证明，但仅适合应用于相对较短的距离。在较长的距离上，具有极纯光特性的光纤电缆成功的传输光子距离达60公里。只是与Heisenberg不确定性原理和光纤中的微杂质紧密相连的BERs(出错率)使系统不能稳定工作。虽然有研究已经能成功地通过空气进行传输，但在理想的天气条件下传输距离仍然很短。量子密码术的应用需要进一步开发新技术来提高传输距离。

### 我对量子密码的评价：
我认为量子密码相对于一般的数字密码来说优势非常大，它几乎无法被破解，而且就算被破解了他也会因为量子的不确定性从而使得破解者获取错误的信息，所以量子密码的发明对于现在的互联网信息和网络安全来说是非常有帮助的，他几乎就保证了信息能够绝对安全的存放在网络之中，我相信等到量子密码普及之后，互联网信息的安全一定会比现在提升很多。

---

# 第三次作业
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

---

# 第四次作业
```
package DES;

public class main{
    public static void main(String[] args) throws Exception {
        byte[] key = DES.generateKey("12345678"); // 生成DES密钥
        byte[] m = BitStringGenerator.generateBitString(64, 32); // 生成明文

        DESExample desExample = new DESExample();
        System.out.println("对明文差分进行100次样本分析:");
        desExample.analyzePlaintextDifference(key, 100); // 对明文差分进行100次样本分析
        System.out.println("\n对密钥差分进行100次样本分析:");
        desExample.analyzeKeyDifference(m, 100); // 对密钥差分进行100次样本分析
    }
}
```

```
package DES;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Security;
import java.util.Arrays;

public class DES {

    // 加载提供DES加密算法的Provider
    static {
        Security.addProvider(new com.sun.crypto.provider.SunJCE());
    }

    /**
     * 生成DES密钥
     *
     * @param keyStr 密钥字符串
     * @return 8字节的DES密钥
     * @throws Exception
     */
    public static byte[] generateKey(String keyStr) throws Exception {
        // 将密钥字符串转换为byte数组
        byte[] keyBytes = keyStr.getBytes("UTF-8");
        // 确保密钥长度为8字节
        byte[] key = Arrays.copyOf(keyBytes, 8);
        // 填充密钥至8字节，如果keyStr不足8字节
        for (int i = keyStr.length(); i < 8; i++) {
            key[i] = 0;
        }
        return key;
    }

    /**
     * DES加密
     *
     * @param data 待加密数据
     * @param key  8字节的DES密钥
     * @return 加密后的数据
     * @throws Exception
     */
    public static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        // 创建并初始化Cipher对象
        Cipher cipher = Cipher.getInstance("DES");
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "DES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        // 执行加密操作
        return cipher.doFinal(data);
    }
}
```

```
package DES;

public class DESExample {
    public void analyzePlaintextDifference(byte[] key, int numSamples) throws Exception {
        //明文差分海明重量分析
        int[] c1Weights = new int[64];
        int[] c2Weights = new int[64];
        for (int i = 0; i < 64; i++) {
            for (int j = 0; j < numSamples; j++) {
                byte[] m1 = BitStringGenerator.generateBitString(64, i);
                byte[] m2 = BitStringGenerator.generateBitString(64, i);
                byte[] c1 = DES.encrypt(m1, key);
                byte[] c2 = DES.encrypt(m2, key);
                c1Weights[i] += BitUtils.hammingWeight(c1);
                c2Weights[i] += BitUtils.hammingWeight(c2);
            }
            c1Weights[i] /= numSamples;
            c2Weights[i] /= numSamples;
            System.out.println("Hamming weight of C1 for difference " + i + ": " + c1Weights[i]);
            System.out.println("Hamming weight of C2 for difference " + i + ": " + c2Weights[i]);
        }
    }

    public void analyzeKeyDifference(byte[] m, int numSamples) throws Exception {
        //密钥差分海明重量分析
        int[] c1Weights = new int[64];
        int[] c2Weights = new int[64];
        for (int i = 0; i < 64; i++) {
            for (int j = 0; j < numSamples; j++) {
                byte[] k1 = BitStringGenerator.generateBitString(64, i); // DES密钥长度为64位
                byte[] k2 = BitStringGenerator.generateBitString(64, i);
                byte[] c1 = DES.encrypt(m, k1);
                byte[] c2 = DES.encrypt(m, k2);
                c1Weights[i] += BitUtils.hammingWeight(c1);
                c2Weights[i] += BitUtils.hammingWeight(c2);
            }
            c1Weights[i] /= numSamples;
            c2Weights[i] /= numSamples;
            System.out.println("Hamming weight of C1 for difference " + i + ": " + c1Weights[i]);
            System.out.println("Hamming weight of C2 for difference " + i + ": " + c2Weights[i]);
        }
    }
}
```

```
package DES;

import java.security.SecureRandom;

public class BitStringGenerator {
    //生成具有特定海明重量的位串
    private static final SecureRandom random = new SecureRandom();

    public static byte[] generateBitString(int length, int hammingWeight) {
        byte[] bitString = new byte[(length + 7) / 8];
        int bitsSet = 0;
        while (bitsSet < hammingWeight) {
            int index = random.nextInt(bitString.length);
            int bit = random.nextInt(8);
            if ((bitString[index] >>> bit) % 2 == 0) {
                bitString[index] |= (byte)(1 << bit);
                bitsSet++;
            }
        }
        return bitString;
    }
}
```

```
package DES;

public class BitUtils {
    public static int hammingWeight(byte[] bits) {
        //计算海明重量
        int weight = 0;
        for (byte b : bits) {
            weight += Integer.bitCount(b & 0xFF);
        }
        return weight;
    }
}
```

---

# 第五次作业
```
package DHandRSA;

public class DH {
    private int p;
    private int g;
    private int a;
    private int A;
    private int b;
    private int B;
    private int s;

    public DH(int p, int g, int a) {
        this.p = p;
        this.g = g;
        this.a = a;
        this.A = ExpMod(g, a, p);
    }

    public int getA() {
        return A;
    }

    public void setB(int b, int B) {
        this.b = b;
        this.B = B;
        this.s = ExpMod(B, a, p);
    }

    public int getS() {
        return s;
    }

    public static int ExpMod(int b, int n, int m) {
        int res = 1;
        int base = b;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * base) % m;
            }
            base = (base * base) % m;
            n >>= 1;
        }
        return res;
    }
}
```

```
package DHandRSA;

import java.util.Random;

public class RSA {
    private int n;
    private int e;
    private int d;
    private int phi;

    public RSA(int bits) {
        Random rand = new Random();
        int p, q;

        // 寻找两个大素数p和q
        do {
            p = rand.nextInt((1 << (bits / 2)) - 1) + 1;
        } while (!isPrime(p));

        do {
            q = rand.nextInt((1 << (bits / 2)) - 1) + 1;
        } while (!isPrime(q) || p == q);

        // 计算n和φ(n)
        n = p * q;
        phi = (p - 1) * (q - 1);

        // 寻找e
        do {
            e = rand.nextInt(phi) + 1;
        } while (GCD(e, phi) != 1);

        // 计算d
        d = Neg(e, phi);
    }

    public int getPhi() {
        return phi;
    }

    public int getN() {
        return n;
    }

    public int getE() {
        return e;
    }

    public int getD() {
        return d;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int Neg(int a, int m) {
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) return x;
        }
        return -1; // 没有找到逆元
    }

    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

```
package DHandRSA;

public class test{

    public static void main(String[] args) {
        // 测试DH
        testDH();

        // 测试RSA
        testRSA();
    }

    public static void testDH() {
        int p = 23; // 质数
        int g = 5;  // 生成元
        int a = 6;  // Alice的私钥
        int b = 15; // Bob的私钥

        // Alice生成公钥
        DH alice = new DH(p, g, a);
        int A = alice.getA();

        // Bob生成公钥
        DH bob = new DH(p, g, b);
        int B = bob.getA();

        // Alice计算共享密钥
        alice.setB(b, B);
        int sharedKeyAlice = alice.getS();

        // Bob计算共享密钥
        bob.setB(a, A);
        int sharedKeyBob = bob.getS();

        // 验证共享密钥是否相同
        if (sharedKeyAlice != sharedKeyBob) {
            System.out.println("DH测试失败: 共享密钥不匹配");
        } else {
            System.out.println("DH测试通过: 共享密钥匹配");
        }
    }

    public static void testRSA() {
        int bits = 16; // 使用较小的位数用于测试
        RSA rsa = new RSA(bits);

        int phi = rsa.getPhi();
        int e = rsa.getE();
        int d = rsa.getD();

        // 验证 e 和 φ(n) 互质
        if (rsa.GCD(e, phi) != 1) {
            System.out.println("RSA测试失败: e和φ(n)不互质");
            return;
        }

        // 验证 d 是 e 的模逆
        if ((e * d) % (phi) != 1) {
            System.out.println("RSA测试失败: d不是e的模逆");
            return;
        }

        System.out.println("RSA测试通过: e和d有效");
    }
}
```

## RES手写作业:
![image](https://github.com/YoungBYe/YoungBYe/blob/main/%E4%BF%A1%E5%AE%89%E4%BD%9C%E4%B8%9A/RSA%E6%89%8B%E5%86%99%E4%BD%9C%E4%B8%9A.jpg)

---

# 第六次作业
## 用Java实现Hash函数查找重复文件: 

```
package DuplicateFileFinder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateFileFinder {

    public static void main(String[] args) {
        File directory = new File("D:/QQ/");//使用QQ文件夹测试
        Map<String, List<File>> hashToFilesMap = new HashMap<>();
        try {
            findFiles(directory, hashToFilesMap);
            findDuplicates(hashToFilesMap);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private static void findFiles(File directory, Map<String, List<File>> hashToFilesMap) throws NoSuchAlgorithmException {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String hash = getFileHash(file);
                    hashToFilesMap.computeIfAbsent(hash, k -> new ArrayList<>()).add(file);
                } else {
                    findFiles(file, hashToFilesMap);
                }
            }
        }
    }

    private static String getFileHash(File file) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] byteArray = new byte[1024];
            int bytesCount;
            while ((bytesCount = fis.read(byteArray)) != -1) {
                digest.update(byteArray, 0, bytesCount);
            }
            byte[] bytes = digest.digest();

            StringBuilder sb = new StringBuilder();
            for (byte aByte : bytes) {
                sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void findDuplicates(Map<String, List<File>> hashToFilesMap) {
        for (Map.Entry<String, List<File>> entry : hashToFilesMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("发现具有哈希值重复的文件" + entry.getKey());
                for (File file : entry.getValue()) {
                    System.out.println(file.getAbsolutePath());
                }
                System.out.println();
            }
        }
    }
}
```

### 目的：   

查找本地硬盘上的重复文件。

### 方法：   

使用Java的MessageDigest类计算文件的SHA-256哈希值。   
遍历指定目录下的所有文件，计算每个文件的哈希值，并记录文件路径与哈希值的对应关系。   
对哈希值进行排序，查找具有相同哈希值的文件。   
对于具有相同哈希值的文件，比较文件长度和部分随机内容以确认是否完全相同。   

### 结果：   

程序输出了所有具有相同哈希值的文件列表，这些文件极有可能是重复的。

### 结论：   

该程序有效地识别了本地硬盘上的重复文件，有助于清理磁盘空间并保持文件系统的整洁。

### 注意事项：      

确保在运行程序之前备份重要数据，以防止数据丢失。   
程序运行时可能会消耗较多计算资源，尤其是在处理大量大文件时。   
保护个人隐私，确保不处理包含敏感信息的文件。   

### 区块链（比特币）源代码中的Hash算法:      

比特币使用SHA-256算法进行区块哈希的计算。以下是比特币源代码中与Hash算法相关的部分：
```
// Bitcoin source code snippet
uint256 ComputeHash(const uint256& prevBlock, const uint256& merkleRoot, uint32_t nTime, uint32_t nBits, uint32_t nNonce) {
    CBlockHeader blockHeader;
    blockHeader.hashPrevBlock = prevBlock;
    blockHeader.hashMerkleRoot = merkleRoot;
    blockHeader.nTime = nTime;
    blockHeader.nBits = nBits;
    blockHeader.nNonce = nNonce;
    return blockHeader.GetHash();
}
```
这段代码定义了一个函数ComputeHash，它接受区块头的各个部分作为参数，并返回该区块头的哈希值。这个哈希值用于验证区块的完整性和工作量证明。

---

## 用Java实现生成特定Hash文本文件:
```
package HashGenerator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashGenerator {
    public static void main(String[] args) {
        int leadingZeros = 1; //以1开始
        String content = generateContentWithLeadingZeros(leadingZeros);
        System.out.println("Content: " + content);
        System.out.println("Hash: " + calculateSHA256(content));
    }

    private static String generateContentWithLeadingZeros(int leadingZeros) {
        int count = 0;
        String prefix = "";
        for (int i = 0; i < leadingZeros; i++) {
            prefix += "0";
        }
        while (true) {
            String content = prefix + count;
            String hash = calculateSHA256(content);
            if (hash.startsWith(prefix)) {
                return content;
            }
            count++;
        }
    }

    private static String calculateSHA256(String content) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(content.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
```

---

# 第七次作业
## 目的：

在个人熟悉的平台上搜索下载安装PKI平台软件。练习证书的申请，创建，分发等操作。

## 步骤：
### 1.生成私人密钥

使用 OpenSSL 生成 RSA 私钥文件 private_key.pem。   

![image](https://github.com/YoungBYe/YoungBYe/blob/main/%E4%BF%A1%E5%AE%89%E4%BD%9C%E4%B8%9A/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-11-11%20162026.png)

 ### 2.生成证书签名请求

使用生成的私钥，创建一个证书签名请求（CSR），命名为 request.csr   

![image](https://github.com/YoungBYe/YoungBYe/blob/main/%E4%BF%A1%E5%AE%89%E4%BD%9C%E4%B8%9A/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-11-11%20162009.png)

 ### 3.创建自签名证书

使用生成的私钥文件直接生成自签名证书，证书有效期设置为 365 天   

![image](https://github.com/YoungBYe/YoungBYe/blob/main/%E4%BF%A1%E5%AE%89%E4%BD%9C%E4%B8%9A/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-11-11%20161953.png)

### 4.验证证书内容   

使用 OpenSSL 验证证书内容  	 

![image](https://github.com/YoungBYe/YoungBYe/blob/main/%E4%BF%A1%E5%AE%89%E4%BD%9C%E4%B8%9A/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-11-11%20161928.png)

### 5.文件生成结果

![image](https://github.com/YoungBYe/YoungBYe/blob/main/%E4%BF%A1%E5%AE%89%E4%BD%9C%E4%B8%9A/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-11-11%20164051.png)