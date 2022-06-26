package com.syntax.class23;

public class WebDriver {
    //ctrl+O ---> to override methods
    //ctrl +R --- if we need to replace something
    public void startBrowser(){
        System.out.println("Starting browser");
    }
    public void openUrl(String url){
        System.out.println("Opening url"+url);
    }
    public void testLoginPage(){
        System.out.println("Checking if login page is visible");
    }
    public void closeBrowser(){
        System.out.println("Closing browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening Google Chrome");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening url "+url+" on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening  FireFox");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening url "+url+" on FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the  Firefox");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening  Safari");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening url "+url+" on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the  Safari");
    }
}
class Edge extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening Google Edge");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening url "+url+" on Edge");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Edge");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the  Edge");
    }
}
class BrowserTester {
    public static void main(String[] args) {
        /*WebDriver browser = new FireFox();
        browser.startBrowser();
        browser.openUrl("www.google.com");
        browser.testLoginPage();
        browser.closeBrowser();


         */
        WebDriver[] browser={new Chrome(),new Safari(),new Edge(),new FireFox()};
        /*for ( WebDriver driver:browser2){
            driver.startBrowser();
            driver.openUrl("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();
         */
            for (int i=0; i<browser.length;i++){
                browser[i].startBrowser();
                browser[i].openUrl("www.google.com");
                browser[i].testLoginPage();
                browser[i].closeBrowser();
            }

        }
    }
