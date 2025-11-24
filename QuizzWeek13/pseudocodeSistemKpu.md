Start

Initialize Scanner for input

input user: "Input region: "
integer: jumlahDaerah (number of regions)

input user: "how many candidate: "
integer: jumlahKandidat (number of candidates)

Create 2D array votes[jumlahDaerah][jumlahKandidat]

For each region i from 0 to jumlahDaerah - 1:
   a. Print "Region " + (i + 1) + ":"
   b. For each candidate j from 0 to jumlahKandidat - 1:
      i. Prompt: "  Votes for Candidate " + (j + 1) + ": "
      ii. Read integer into votes[i][j]

Print empty line
Print "Vote Results Table:"
Print "-------------------"
Print "Region "
For each candidate j from 0 to jumlahKandidat - 1:
    a. Print "Candidate " + (j + 1) + " "
Print new line

For each region i from 0 to jumlahDaerah - 1:
    a. Print (i + 1) + " "
    b. For each candidate j from 0 to jumlahKandidat - 1:
       i. Print votes[i][j] + "          "
    c. Print new line

Create array totalVotesPerCandidate[jumlahKandidat]
For each candidate j from 0 to jumlahKandidat - 1:
    a. Initialize totalVotesPerCandidate[j] = 0
    b. For each region i from 0 to jumlahDaerah - 1:
       i. totalVotesPerCandidate[j] += votes[i][j]

Initialize totalVotes = 0
For each vote in totalVotesPerCandidate:
    a. totalVotes += vote

Print empty line
Print "Percentage for each candidate:"
For each candidate j from 0 to jumlahKandidat - 1:
    a. If totalVotes > 0:
       i. percentage = (totalVotesPerCandidate[j] / totalVotes) * 100
    b. Else:
       i. percentage = 0
    c. Print "Candidate " + (j + 1) + ": " + percentage + "% "

Print empty line
Print "Winner for each region:"
For each region i from 0 to jumlahDaerah - 1:
    a. Initialize maxVotes = 0
    b. Initialize winnerCandidate = -1
    c. For each candidate j from 0 to jumlahKandidat - 1:
       i. If votes[i][j] > maxVotes:
          - maxVotes = votes[i][j]
          - winnerCandidate = j + 1
    d. Print "Region " + (i + 1) + ": Candidate " + winnerCandidate + " with " + maxVotes + " votes"

Close Scanner

End
