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
