package academy.learnprogramming;

public class ZooAnimals {
    private int enclosure;
    private String area;
    private String fromcountry;
    private boolean isOpen;

    public ZooAnimals( int enclosure, String area, String fromcountry, boolean isOpen) {
        this.enclosure = enclosure;
        this.area = area;
        this.fromcountry = fromcountry;
        this.isOpen = isOpen;
    }

    public void moved(int enclosure){
        System.out.println(" moved from enclosure: "+this.enclosure+"to enclosure: "+enclosure);
    }

    public int getEnclosure() {
        return enclosure;
    }

    public String getArea() {
        return area;
    }

    public String getFromcountry() {
        return fromcountry;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
