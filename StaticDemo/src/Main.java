public class Main {
    public static void main(String[] args) {
        Department dpt1 = new Department("Admin");
        System.out.println("Department Name:"+dpt1.name+",Number of Workers (Static):"+Department.numberOfWorker
                +",Number of Workers (Non-Static):"+dpt1.numOfWorkers); // output: 1

        Department dpt2 = new Department ("Finance");
        System.out.println("Department Name:"+dpt2.name+",Number of Workers (Static):"+Department.numberOfWorker
                +",Number of Workers (Non-Static):"+dpt2.numOfWorkers); // output: 2

        Department dpt3 = new Department ("Software");
        System.out.println("Department Name:"+dpt3.name+",Number of Workers (Static):"+Department.numberOfWorker
                +",Number of Workers (Non-Static):"+dpt3.numOfWorkers); // output: 3
    }
}