package db;

class PaintSimulation {
    private int[] arrival_times = new int[100];//Holds the arrival times distribution
    private int[] service_times = new int[100];//Holds the service times distribution
    private int[] service_start_times = new int[100];//Holds the service start times
    private int[] completion_times = new int[100];//Holds the completion times

    public PaintSimulation(){
        //Initialize the simulation
        arrival_times[0] = 0; //The first part arrives at t = 0
        for(int i = 0; i < 49; i++){
            arrival_times[i+1] = arrival_times[i] + 3;
        }
        arrival_times[50] = arrival_times[49] + 7;
        for(int i = 50; i < 99; i++){
            arrival_times[i+1] = arrival_times[i] + 7;
        }
        for(int i = 0; i < 100; i++){
            service_times[i] = 5;//5 time units to serve each part
        }
    }

    public void setServiceStartTime(int part){
        if(part == 0) return; //the service_start_time of part 0 is 0
        service_start_times[part] = Math.max(arrival_times[part], 
            completion_times[part - 1]);
    }

    public void setCompletionTime(int part){
        completion_times[part] = service_start_times[part] + service_times[part];
    }

    public void showSystemState(int part){
        System.out.println(part + "\t" + arrival_times[part] + "\t" +
            service_start_times[part] + "\t" + service_times[part] + "\t" +
            completion_times[part]);
    }

    public void run(){
        System.out.println("Part" + "\t" + "Arrival" + "\t" +
            "InPress" + "\t" + "Serve" + "\t" +
            "Done");
        for(int i = 0; i < 100; i++){
            setServiceStartTime(i);
            setCompletionTime(i);
            showSystemState(i);
        }   
    }

    public static void main(String[] args){
        PaintSimulation sim = new PaintSimulation();
        //sim.showDistributions();//Uncoment to show the arrival and service distributions
        sim.run();

    }
    
    public void showDistributions(){
        System.out.println("Arrival Times");
        for(int i = 0; i < 100; i++){
            System.out.println("Part " + (i) + "\t- " + arrival_times[i]);  
        }
        System.out.println("Service Times");
        for(int i = 0; i < 100; i++){
            System.out.println("Part " + (i) + "\t- " + service_times[i]);  
        }
    }
}
