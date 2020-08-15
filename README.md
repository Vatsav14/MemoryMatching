# MemoryMatching
Since I lost the files for the original Memory Matching game that I made 2 years ago in a group, I decided to remake the game using the concepts I learnt ever since then as a throwback to simpler times. Surprisingly enough, I was able to condense all the code for the game mechanics into about 50 to 75 lines. 

NOTE: This version has no database connectivity since I felt it was quite pointless to implement it in a nostalgia piece. I might add it in at a later date since it's just 10 - 15 lines of code, apart from creating the database again using MySQL.

# Objective
This game has a 4 x 4 grid containing empty tiles. Each tile has a certain image associated with it which it shares with another random tile on the grid. There are 8 such pairs of tiles with corresponding images. The objective of the game is to match all the corresponding tiles using the least amount of attempts and as fast as possible (Since time taken is also recorded in this version). The least number of tries I managed to record was 3 failed attempts.

**The placement of the tiles is randomized every time the game is fired up so that the game does not become repetitive and boring.** _(Also, it wouldn't have been any fun to code it like that)_

# Sample Playthrough
Below are a few sample animations of what the game looks like and the various scenarios that are possible.

## What happens when you don't get 2 matching tiles

The animation below shows what happens when the player is unable to match 2 similar tiles. A dialogue box pops up, saying that the tiles chosen did not have the same image, and 1 failed attempt is added on to your total attemps.

![Memory Game Mismatch Demo](https://github.com/Vatsav14/Project-Pictures/blob/master/Memory/MM-Mismatch.gif)

## What happens when you get 2 matching tiles

The animation below shows what happens when the player matches 2 similar tiles. A dialogue box pops up, saying that the tiles chosen were a valid pair. This matched pair now turns gray, disabling them, signifying you can't click them again.

![Memory Game Match Demo](https://github.com/Vatsav14/Project-Pictures/blob/master/Memory/MM-Match.gif)

## What happens when you match all the possible pairs

The animation below shows what happens when the player manages to match all 8 pairs in the grid. A final dialogue box pops up showing how many failed attempts the player had and the time they took to match all the pairs

![Memory Game Game Over Demo](https://github.com/Vatsav14/Project-Pictures/blob/master/Memory/MM-GameOver.gif)

## Restarting the game if you want to play again

When the player completes the game, an button appears above the Help button asks whether the player wants to Start Over. As you can see in the following animation, the positions of the tiles are randomized every time the game starts to reduce repetitiveness. 

![Memory Game Start Over Demo](https://github.com/Vatsav14/Project-Pictures/blob/master/Memory/MM-Restart.gif)

## The Help button

Although almost no one clicks this button, the animation below shows what happens when it is clicked. 

![Memory Game Help Demo](https://github.com/Vatsav14/Project-Pictures/blob/master/Memory/MM-help.gif)

* Final Note: For anyone wondering why the game looks like this, note that I tried to replicate the original version that we had made over 2 years ago. Even the images that I chose are as close I could get to the original pictures. For anyone who wants to see the old version and/or how inefficient our old code was, I have a link to the project pdf we had created for the project [here.](https://drive.google.com/file/d/1xTzwepKpbxSwDju6FqbFMbQ9uI2Cnkx9/view?usp=sharing)
