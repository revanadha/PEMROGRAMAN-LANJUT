import Modul2.Tugas3.TicketInfo;

public class MainApp {
    static final double MIN_SPEED = 5;
    static final double MAX_SPEED = 100;

    public static void main(String[] args){
        TaxiTicket ticket = new TaxiTicket(new TicketInfo("Revan", "pakis", "landungsari", 50), 50.000, 60);

        ticket.detailedInfo();

        ticket.checkStatus();

        ticket.displayRoute();
        ticket.displayEstimatedDuration();

        ticket.sLowDown(20);
        ticket.speedUp(15);
    }
}
