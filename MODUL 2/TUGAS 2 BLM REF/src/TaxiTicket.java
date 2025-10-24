public class TaxiTicket {
    public String passengerName;
    public String startLocation;
    public String destination;
    public double price;
    private double duration;
    private double speed;

    public TaxiTicket(String passenggerName, String startLocation, String destination, double price, double duration, double speed ){
    this.passengerName = passenggerName;
    this.startLocation = startLocation;
    this.destination = destination;
    this.price = price;
    this.duration = duration;
    this.speed = speed;
    }

    public void checkStatus(){
        System.out.println("taxi otw samm, sabar yaww" + destination);
    }
    public void displayEestimatedDuration(){
        System.out.println("estimasi perjalanan anda" + duration + "menit");
    }
    public void displayRoute(){
        System.out.println("rute anda adalah : "+ startLocation + "-->" + destination);
    }

    public void sLowDown(double speedReduction){
        speed -= speedReduction;
        if (speed < MainApp.MIN_SPEED)
            speed = MainApp.MIN_SPEED;
        duration += speedReduction * 0.5;
        System.out.println("pelan pelan pak supirrrr, kecepatanmu : " + speed + "km/h");
    }

    public void speedUp(double speedIncrease){
        speed += speedIncrease;
        if (speed > MainApp.MAX_SPEED)
            speed =  MainApp.MAX_SPEED;
        System.out.println("gaspoll pakkk kecepatanmu :" + speed + "km/h");
    }
    public void displayInfo(){
        System.out.println("nama penumpang : " + passengerName);
        System.out.println("lokasi awal : " + startLocation);
        System.out.println("tujuan : " + destination) ;
        System.out.println("harga : " + price);
        System.out.println("harga final :" + (price + calculateFinalPrice()));
    }

    private double calculateFinalPrice() {
        return price * TAX_RATE();
    }

    private static double TAX_RATE() {
        return 0.1;
    }

    public void detailedInfo(){
        displayInfo();
        System.out.println("Duration    : " + duration + "minutes");
        System.out.println("Speed      : " + speed + "km/h");
    }
}