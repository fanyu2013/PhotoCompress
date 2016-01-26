# PhotoCompress
An Android Library to compress photo

#Sample
![image](https://github.com/fanyu2013/PhotoCompress/blob/master/myPicture01.png)
<br/>
![image](https://github.com/fanyu2013/PhotoCompress/blob/master/myPicture02.png)

#Project set-up
If you're using a Gradle-based project:
<br/>
Step 1. Add the JitPack repository to your build file
~~~
allprojects {
	repositories {
	...
	maven { url "https://jitpack.io" }
	}
}
~~~
Step 2. Add the dependency
~~~
dependencies {
	compile 'com.github.fanyu2013:PhotoCompress:v1.0'
}
~~~

If you're using a standard project without either Maven or Gradle, you'll have to download the project, and the add the library manually to your project.

#Usage
PhotoCompress is very simple to use

As an example:
~~~
Compresser compresser = new Compresser(quality, oldPath);//0<=quality<=100
compresser.doCompress(new Compresser.CompleteListener(){
        @Override
        public void onSuccess(String newPath) {
                //do what you want to do...
        }
});
~~~

# About me
* Blog:
* Email:[fanyu2013@foxmail.com](mailto:fanyu2013@foxmail.com)
