目的：
在个人熟悉的平台上搜索下载安装PKI平台软件。练习证书的申请，创建，分发等操作。

步骤：
1.生成私人密钥
使用 OpenSSL 生成 RSA 私钥文件 private_key.pem。
![image](https://github.com/YoungBYe/YoungBYe/blob/main/%E4%BF%A1%E5%AE%89%E4%BD%9C%E4%B8%9A/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-11-11%20162026.png)

 2.生成证书签名请求
使用生成的私钥，创建一个证书签名请求（CSR），命名为 request.csr
![image](https://github.com/YoungBYe/YoungBYe/blob/main/%E4%BF%A1%E5%AE%89%E4%BD%9C%E4%B8%9A/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-11-11%20162009.png)

 3.创建自签名证书
使用生成的私钥文件直接生成自签名证书，证书有效期设置为 365 天
![image](https://github.com/YoungBYe/YoungBYe/blob/main/%E4%BF%A1%E5%AE%89%E4%BD%9C%E4%B8%9A/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-11-11%20161953.png)

4.验证证书内容
使用 OpenSSL 验证证书内容
![image](https://github.com/YoungBYe/YoungBYe/blob/main/%E4%BF%A1%E5%AE%89%E4%BD%9C%E4%B8%9A/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-11-11%20161928.png)

5.文件生成结果：
https://github.com/YoungBYe/YoungBYe/blob/main/%E4%BF%A1%E5%AE%89%E4%BD%9C%E4%B8%9A/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202024-11-11%20164051.png