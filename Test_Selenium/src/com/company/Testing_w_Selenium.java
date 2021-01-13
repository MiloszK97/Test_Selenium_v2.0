package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testing_w_Selenium {

    public static void assignMlodzik00(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Młodzik")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali00(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}

    }

    public static void unfulfilledRequirementsNoQuali01(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali02(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void assignMlodzik01(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Młodzik")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali03(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali04(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali05(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void assignJunior00(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Junior")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali06(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali07(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali08(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void assignJunior01(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Junior")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali09(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("rodzice")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali10(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali11(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void assignDorosly00(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Dorosły")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali12(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void assignDorosly01(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Dorosły")) {System.out.println("Ok");}
    }

    public static void assignDorosly02(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Dorosły")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali13(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali14(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void unfulfilledRequirementsNoQuali15(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Brak kwalifikacji")) {System.out.println("Ok");}
    }

    public static void assignSenior(String name, String surname, String bDate){
        WebDriver webDrv = new FirefoxDriver();
        webDrv.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
        webDrv.findElement(By.id("inputEmail3")).clear();
        webDrv.findElement(By.id("inputEmail3")).sendKeys(name);
        webDrv.findElement(By.id("inputPassword3")).clear();
        webDrv.findElement(By.id("inputPassword3")).sendKeys(surname);
        webDrv.findElement(By.id("dataU")).clear();
        webDrv.findElement(By.id("dataU")).sendKeys(bDate);
        webDrv.findElement(By.id("lekarz")).click();
        webDrv.findElement(By.cssSelector("button")).click();
        webDrv.switchTo().alert().accept();
        String alertTxt = webDrv.switchTo().alert().toString();
        webDrv.switchTo().alert().accept();
        if(alertTxt.equals("Senior")) {System.out.println("Ok");}
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\milos\\Downloads\\geckodriver\\geckodriver.exe");
        assignMlodzik00("Jan","Kowalski","10.01.2006");
        unfulfilledRequirementsNoQuali00("Jan","Kowalski","10.01.2006");
        unfulfilledRequirementsNoQuali01("Jan","Kowalski","10.01.2006");
        unfulfilledRequirementsNoQuali02("Jan","Kowalski","10.01.2006");
        assignMlodzik01("Jan","Kowalski","10.01.2010");
        unfulfilledRequirementsNoQuali03("Jan","Kowalski","10.01.2010");
        unfulfilledRequirementsNoQuali04("Jan","Kowalski","10.01.2010");
        unfulfilledRequirementsNoQuali05("Jan","Kowalski","10.01.2010");
        assignJunior00("Jan","Kowalski","10.01.2006");
        unfulfilledRequirementsNoQuali06("Jan","Kowalski","10.01.2006");
        unfulfilledRequirementsNoQuali07("Jan","Kowalski","10.01.2006");
        unfulfilledRequirementsNoQuali08("Jan","Kowalski","10.01.2006");
        assignJunior01("Jan","Kowalski","10.01.2002");
        unfulfilledRequirementsNoQuali09("Jan","Kowalski","10.01.2002");
        unfulfilledRequirementsNoQuali10("Jan","Kowalski","10.01.2002");
        unfulfilledRequirementsNoQuali11("Jan","Kowalski","10.01.2002");
        assignDorosly00("Jan","Kowalski","10.01.1955");
        unfulfilledRequirementsNoQuali12("Jan","Kowalski","10.01.1955");
        assignDorosly01("Jan","Kowalski","10.01.2002");
        assignDorosly02("Jan","Kowalski","10.01.2002");
        unfulfilledRequirementsNoQuali13("Jan","Kowalski","10.01.1955");
        unfulfilledRequirementsNoQuali14("Jan","Kowalski","10.01.1955");
        unfulfilledRequirementsNoQuali15("Jan","Kowalski","10.01.1954");
        assignSenior("Jan","Kowalski","10.01.1954");
    }
}
