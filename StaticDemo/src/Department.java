public class Department {
    public static int numberOfWorker= 0;
    public int numOfWorkers = 0;
    public String name;

    public Department(String name) {
        this.name = name;
        numberOfWorker=0;
        numberOfWorker++; // increment the static variable every time a new Person is created
        numOfWorkers++;
    }
}
