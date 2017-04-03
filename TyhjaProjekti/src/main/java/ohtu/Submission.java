package ohtu;

public class Submission {
    private String student_number;
    private String week;
    private String printTask;
    private String a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21;
    private String[] tasks;
    private String calculator;
    private int calc;
    private String hours;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
    
    public String getWeek() {
        return week;
    }
    
    public String getTasks(){
        String tasklist = "";
        calc = 0;
        tasks = new String[]{a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21};
        for (int i = 0; i < 21; i++){
            if (getTaskValue(tasks[i])){
                int help = i + 1;
                tasklist = tasklist + " " + help; 
                calc++;
            }
        }
       return tasklist;
    }
    
    public boolean getTaskValue(String t){
        if (t == null)
            return false;
        return true;
    }
    
    
    
    public String getCalculator(){
        this.getTasks();
        calculator = "" + calc;
        return calculator;
    }
    
    public String getHours(){
        return hours;
    }
       
        
    
    

    @Override
    public String toString() {
        return "Opiskelijanumero: " + student_number + "\n" 
                + "viikko: " + week + " tehtyjä tehtäviä yhteensä: " + getCalculator() +
                ", aikaa kului " + hours + " tunti, tehdyt tehtävät: " + getTasks();
    }
    
}