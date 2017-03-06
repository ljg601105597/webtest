package com.test.util.file;

import com.test.util.string.StringUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 文件系统的操作工具类
 *
 */
public class FileUtil {
    /**
     * 根据路径寻求 该路径下所有的文件（如果是目录包含目录下的文件）
     * @param path 路径
     * */
    public static List<File> findAllFilesByPath(String path){
        List<File>result=new ArrayList<File>();
        File file=new File(path);
        if(file.exists()){
            findSubFiles(file,result,null);
        }
        return result;
    }

    /**
     * 根据路径寻求 该路径下所有的文件（如果是目录包含目录下的文件）
     * @param path 路径
     * @param type 文件类型  txt java  class 以xxx结尾
     * */
    public static List<File> findAllFilesByPath(String path,String type){
        List<File>result=new ArrayList<File>();
        File file=new File(path);
        if(file.exists()){
            findSubFiles(file,result,type);
        }
        return result;
    }

    private static void findSubFiles(File file,List<File>result,String type){
        if(!file.exists()||result==null){
            return;
        }
        if(file.isDirectory()){
            File[]fs=file.listFiles();
            if(fs==null||fs.length==0){
                return;
            }
            for (File f:fs){
                findSubFiles(f,result,type);
            }
        }else {
            if(StringUtil.isBlank(type)){
                result.add(file);
            }else {
                String fileName=file.getAbsolutePath();
                if(StringUtil.isNotBlank(fileName)&&fileName.endsWith(type)){
                    result.add(file);
                }

            }

        }
    }


    /**
     * 获取所有的类全名
     * @param classPath 路径
     * */
    public static List<String> findAllClassByPath(String classPath){
        List<String>result=new ArrayList<String>();
        File file=new File(classPath);
        if(file.exists()){
            findClassNames(file,result,classPath);
        }
        return result;
    }

    private static void findClassNames(File file,List<String>result,String classPath){
        if(!file.exists()||result==null){
            return;
        }
        if(file.isDirectory()){
            File[]fs=file.listFiles();
            if(fs==null||fs.length==0){
                return;
            }
            for (File f:fs){
                findClassNames(f,result,classPath);
            }
        }else {
            String fileName=file.getAbsolutePath();
            if(StringUtil.isNotBlank(fileName)&&fileName.endsWith(".class")){
                fileName=fileName.replace(classPath,"").replace(".class","").replaceAll("/",".");
                result.add(fileName);
            }

        }
    }


}
