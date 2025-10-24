import Modul2.Tugas3.TicketInfo;

public class TaxiTicket extends Ticket implements Operational {
    public static final double TAX_RATE = 0.1;
    private double duration;
    private double speed;

    public TaxiTicket(TicketInfo ticketInfo, double price, double duration ){
        super(ticketInfo.passenggerName(), ticketInfo.startLocation(), ticketInfo.destination(), price);
        this.duration = duration;
    this.speed = ticketInfo.speed();
    }

    public void checkStatus(){
        System.out.println("taxi otw samm, sabar yaww" + destination);
    }
    public void displayEstimatedDuration(){
        System.out.println("estimasi perjalanan anda" + duration + "menit");
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
        System.out.println("nama penumpang : " + passenggerName);
        System.out.println("lokasi awal : " + startLocation);
        System.out.println("tujuan : " + destination) ;
        System.out.println("harga : " + price);
        System.out.println("harga final :" + calculateFinalPrice());
    }

    private double calculateFinalPrice() {
        return price + (price * TAX_RATE);
    }

    public void detailedInfo(){
        displayInfo();
        System.out.println("Duration    : " + duration + "minutes");
        System.out.println("Speed      : " + speed + "km/h");
    }
}