public class Primitive_Datatypes {
    public static void main(String[] args) {

        // 1. PRIMITIVE DATA TYPES
        int stepsTaken = 8420;             // Whole number for counting steps
        double distanceKm = 6.12;          // Decimal number for exact distance
        char batteryStatus = 'A';          // Single character grading battery health (A = Excellent)
        boolean isSyncing = true;          // True/False flag for connection status

        // 2. NON-PRIMITIVE DATA TYPES
        String userName = "Vish";          // Text string for the user profile

        // Array holding step counts for the last 3 days
        int[] historyThreeDays = {7500, 10200, 8420};

        // --- Displaying the Dashboard ---
        System.out.println("=== FITNESS TRACKER DASHBOARD ===");
        System.out.println("User: " + userName);
        System.out.println("Steps Today: " + stepsTaken + " steps");
        System.out.println("Distance Covered: " + distanceKm + " km");
        System.out.println("Battery Grade: " + batteryStatus);
        System.out.println("Data Sync Active: " + isSyncing);

        System.out.println("\n--- Historical Data ---");
        System.out.println("Steps 2 days ago: " + historyThreeDays[0]);
        System.out.println("Steps yesterday: " + historyThreeDays[1]);

        // Simple logic using our boolean and numeric types
        if (stepsTaken >= 10000) {
            System.out.println("\nStatus: Goal achieved! 🎉");
        } else {
            int stepsLeft = 10000 - stepsTaken;
            System.out.println("\nStatus: " + stepsLeft + " steps away from your daily goal.");
        }
    }
}