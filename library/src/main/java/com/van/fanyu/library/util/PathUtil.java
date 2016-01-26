package com.van.fanyu.library.util;

/**
 * Created by fanyu on 16/1/26.
 */
public class PathUtil {
    public static String generateNewPath(String oldPath){
        int index = oldPath.lastIndexOf(".");
        String newPath=insertString(index,oldPath);
        return newPath;
    }

    public static String insertString(int index,String oldString){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<index;i++){
            sb.append(oldString.charAt(i));
        }
        sb.append("compress");
        for(int i=index;i<oldString.length();i++){
            sb.append(oldString.charAt(i));

        }
        return sb.toString();
    }
}
