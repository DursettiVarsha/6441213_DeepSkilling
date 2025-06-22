public class Test {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel Core i3")
                .setRAM("8GB")
                .build();

        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11 Pro")
                .build();
        System.out.println("=== Basic Computer ===");
        System.out.println(basicComputer);

        System.out.println("\n=== Gaming Computer ===");
        System.out.println(gamingComputer);
    }
}
