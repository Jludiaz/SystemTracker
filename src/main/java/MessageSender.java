import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class MessageSender{
    public static void main (String[] args){

        String recipient = "jerogalaxy@gmail.com";
        String subject = "Hardware Monitoring";
        String message = "this is an example";

        try{
            SendEmail(subject, recipient, message);
        }catch(EmailException e){
            e.printStackTrace();
        }
    }

    private static void SendEmail(String subject, String recipient, String message) throws EmailException{
        Email mail = new Email() {
            @Override
            public Email setMsg(String s) throws EmailException {
                return null;
            }
        };

        mail.setStartTLSRequired(true);
        mail.setSSLCheckServerIdentity(true);
        mail.setHostName("smtp.googlemail.com");
        mail.setSslSmtpPort("465");
        mail.setAuthentication("jerogalaxy@gmail.com", "ttvw ruwy fxhz yhye");


        mail.setFrom("jerogalaxy@gmail.com");
        mail.setSubject(subject);
        mail.addTo(recipient);
        mail.setMsg(message);

        mail.setDebug(true);
        mail.send();

        System.out.println("Email Sent Successfully");
    }



}