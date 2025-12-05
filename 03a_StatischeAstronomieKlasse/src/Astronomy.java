public class Astronomy {
    public static double AverageSpeedOfRocketKmPerHour = 40000;
    public static double DistanceToMercuryMioKm = 91.7;
    public static double DistanceToVenusMioKm = 41.4;
    public static double DistanceToMarsMioKm = 78.0;
    public static double DistanceToJupiterMioKm = 628.7;
    public static double DistanceToSaturnMioKm = 1275;
    public static double DistanceToUranusMioKm = 2724;
    public static double DistanceToNeptuneMioKm = 4351;
    public static int million = 1000000;

    public static double getTravellingHoursToVenus(double travellingSpeedKmPerHour) {
        return travellingSpeedKmPerHour = (DistanceToVenusMioKm * million) / AverageSpeedOfRocketKmPerHour;
    }

    public static double getTravellingDaysToVenus(double travellingSpeedKmPerHour) {
       return getTravellingHoursToVenus(travellingSpeedKmPerHour)/24;
    }

    public static double getTravellingHoursToMars(double travellingSpeedKmPerHour) {
        return travellingSpeedKmPerHour = (DistanceToMarsMioKm * million) / AverageSpeedOfRocketKmPerHour;
    }

    public static double getTravellingDaysToMars(double travellingSpeedKmPerHour) {
        return getTravellingHoursToMars(travellingSpeedKmPerHour)/24;
    }
}