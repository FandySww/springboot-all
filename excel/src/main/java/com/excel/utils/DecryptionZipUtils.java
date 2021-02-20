package com.excel.utils;

import de.idyl.winzipaes.AesZipFileDecrypter;
import de.idyl.winzipaes.impl.AESDecrypter;
import de.idyl.winzipaes.impl.AESDecrypterBC;
import de.idyl.winzipaes.impl.ExtZipEntry;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;

/**
 * @Author fandayong
 * @Date 2021/2/20 5:13 PM
 * @description 解压缩文件并将文件输出
 */
public class DecryptionZipUtils {
    // https://blog.csdn.net/Jumping_code/article/details/108217804
    // https://www.jb51.net/article/164137.htm
    public static void unzip(File inFile,String password,File outFile){
        AESDecrypter decrypter = new AESDecrypterBC();
        AesZipFileDecrypter zipDecrypter = null;
        try {
            zipDecrypter = new AesZipFileDecrypter(inFile, decrypter);
            AesZipFileDecrypter.charset = "utf-8";
            /**
             * 得到ZIP文件中所有Entry,但此处好像与JDK里不同,目录不视为Entry
             * 需要创建文件夹,entry.isDirectory()方法同样不适用,不知道是不是自己使用错误
             * 处理文件夹问题处理可能不太好
             */
            List<ExtZipEntry> entryList = zipDecrypter.getEntryList();
            for(ExtZipEntry entry : entryList) {
                String eName = entry.getName();
                zipDecrypter.extractEntry(entry, outFile, password);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DataFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                zipDecrypter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
