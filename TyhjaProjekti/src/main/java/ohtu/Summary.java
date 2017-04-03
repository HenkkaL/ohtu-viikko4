/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

/**
 *
 * @author mlyra
 */
public class Summary {



    private String name;
    private String term;
    private String week1, week2, week3, week4, week5, week6;  
    String[] weeks;

    public String getName() {
        return name;
    }

    public String getTerm() {
        return term;
    }
    
    public String getWeek(int week) {
        weeks = new String[]{week1, week2, week3, week4, week5, week6};
        return weeks[week-1];
    }
    
    
       
        
    
    

    @Override
    public String toString() {
        return "Opiskelijanumero: " ;
    }
   
}
