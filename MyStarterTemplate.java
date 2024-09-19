package org.example.mystarter.my;

public class MyStarterTemplate {

    MyStarterProperties myStarterProperties;

    public MyStarterTemplate(MyStarterProperties myStarterProperties) {
        this.myStarterProperties = myStarterProperties;
    }

    public void printName() {
        System.out.println("获取properties文件的名字");
        System.out.println("myStarterProperties.getName() = " + myStarterProperties.getName());
    }
}

