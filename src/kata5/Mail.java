package kata5;

/**
 *
 * @author usuario
 */
public class Mail {
    private final String mail;

    public String getMail() {
        return mail;
    }

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDominio(){
        return mail.split("@")[1];
    }
    
}
