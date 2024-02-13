package com.structural.proxy;


/*

lets say our application displays the images by downloading images from internet (instagram)

lets say 3rd party library downloads images

our display class connects with downloader class → downloads the image and displays it.

downloader doesnot cache the image, it will just download the image

our display class will only work with downloader class

if you want to cache the downloaded images, then you can use proxy pattern

you can create a wrapper class on top of the downloader class




 */
interface RealSubject{
    void request();
}

class RealSubjectImpl implements RealSubject{


    @Override
    public void request() {
        System.out.println("invoked the request from realSubject");
    }
}

class ProxyRealSubject implements RealSubject{

    RealSubject realSubject;

    public ProxyRealSubject(){
        this.realSubject=new RealSubjectImpl();
    }
    @Override
    public void request() {

        System.out.println("before invoking realsubject");
        realSubject.request();
        System.out.println("after invoking realsubject");
    }
}


public class ProxyMain {
    public static void main(String[] args) {

        RealSubject proxyRealSubject = new ProxyRealSubject();
        proxyRealSubject.request();
    }
}
