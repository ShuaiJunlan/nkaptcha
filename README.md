# nkaptcha

[![Build Status](https://travis-ci.org/shuaijunlan/nkaptcha.svg?branch=master)](https://travis-ci.org/shuaijunlan/nkaptcha) [![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html) [![codecov](https://codecov.io/gh/shuaijunlan/nkaptcha/branch/master/graph/badge.svg)](https://codecov.io/gh/shuaijunlan/nkaptcha)

**nkaptcha** is a verification code library for Java, it doesn't rely on any other libraries,  is very easy to setup and use, is high availability and high performance . 

### Features

### Installation

* Buid by maven:

```xml
<repositories>
    <repository>
        <id>shuaijunlan-github-maven-repository</id>
        <name>shuaijunlan-github-maven-repository</name>
        <url>https://raw.githubusercontent.com/shuaijunlan/shuaijunlan.github.io/master</url>
    </repository>
</repositories>
<dependency>
    <artifactId>nkaptcha</artifactId>
    <groupId>io.github.shuaijunlan</groupId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

### Get Started

You can generate verification code picture like this:

* Output to folder

```java
BufferedImage bufferedImage = VerificationList.pop().getBufferedImage();
String formatName = "jpg";
String pathName = "F:\\test\\" + System.currentTimeMillis() + ".jpg";
ImageIO.write(bufferedImage,
        formatName,
        new File(pathName));
```

* In web application

```java
@GetMapping("nkaptcha")
public void nkaptcha(HttpServletResponse httpServletResponse) throws IOException {
    String formatName = "jpg";
    ImageIO.write(VerificationList.pop().getBufferedImage(),
            formatName,
            httpServletResponse.getOutputStream());
}
```
