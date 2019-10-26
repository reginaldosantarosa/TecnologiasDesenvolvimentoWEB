/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "helloBean")
@SessionScoped
public class helloBean implements Serializable {

    private String name;

    public helloBean() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSayWelcome() {
        //check if null?
        if ("".equals(name) || name == null) {
            return "";
        } else {
            return "Ajax message : Welcome " + name;
        }
    }
}
