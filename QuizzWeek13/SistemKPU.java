package QuizzWeek13;
import java.util.Scanner;

public class SistemKPU {
    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);

        //input
        System.out.print("Input region: ");
        int jumlahDaerah = masuk.nextInt();

        System.out.print( "how many candidate: ");
        int jumlahKandidat = masuk.nextInt();

        int[][] votes = new int[jumlahDaerah][jumlahKandidat];

        for (int i = 0; i < jumlahDaerah; i++) {
            System.out.println("Region " + (i + 1) + ":");
            for (int j = 0; j < jumlahKandidat; j++) {
                System.out.print("  Votes for Candidate " + (j + 1) + ": ");
                votes[i][j] = masuk.nextInt();
            }
        }
        //this is for table
        System.out.println();
        System.out.println("Vote Results Table:" );
        System.out.println("-------------------");
        System.out.print("Region ");
        for (int j = 0; j < jumlahKandidat; j++) {
            System.out.print("Candidate " + (j + 1) + " ");
        }

        System.out.println();

        for (int i = 0; i < jumlahDaerah; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < jumlahKandidat; j++) {
                System.out.print(votes[i][j] + "          ");
            }
            System.out.println();
        }

        //this calculates total per candidate
        int[] totalVotesPerCandidate = new int[jumlahKandidat];
        for (int j = 0; j < jumlahKandidat; j++) {
            for (int i = 0; i < jumlahDaerah; i++) {
                totalVotesPerCandidate[j] += votes[i][j];
            }
        }

        //this one Calculate total votes overall
        int totalVotes = 0;
        for (int vote : totalVotesPerCandidate) {
            totalVotes += vote;
        }

        //this is for displaying precentage
        System.out.println("");
        System.out.println("Percentage for each candidate:");
        for (int j = 0; j < jumlahKandidat; j++) {
            double percentage = (totalVotes > 0) ? (double) totalVotesPerCandidate[j] / totalVotes * 100 : 0;
            System.out.printf("Candidate %d: %.2f%% ", (j + 1), percentage);
        }

        //this is the winner from each region
        System.out.println("");
        System.out.println("\nWinner for each region:");
        for (int i = 0; i < jumlahDaerah; i++) {
            int maxVotes = 0;
            int winnerCandidate = -1;
            for (int j = 0; j < jumlahKandidat; j++) {
                if (votes[i][j] > maxVotes) {
                    maxVotes = votes[i][j];
                    winnerCandidate = j + 1;
                }
            }
            System.out.println("Region " + (i + 1) + ": Candidate " + winnerCandidate + " with " + maxVotes + " votes");
        }

        masuk.close();
    }   
    

}
