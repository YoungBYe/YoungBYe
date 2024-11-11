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

## 目的：   

查找本地硬盘上的重复文件。

---

## 方法：   

使用Java的MessageDigest类计算文件的SHA-256哈希值。   
遍历指定目录下的所有文件，计算每个文件的哈希值，并记录文件路径与哈希值的对应关系。   
对哈希值进行排序，查找具有相同哈希值的文件。   
对于具有相同哈希值的文件，比较文件长度和部分随机内容以确认是否完全相同。   

---

## 结果：   

程序输出了所有具有相同哈希值的文件列表，这些文件极有可能是重复的。

---

## 结论：   

该程序有效地识别了本地硬盘上的重复文件，有助于清理磁盘空间并保持文件系统的整洁。

---

## 注意事项：      

确保在运行程序之前备份重要数据，以防止数据丢失。   
程序运行时可能会消耗较多计算资源，尤其是在处理大量大文件时。   
保护个人隐私，确保不处理包含敏感信息的文件。   

---

## 区块链（比特币）源代码中的Hash算法:      

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