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
public class PrintStat {
    
    Summary summary;
    Submission[] subs;
    
    public PrintStat(Summary sum, Submission[] sub){
        summary = sum;
        subs = sub;        
    }
    
    public String print(){
        String all;
        int done = 0;
        int spentHours = 0;
        all = "Kurssi: " + summary.getName() + ", " + summary.getTerm() + "\n"
                + "Opiskelijanumero: " + subs[0].getStudent_number() + "\n" ;
        
        for (Submission submission : subs) {
            all = all + "viikko " + submission.getWeek() + ": tehtyjä tehtäviä yhteensä: "
                    + submission.getCalculator() + "(maksimi " + summary.getWeek(Integer.parseInt(submission.getWeek()))
                    + "), " + "aikaa kului " + submission.getHours() + " tuntia, tehdyt tehtävät: "
                    + submission.getTasks() + "\n";
            done += Integer.parseInt(submission.getCalculator());
            spentHours += Integer.parseInt(submission.getHours());            
        }
        all = all + "yhteensä: " + done + " tehtävää " + spentHours + " tuntia";
        
        return all;
    }
    
}
