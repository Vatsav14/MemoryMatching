# MemoryMatching
Since I lost the code for the original Memory Matching game that I made 2 years ago as a group, I decided to remake the game using the concepts I learnt ever since then as a throwback to simpler times. Surprisingly enough, I was able to condense all the code for the game mechanics into about 50 to 75 lines. 

NOTE: This version has no database connectivity since I felt it was quite pointless to implement it in a nostalgia piece. I might add it in at a later date since it's just 10 - 15 lines of code, apart from creating the database again using MySQL.

# Objective
This game has a 4 x 4 grid containing empty tiles. Each tile has a certain image associated with it which it shares with another random tile on the grid. There are 8 such pairs of tiles with corresponding images. The objective of the game is to match all the corresponding tiles using the least amount of attempts and as fast as possible (Since time taken is also recorded in this version). The least number of tries I managed to record was 3 failed attempts.

**The placement of the tiles is randomized every time the game is fired up so that the game does not become repetitive and boring.** _(Also, it wouldn't have been any fun to code it like that)_

# Sample Playthrough
Below are a few sample animations of what the game looks like and the various scenarios that are possible.

## What happens when you don't get 2 matching tiles

The animation below shows what happens when the player is unable to match 2 similar tiles. A dialogue box pops up, saying that the tiles chosen did not have the same image, and 1 failed attempt is added on to your total attemps.

![Memory Game Mismatch Demo](https://github.com/Vatsav14/Project-Pictures/blob/master/Memory/MM-Mismatch.gif)
