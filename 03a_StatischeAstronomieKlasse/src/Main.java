public static void main(String[] args) {

        System.out.println(
                "Eine Reise zur Venus ist " + Astronomy.DistanceToVenusMioKm + " Millionen Kilometer\n" +
                        "und dauert mit durchschnittlicher Geschwindigkeit von " + Astronomy.AverageSpeedOfRocketKmPerHour + " km/h\n" +
                        Astronomy.getTravellingHoursToVenus(Astronomy.AverageSpeedOfRocketKmPerHour) + " Stunden\n" +
                        "oder " + Astronomy.getTravellingDaysToVenus(Astronomy.AverageSpeedOfRocketKmPerHour) + " Tage"
        );

        System.out.println("*****************************************************************************");

        System.out.println(
                "Eine Reise zum Mars ist " + Astronomy.DistanceToMarsMioKm + " Millionen Kilometer\n" +
                        "und dauert mit durchschnittlicher Geschwindigkeit von " + Astronomy.AverageSpeedOfRocketKmPerHour + " km/h\n" +
                        Astronomy.getTravellingHoursToMars(Astronomy.AverageSpeedOfRocketKmPerHour) + " Stunden\n" +
                        "oder " + Astronomy.getTravellingDaysToMars(Astronomy.AverageSpeedOfRocketKmPerHour) + " Tage"
        );

        System.out.println("*****************************************************************************");

        System.out.println("Distanz zu Merkur: " + Astronomy.DistanceToMercuryMioKm + " Millionen Kilometer");
        System.out.println("Distanz zu Venus: " + Astronomy.DistanceToVenusMioKm + " Millionen Kilometer");
        System.out.println("Distanz zu Mars: " + Astronomy.DistanceToMarsMioKm + " Millionen Kilometer");
        System.out.println("Distanz zu Jupiter: " + Astronomy.DistanceToJupiterMioKm + " Millionen Kilometer");
        System.out.println("Distanz zu Saturn: " + Astronomy.DistanceToSaturnMioKm + " Millionen Kilometer");
        System.out.println("Distanz zu Uranus: " + Astronomy.DistanceToUranusMioKm + " Millionen Kilometer");
        System.out.println("Distanz zu Neptun: " + Astronomy.DistanceToNeptuneMioKm + " Millionen Kilometer");
}
