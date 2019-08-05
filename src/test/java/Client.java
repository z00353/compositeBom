// Run the application

public class Client {
    public static void main(String[] args) {
        // Building the composite, tree structure
        // Here we can add as many pieces to the composites as we want
        Component mainboard = new Mainboard("Mainboard", 100);
        mainboard.add(new Processor("Processor", 100));
        mainboard.add(new Memory("Memory", 100));

        // Adding the created objects(mainboard with processor and memory)
        // to the chassis
        Component chassis = new Chassis("Chassis", 200);
        chassis.add(mainboard);
        // And just adding a new piece Disk
        chassis.add(new Disk("Disk", 100));

        // Clients can treat the hierarchy as a single object.
        // If the receiver is a leaf,
        // the request is performed directly.
        // If the receiver is a composite,
        // the request is forwarded to its child components recursively.

        System.out.println(chassis.getName() + " Total price: " + chassis.getPrice());
        System.out.println(mainboard.getName() + " Total price: " + mainboard.getPrice());
    }
}
