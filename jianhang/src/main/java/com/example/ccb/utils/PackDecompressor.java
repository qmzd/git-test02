package com.example.ccb.utils;

import com.auth0.jwt.internal.org.apache.commons.io.IOUtils;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.lang.StringUtils;

import java.io.*;

public class PackDecompressor {
    public static int BUFFER_SIZE = 2048;

    public static void main(String[] args) throws Exception {
        unTarGZ("G:\\201909UPLOAD_GZF_DATA_20190926{JIN}.tgz", "G:\\201910");


    }

    public static void unTarGZ(String file, String destDir) throws Exception {
        File tarFile = new File(file);
        unTarGZ(tarFile, destDir);
    }

    public static void unTarGZ(File tarFile, String destDir) throws Exception {
        if (StringUtils.isBlank(destDir)) {
            destDir = tarFile.getParent();
        }
        destDir = destDir.endsWith(File.separator) ? destDir : destDir + File.separator;
        unTar(new GzipCompressorInputStream(new FileInputStream(tarFile)), destDir);
    }

    private static void unTar(InputStream inputStream, String destDir) throws Exception {

        TarArchiveInputStream tarIn = new TarArchiveInputStream(inputStream, BUFFER_SIZE);
        TarArchiveEntry entry = null;
        try {
            while ((entry = tarIn.getNextTarEntry()) != null) {

                if (entry.isDirectory()) {//是目录
                    createDirectory(destDir, entry.getName());//创建空目录
                } else {//是文件
                    File tmpFile = new File(destDir + File.separator + entry.getName());
                    createDirectory(tmpFile.getParent() + File.separator, null);//创建输出目录
                    OutputStream out = null;
                    try {
                        out = new FileOutputStream(tmpFile);
                        int length = 0;
                        byte[] b = new byte[2048];
                        while ((length = tarIn.read(b)) != -1) {
                            out.write(b, 0, length);
                        }
                    } finally {
                        IOUtils.closeQuietly(out);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            IOUtils.closeQuietly(tarIn);
        }
    }

    public static void createDirectory(String outputDir, String subDir) {
        File file = new File(outputDir);
        if (!(subDir == null || subDir.trim().equals(""))) {//子目录不为空
            file = new File(outputDir + File.separator + subDir);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
