# nkaptcha

**nkaptcha** is a verification code library for Java, it doesn't rely on any other libraries,  is very easy to setup and use, is high availability and high performance . 

### Features

### Installation

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

