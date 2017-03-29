package com.van.fanyu.library.util;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by fanyu on 16/1/26.
 */
public class PathUtil {
    public static String generateNewPath(Context context, String oldPath){
        String newPath=context.getFilesDir().getPath();
        int len = oldPath.split("\\.").length;
        newPath = newPath+"/compress."+oldPath.split("\\.")[len-1];
        return newPath;
    }

}
