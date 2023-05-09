public class Company {
    private String nameCompany;
    private Worker[]workers;


    public Worker[] getSeniorWorkers() {
        int count = 0;
        Worker[] seniorWorker = null;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].isSenior() == true) {
                count++;
            }
        }
        seniorWorker = new Worker[count];
        int index = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].isSenior() == true) {
                seniorWorker[index] = workers[i];
                index++;
            }
        }
        return seniorWorker;
    }
    public Worker[] getNoneSeniorWorkers(){
        int count = 0;
        Worker[] seniorWorker = null;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].isSenior() == false) {
                count++;
            }
        }
        seniorWorker = new Worker[count];
        int index = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].isSenior() == false) {
                seniorWorker[index] = workers[i];
                index++;
            }
        }
        return seniorWorker;
    }
    public Worker getHighestPaidNonSeniorWorker(){
        Worker bigWorker=workers[0];
        int bestSalary=workers[0].getSalary();
        for(int i=0;i<workers.length;i++){
            if(workers[i].isSenior()==false){
                if(workers[i].getSalary()>bestSalary){
                    bestSalary=workers[i].getSalary();
                    bigWorker=workers[i];
                }
            }
        }
        return bigWorker;
    }

    public int totalPayments(){
        int sum=0;
        for(int i=0;i<workers.length;i++){
            sum+=workers[i].getSalary();
        }
        return sum;
    }

    public String getNameCompany() {
        return nameCompany;
    }
}
