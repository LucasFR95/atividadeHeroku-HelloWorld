package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;
import java.time.LocalTime;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String aut;
    private String lang;
    private String msg;
    private String msg2;
    private LocalTime time;
    private String msg1;
        
    public MessageBean() {
    }
    
    public String getAut() {
        return "Lucas Fernandes e José Viterbo ";
    }
    
    public void setLang(String value) {
        lang = value;
    }
    
    
   
    public String getMsg() {
        switch (this.lang){
            case "pt":
                return "Alô";
            case "en":
                return "Hello";
            case "de":
                return "Hallo";
            case "fr":
                return "Bonjour";
        }
        return "";
    }

    public String getMsg1() {
        this.time = LocalTime.now();
        if(this.time.getHour() >= 0 && this.time.getHour() <= 11){
             switch (this.lang){
            case "pt":
                return "Bom dia";
            case "en":
                return "Good Morning";
            case "de":
                return "Guten Morgen";
            case "fr":
                return "Bonjour";
        }
        } else if(this.time.getHour() >= 12 && this.time.getHour() <= 17){
           switch (this.lang){
            case "pt":
                return "Bom dia";
            case "en":
                return "Good Morning";
            case "de":
                return "Guten Morgen";
            case "fr":
                return "Bonjour";
           }     
        } else if(this.time.getHour() >= 18 && this.time.getHour() <= 23){
            switch (this.lang){
            case "pt":
                return "Bom dia";
            case "en":
                return "Good Morning";
            case "de":
                return "Guten Morgen";
            case "fr":
                return "Bonjour";
        
             }
       }
        
        return "";
    }

    public String getMsg2() {
        switch (this.lang){
            case "pt":
                return "Elaborado por";
            case "en":
                return "Created by";
            case "de":
                return "Erstellt von";
            case "fr":
                return "Créé par";
        }
        return "";
    }
}
