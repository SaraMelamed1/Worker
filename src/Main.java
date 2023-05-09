public class Main {
    public static void main(String[] args) {
        Worker worker=new Worker("shai","givati",6000,15);
        System.out.println(worker);
    }




    public static String getNameCompany(Company[]companies){
        String nameCompany=companies[0].getNameCompany();
        int bestSalaryTotal=companies[0].totalPayments();
        for(int i=0;i<companies.length;i++){
            if(companies[i].totalPayments()>bestSalaryTotal) {
                bestSalaryTotal = companies[i].totalPayments();
                nameCompany=companies[i].getNameCompany();
            }
        }
        return nameCompany;
    }
}