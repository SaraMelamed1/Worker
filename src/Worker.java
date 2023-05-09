public class Worker {
    private String firstName;
    private String lastName;
    private int salary;
    private int yearOfSeniority;


    public Worker(String firstName,String lastName,int salary,int yearOfSeniority){
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
        this.yearOfSeniority=yearOfSeniority;
    }


    public boolean isNew(){
        boolean newWorker=false;

        if(this.yearOfSeniority<=3){
            newWorker=true;
        }
        return newWorker;
    }



    public boolean isSenior(){
        boolean isSenior=false;
        if(this.salary>=15000 && !isSenior){
            isSenior=true;
        }
        return isSenior;
    }
    public String toString(){
        String output="";
        output+="Worker"+this.firstName+" "+this.lastName;
        if(!isSenior()){
            output+="is not senior";
        }
        else{
            output+="is senior";
        }
        return output;
    }

    public int getSalary() {
        return salary;
    }
}
