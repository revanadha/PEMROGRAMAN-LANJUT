public class MainApp {
    static final double MIN_SPEED = 5;
    static final double MAX_SPEED = 100;

    public static void main(String[] args) {
        TaxiTicket ticket = new TaxiTicket("Julian", "lamongan", "malang", 50.000, 60, 50);

        ticket.detailedInfo();

        ticket.checkStatus();

        ticket.displayRoute();
        ticket.displayEestimatedDuration();

        ticket.sLowDown(20);
        ticket.speedUp(15);
    }
}
