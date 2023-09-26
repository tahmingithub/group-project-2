interface WebDriver {
    /*
    Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them.
need to look at the Project
     */

    void open();
    void close();
    String getTitle();

    interface RemoteWebDriver extends WebDriver{
        void navigate();
    }

    interface TakeScreenshot extends RemoteWebDriver{
        void getScreenshot();
    }

    class ChromeDriver implements RemoteWebDriver{

        @Override
        public void open() {

        }

        @Override
        public void close() {

        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public void navigate() {

        }
    }

    class FirefoxDriver implements RemoteWebDriver{

        @Override
        public void open() {

        }

        @Override
        public void close() {

        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public void navigate() {

        }
    }

    class SafariDriver implements RemoteWebDriver{

        @Override
        public void open() {

        }

        @Override
        public void close() {

        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public void navigate() {

        }
    }

    class tester{
        public static void main(String[] args) {
            ChromeDriver c1= new ChromeDriver();
            c1.open();
            c1.close();
            c1.navigate();
            c1.getTitle();

            FirefoxDriver f1= new FirefoxDriver();
            f1.open();
            f1.close();
            f1.navigate();
            f1.getTitle();

            SafariDriver s1=new SafariDriver();
            s1.open();
            s1.close();
            s1.navigate();
            s1.getTitle();

            //we are not able to get void getScreenshot it was not implemented or inherited.





        }






    }



}