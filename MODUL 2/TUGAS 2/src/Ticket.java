public class Ticket {
    public String passenggerName;
    public String startLocation;
    public String destination;
    public double price;

    public Ticket(String passenggerName, String startLocation, String destination, double price) {
        this.passenggerName = passenggerName;
        this.startLocation = startLocation;
        this.destination = destination;
        this.price = price;
    }

    public void displayRoute() {
        System.out.println("rute anda adalah : " + startLocation + "-->" + destination);
    }
}
