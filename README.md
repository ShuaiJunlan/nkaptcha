# nkaptcha

[![Build Status](https://travis-ci.org/shuaijunlan/nkaptcha.svg?branch=master)](https://travis-ci.org/shuaijunlan/nkaptcha) [![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html) [![codecov](https://codecov.io/gh/shuaijunlan/nkaptcha/branch/master/graph/badge.svg)](https://codecov.io/gh/shuaijunlan/nkaptcha)

**nkaptcha** is a verification code library for Java, it doesn't rely on any other libraries,  is very easy to setup and use, is high availability and high performance . If you would like to change the style of the verification code image, there is several configuration options and the framework is modular so you can write your own morphing code.

If you have a valid issue with the functionality or design of nkaptcha, please click the [Issues page](https://github.com/shuaijunlan/nkaptcha/issues) and file one.

![Verification Code](https://github.com/shuaijunlan/nkaptcha/raw/master/img/en.jpg) ![Verification Code](https://github.com/shuaijunlan/nkaptcha/raw/master/img/zh.jpg)

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
<dependencies>
    <dependency>
        <artifactId>nkaptcha</artifactId>
        <groupId>io.github.shuaijunlan</groupId>
        <version>1.0.0</version>
    </dependency>
</dependencies>
```

### Get Started

You can generate verification code picture like this:

* Output to folder by default properties

```java
VerificationList verificationList = new VerificationList();
BufferedImage bufferedImage = verificationList.pop().getBufferedImage();
String formatName = "jpg";
String pathName = "F:\\test\\" + System.currentTimeMillis() + ".jpg";
ImageIO.write(bufferedImage,
        formatName,
        new File(pathName));
```

* In web application by default properties

```java
@GetMapping("nkaptcha")
public void nkaptcha(HttpServletResponse response, HttpServletRequest request) throws IOException {
    VerificationList verificationList = new VerificationList();
    VerificationModel verificationModel = verificationList.pop();
    request.getSession().setAttribute("nkaptcha", verificationModel.getText());
    String formatName = "jpg";
    ImageIO.write(verificationModel.getBufferedImage(),
            formatName,
            response.getOutputStream());
}
```

* Also you can change the properties by yourself

```java
Properties properties = new Properties();
properties.setProperty(ParamKeyConstants.NKAPTCHA_IMAGE_NOISE_LINE, "true");
properties.setProperty(ParamKeyConstants.NKAPTCHA_IMAGE_NOISE_POINT, "false");
properties.setProperty(ParamKeyConstants.NKAPTCHA_IMAGE_NOISE_LINE_COUNT, "10");
VerificationList verificationList = new VerificationList(properties);
BufferedImage bufferedImage = verificationList.pop().getBufferedImage();
String formatName = "jpg";
ImageIO.write(verificationList.pop().getBufferedImage(),
              formatName,
              httpServletResponse.getOutputStream());
```

