package com.mbuy.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.web.multipart.MultipartFile;

/**
* @author
* @Desoription : 文件上传工具类
*/

public class FileUtils {

   private static final String UPLOAD_WINDOW = "D:/workspace/mbuy/src/main/resources/static/imgs";

   private static final String UPLOAD_LINUX = "/opt/images/";

   public static String singleFile(MultipartFile file) {
       if (Objects.isNull(file) || file.isEmpty()) {
           return "文件为空!";
       }
       try {
           byte[] bytes = file.getBytes();
           String UPLOAD_FOLDER;
           //若当前系统是window系统
           if(System.getProperty("os.name").toLowerCase().contains("windows")) {
               UPLOAD_FOLDER = UPLOAD_WINDOW;
           }else{
               //若当前系统是linux系统
               UPLOAD_FOLDER = UPLOAD_LINUX;
           }

           //File.separator表示分隔符
           //file.getOriginalFilename()表示文件全名(包括后缀名)
           String fileFullName = getFilename(file.getOriginalFilename());
           Path path = Paths.get(UPLOAD_FOLDER + File.separator + fileFullName);

           //如果没有此文件夹，则创建
           if (!Files.isWritable(path)) {
               Files.createDirectories(Paths.get(UPLOAD_FOLDER));
           }

           //文件写入指定路径
           Files.write(path, bytes);
           System.out.println(fileFullName);
           //若上传成功
           return fileFullName;
       } catch (IOException e) {
           //若发生异常
           return "发生异常";
       }
   }

   /**
    * 上传多个文件
    *
    * @return string
    * @param: file 和标签name对应,否则无响应
    */

   public static String multiFile(List<MultipartFile> file) {
	   String filePath = null;
       try {
           for (int i = 0; i < file.size(); i++) {
               if (file.get(i) != null) {
            	   filePath = singleFile(file.get(i));
               }
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return filePath;
   }

   /**
    * 设置文件名,防止相同文件名冲突
    * 原名称+时间(年月日)+后缀
    * @param originalFilename 原名称
    * @return string
    */
   private static String getFilename(String originalFilename) {
       //后缀名  如 .txt
       String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
       //后缀名之前的名称
       String prefix = originalFilename.substring(0, originalFilename.lastIndexOf("."));
       DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
       // 将此时时间转换为字符串
       String formatDate = format.format(new Date());
       // 拼接文件名
       String filename = new StringBuffer().append(prefix).append("_").append(formatDate).toString();
       filename = MD5Utils.getMD5(filename);
       filename = new StringBuffer().append(filename).append(suffix).toString();
       return filename;
   }
   
}
