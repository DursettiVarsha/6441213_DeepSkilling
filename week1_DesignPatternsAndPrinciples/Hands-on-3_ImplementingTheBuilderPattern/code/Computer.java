public class Computer {
    // Required and optional attributes
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicCard;
    private String operatingSystem;

    //Private constructor 
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicCard = builder.graphicCard;
        this.operatingSystem = builder.operatingSystem;
    }
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicCard;
        private String operatingSystem;
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Builder setGraphicCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }
        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer Configuration:\n" + "CPU: " + CPU + "\n" + "RAM: " + RAM + "\n" + "Storage: " + storage + "\n" + "Graphics Card: " + (graphicCard != null ? graphicCard : "None") + "\n" + "OS: " + (operatingSystem != null ? operatingSystem : "Not Installed");
    }
}
