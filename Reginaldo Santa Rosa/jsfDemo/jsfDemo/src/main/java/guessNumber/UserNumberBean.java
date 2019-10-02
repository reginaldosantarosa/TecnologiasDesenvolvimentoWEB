package guessNumber;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Named(value = "UserNumberBean")
@SessionScoped
public class UserNumberBean implements Serializable {

    private Integer randomInt;
    private Integer userNumber;
    private String response;
    
    public UserNumberBean() {
        Random randomGR = new Random();
        randomInt = randomGR.nextInt(100);
        System.out.println("Duke's number: " + randomInt);
    }
     
    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
            this.userNumber = userNumber;
    }
            
    public String getResponse() {            
        if ((userNumber != null) && (userNumber.compareTo(randomInt) == 0)) {            
           FacesContext context = FacesContext.getCurrentInstance();
           HttpSession session = (HttpSession) context.getExternalContext().getSession(false); 
           session.invalidate();
           return "YNãooooooooooooooo!";
        }
        else{
           return "<p>Sorry, " + userNumber + " e´um valor para trabalho em  php !!! Pense Java </p>" + "<p>Tente mais uma vez...</p>";
        }        
    }   
    
}
