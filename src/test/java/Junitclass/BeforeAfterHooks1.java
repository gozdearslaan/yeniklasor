package Junitclass;

public class BeforeAfterHooks1 {

    //static WebDriver driver;

    //@BeforeClass
    public static void SetUp(){
        // WebDriverManager.chromedriver().setup();
        // driver= new ChromeDriver();

        // driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    //@AfterClass
    public static void TearDown(){
        // driver.close();

    }

    //@Test
    //public void method01(){
        //driver.get("https://www.amazon.com.tr");

        // WebDriver driver;

        //@Before
        //public  void  SetUp(){
            // WebDriverManager.chromedriver().setup();
            // driver = new ChromeDriver();

            // driver.manage().window().maximize();
            // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    //}

        //@After
        //public void TearDown() throws InterruptedException {
        //Thread.sleep(3000);
        //driver.close();
    //}

    //@Test
//public  void  method01() throws InterruptedException {
//driver.get("https://www.amazon.com.tr");


    //}
    //@Test
        public  void  method02() throws InterruptedException {
            //driver.get("https://www.facebook.com");

        }
    //@Test
        public  void  method03() throws InterruptedException {
            //driver.get("https://www.trendyol.com");

        }















    }























