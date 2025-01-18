Features
* timed
* undo feature
* spectated
* statistics

other features (hard to implement)
1. tournaments
2. AI
3. ratings change


# Designing
# 1. class 1 Board

### 1.1 3x3 Matrix Example
| a11 | a12 | a13 |
|-----|-----|-----|
| a21 | a22 | a23 |
| a31 | a32 | a33 |


--> square[n][n]

* square[i][j] = int => {0,1,2}

### 1.2 Storing the winner
* first 
* second
* draw
* undecided

### 1.3 behaviour
* initialize()
* getboard()
* getwinner()
* getcurrentplayer()
* makemove (move->(int player, int i, int j))

# 2. class 2 User
1. userid
2. stats(wins, losses, ratings more feature based)

# 3. class 3 Games
1. Gameid
2. userID1
3. userID2
4. List `<Moves>`

**determine the winner when the player is making a move and the place where the move is made should be a part of the winning move**

