package Dangnhap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
    public static void main(String[] args) {
        // Thiết lập ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

        // Khởi tạo ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // 1 - Tối đa hóa cửa sổ trình duyệt
            driver.manage().window().maximize();

            // 2 - Điều hướng đến URL
            driver.navigate().to("https://anhtester.com");

            // 3 - Lấy tiêu đề và in ra console
            System.out.println(driver.getTitle());

            // 4 - Thoát hẳn trình duyệt
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đảm bảo rằng trình duyệt được đóng nếu có lỗi
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
