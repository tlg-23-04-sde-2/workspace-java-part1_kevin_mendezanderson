/*
 * Business class, also known as a system class to model the workings of a television.
 */
class Television {
    //static variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static int instanceCount = 0;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    public static int getInstanceCount() {
        return instanceCount;
    }

    //instance variables or fields ( properties, attributes, date)
    private String brand = "Toshiba"; // initializer
    private int volume = 1; //default value / initializer
    private DisplayType display = DisplayType.LED;
    private boolean isMuted;
    private int oldVolume;

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

    public Television(String brand, int volume, DisplayType display){
        this(brand,volume);
        setDisplay(display);
    }
    private static boolean isValid(String brand){
        boolean valid = false;
        for (String s : VALID_BRANDS){
            if (brand.equals(VALID_BRANDS)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    // Business methods or operations
    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your "+ getBrand() +" TV volume to " + getVolume());

    }
    public void turnOff(){
        System.out.println("Turning off tv");
    }
    private boolean verifyInternetConnection(){
        return true;
    }

    private void mute(){
        if (!isMuted) {
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else{
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    //getters and setters
    public String getBrand() {
        return brand;
    }
    public int getVolume() {
        return volume;
    }
    public void setBrand(String brand) {
        if (isValid(brand)) {
            this.brand = brand;
        }
        else {
            System.out.println("Error setting the brand");
        }
    }
    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <=MAX_VOLUME){
            this.volume = volume;
        }
        else {
            System.out.println("Invalid, volume set to: " + volume);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    // generate to strings method
    public String toString(){
        return "Television: " + getBrand() + " " + getVolume() + " " + getDisplay();
    }
}
