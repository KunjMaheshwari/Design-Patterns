// 1️⃣ Step 1: Create a Product (e.g., House) class
class House {
    private String roof;
    private String walls;
    private String windows;
    private String doors;

    // Getters for the House properties
    public String getRoof() {
        return roof;
    }

    public String getWalls() {
        return walls;
    }

    public String getWindows() {
        return windows;
    }

    public String getDoors() {
        return doors;
    }

    // Step 2: Make a Builder class to build the house in steps
    static class HouseBuilder {
        private String roof;
        private String walls;
        private String windows;
        private String doors;

        // Methods to set each part of the house
        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setWindows(String windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder setDoors(String doors) {
            this.doors = doors;
            return this;
        }

        // Final step to get the complete house
        public House build() {
            House house = new House();
            house.roof = this.roof;
            house.walls = this.walls;
            house.windows = this.windows;
            house.doors = this.doors;
            return house;
        }
    }
}

// 2️⃣ Step 3: Use the Builder to create a House object
public class BuilderPatternExample {
    public static void main(String[] args) {
        // Creating a House using the builder
        House house = new House.HouseBuilder()
                            .setRoof("Tile Roof")
                            .setWalls("Brick Walls")
                            .setWindows("Glass Windows")
                            .setDoors("Wooden Doors")
                            .build();
        
        // Output the house details
        System.out.println("House Details:");
        System.out.println("Roof: " + house.getRoof());
        System.out.println("Walls: " + house.getWalls());
        System.out.println("Windows: " + house.getWindows());
        System.out.println("Doors: " + house.getDoors());
    }
}
