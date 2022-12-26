public abstract class Phone {

    private String name;
    private String model;
    private String OperatingSystem;
    private int RAM;
    private int MainMemory;
    


    public Phone(String name, String model, String OperatingSystem, int RAM, int MainMemory) {
        this.name = name;
        this.model = model;
        this.OperatingSystem = OperatingSystem;
        this.RAM = RAM;
        this.MainMemory = MainMemory;

    }

    protected Phone() {
    }


    public String toString() {
        return "Phone"
                + "\nname=" + name
                + "\nmodel=" + model
                + "\nOperatingSystem=" + OperatingSystem
                + "\nRAM =" + RAM
                + "\nMainMemory =" + MainMemory;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public int getMainMemory() {
        return MainMemory;
    }

    public void setMainMemory(int mainMemory) {
        MainMemory = mainMemory;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }


    }



