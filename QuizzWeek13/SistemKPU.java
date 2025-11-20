package QuizzWeek13;
import java.util.Scanner;

public class SistemKPU {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Input region: ");
        int jumlahDaerah = sc.nextInt();

        System.out.print( "how many candidate: ");
        int jumlahKandidat = sc.nextInt();

        int[][] votes = new int[jumlahDaerah][jumlahKandidat];

        for (int i = 0; i < jumlahDaerah; i++) {
            System.out.println("Region " + (i + 1) + ":");
            for (int j = 0; j < jumlahKandidat; j++) {
                System.out.print("  Votes for Candidate " + (j + 1) + ": ");
                votes[i][j] = sc.nextInt();
            }
        }
        //this is for table
        System.out.println("Vote Results Table:" );
        System.out.print("Region");
        for (int j = 0; j < jumlahKandidat; j++) {
            System.out.print("Candidate " + (j + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < jumlahDaerah; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < jumlahKandidat; j++) {
                System.out.print(votes[i][j] + "\t\t");
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

        // Calculate total votes overall
        int totalVotes = 0;
        for (int vote : totalVotesPerCandidate) {
            totalVotes += vote;
        }

        // Display percentages for each candidate
        System.out.println("\nPercentage for each candidate:");
        for (int j = 0; j < jumlahKandidat; j++) {
            double percentage = (totalVotes > 0) ? (double) totalVotesPerCandidate[j] / totalVotes * 100 : 0;
            System.out.printf("Candidate %d: %.2f%%\n", (j + 1), percentage);
        }

        // Determine winner for each region
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

        sc.close();
    }   
    

}
