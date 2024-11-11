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