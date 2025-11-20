Program Start

Initialize Scanner for input

Prompt user: "Input region: "
Read integer: jumlahDaerah (number of regions)

Prompt user: "how many candidate: "
Read integer: jumlahKandidat (number of candidates)

Create 2D array votes[jumlahDaerah][jumlahKandidat]

7. For each region i from 0 to jumlahDaerah - 1:
   a. Print "Region " + (i + 1) + ":"
   b. For each candidate j from 0 to jumlahKandidat - 1:
      i. Prompt: "  Votes for Candidate " + (j + 1) + ": "
      ii. Read integer into votes[i][j]

8. Print empty line
9. Print "Vote Results Table:"
10. Print "-------------------"
11. Print "Region "
12. For each candidate j from 0 to jumlahKandidat - 1:
    a. Print "Candidate " + (j + 1) + " "
13. Print new line

14. For each region i from 0 to jumlahDaerah - 1:
    a. Print (i + 1) + " "
    b. For each candidate j from 0 to jumlahKandidat - 1:
       i. Print votes[i][j] + "          "
    c. Print new line

15. Create array totalVotesPerCandidate[jumlahKandidat]
16. For each candidate j from 0 to jumlahKandidat - 1:
    a. Initialize totalVotesPerCandidate[j] = 0
    b. For each region i from 0 to jumlahDaerah - 1:
       i. totalVotesPerCandidate[j] += votes[i][j]

17. Initialize totalVotes = 0
18. For each vote in totalVotesPerCandidate:
    a. totalVotes += vote

19. Print empty line
20. Print "Percentage for each candidate:"
21. For each candidate j from 0 to jumlahKandidat - 1:
    a. If totalVotes > 0:
       i. percentage = (totalVotesPerCandidate[j] / totalVotes) * 100
    b. Else:
       i. percentage = 0
    c. Print "Candidate " + (j + 1) + ": " + percentage + "% "

22. Print empty line
23. Print "Winner for each region:"
24. For each region i from 0 to jumlahDaerah - 1:
    a. Initialize maxVotes = 0
    b. Initialize winnerCandidate = -1
    c. For each candidate j from 0 to jumlahKandidat - 1:
       i. If votes[i][j] > maxVotes:
          - maxVotes = votes[i][j]
          - winnerCandidate = j + 1
    d. Print "Region " + (i + 1) + ": Candidate " + winnerCandidate + " with " + maxVotes + " votes"

25. Close Scanner

Program End
