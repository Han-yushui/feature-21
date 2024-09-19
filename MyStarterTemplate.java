package org.example.mystarter.my;

public class MyStarterTemplate {

    MyStarterProperties myStarterProperties;
    
    public MyStarterTemplate(MyStarterProperties myStarterProperties) {
        this.myStarterProperties = myStarterProperties;
    }

    // 方法的注释
    public void printName() {
        System.out.println("myStarterProperties.getName() = " + myStarterProperties.getName());
    }
}

