/*
 * Business class, also known as a system class to model the workings of a television.
 */
class Television {
    //static variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 0;
    public static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    //instance variables or fields ( properties, attributes, date)
    private String brand = "Toshiba"; // initializer
    private int volume = 1; //default value / initializer

    //Constructors
    public Television(){
        instanceCount++;
    }
    public Television(String brand){
        this();
        setBrand(brand);
    }
    public Television(String brand, int volume){
        this(brand);
        setVolume(volume);
    }

    // Business methods or operations
    public void TurnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your "+ getBrand() +" TV volume to " + getVolume());

    }
    public void TurnOff(){
        System.out.println("Turning off tv");
    }
    private boolean verifyInternetConnection(){
        return true;
    }
    //getters and setters
    public String getBrand() {
        return brand;
    }
    public int getVolume() {
        return volume;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }


    // generate to strings method
    public String toString(){
        return "Television: " + getBrand() + " " + getVolume();
    }
}
