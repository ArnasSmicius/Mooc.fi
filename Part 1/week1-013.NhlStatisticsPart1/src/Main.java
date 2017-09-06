import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        NHLStatistics.sortByGoals();  //Print the top ten players based on goals
        NHLStatistics.top(10);

        NHLStatistics.sortByPenalties();  //Print the top 25 players based on penalty amounts
        NHLStatistics.top(25);

        NHLStatistics.searchByPlayer("Sidney Crosby");  //Print the statistics for Sidney Crosby

        NHLStatistics.teamStatistics("PHI");  //Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in which order the players are printed in and why that might be!

        NHLStatistics.sortByPoints();       //Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
        NHLStatistics.teamStatistics("ANA");
    }
}
        