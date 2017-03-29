package com.van.fanyu.library;

import android.content.Context;
import android.os.AsyncTask;

import com.van.fanyu.library.util.CompressWay1;
import com.van.fanyu.library.util.PathUtil;

/**
 *
 * Created by fanyu on 16/1/26.
 */
public class Compresser {
    Context context;
    int compressQuality;
    String oldPath;
    String newPath;

    public interface CompleteListener{
        void onSuccess(String newPath);
    }

    public Compresser(Context context,int compressQuality, String oldPath) {
        this.context = context;
        this.compressQuality = compressQuality;
        this.oldPath = oldPath;
        this.newPath = PathUtil.generateNewPath(context,oldPath);
    }

    public void doCompress(CompleteListener listener) {
        new CompressTask(listener).execute();
    }

    class CompressTask extends AsyncTask<String,Integer,String>{
        CompleteListener listener;

        public CompressTask(CompleteListener listener) {
            this.listener = listener;
        }

        @Override
        protected String doInBackground(String... params) {
            CompressWay1.bitmapToString(oldPath, compressQuality, newPath);
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if (listener!=null){
                listener.onSuccess(newPath);
            }
        }
    }
}
