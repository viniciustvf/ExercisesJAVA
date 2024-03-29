<<<<<<< HEAD
package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;

    DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Client() {
    }

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString(){
        return name + " " + "(" + birthDate.format(format01) + ")" + " " + email;   
    }
        
}
=======
package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;

    DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Client() {
    }

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString(){
        return name + " " + "(" + birthDate.format(format01) + ")" + " " + email;   
    }
        
}
>>>>>>> 6dee2d66686813728fb5980e145b925adced9452
