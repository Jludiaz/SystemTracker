import org.apache.commons.net.ftp.FTPClient;

public class Main {
    public static void main(String[] args) {
        FTPClient ftpClient = new FTPClient();

        try{
            ftpClient.connect("my.example.com");
            System.out.println("Connected to FTP");
            ftpClient.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}