package org.example;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String urlSite = "https://6677e55da58cfa7f080138be--helpful-dodol-b13cbb.netlify.app/";
        int width = 300;
        int height = 300;
        QRCodeWriter writer = new QRCodeWriter();
        try {
            BitMatrix bitMatrix = writer.encode(urlSite, BarcodeFormat.QR_CODE, width, height);
            File file = new File("C:\\Users\\admin\\Desktop\\JavaProject\\Work_with_bootstrap\\src\\main\\java\\org\\example\\qrQode.png");
        } catch (WriterException e) {
            throw new RuntimeException(e);
        }
    }
}