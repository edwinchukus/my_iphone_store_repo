package com.company.inter.face.two.pack.selenium.runner;

import com.company.inter.face.one.pack.WebDriver;
import com.company.inter.face.two.pack.selenium.ChromeDriver;
import com.company.inter.face.two.pack.selenium.FirefoxDriver;

/**
 * Created by dotcom on 15/12/16.
 */
public class Test {

    private static WebDriver driver;




    public static void main(String args[]){

        if(true){
            driver = new ChromeDriver();
        }else{
            driver = new FirefoxDriver();
        }
    }


}
