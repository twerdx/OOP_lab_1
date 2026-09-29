package myFiles.Flowers;
public abstract class Flower {
    private String name;
    private int price;
    private int stemLength;
    private int freshness;
    public Flower(String name, int price, int stemLength, int freshness) {
        this.name = name;
        this.price = price;
        this.stemLength = stemLength;
        this.freshness = freshness;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    public int getStemLength() {return stemLength;}
    public void setStemLength(int stemLength) {this.stemLength = stemLength;}
    public int getFreshness() {return freshness;}
    public void setFreshness(int freshness) {this.freshness = freshness;}
}