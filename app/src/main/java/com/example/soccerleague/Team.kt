package com.example.soccerleague

/**
 * Team
 *
 * Definition:
 *      -Keep track of soccer games that have happened
 *
 * Required **
 *
 * Args:
 *      - Team ID **
 *      - Team Name **
 *
 * Attributes:
 *      - winPercentage Double  (Win/Loss)
 *      - wins                  (counter)
 *      - loses                 (counter)
 *      - totalGamesPlayed      (counter)
 *      - gamesPlayed ArrayList (gameId for all games participated in)
 *
 * Future Features:
 *      - Location
 */

class Team(
    var teamId: Int,
    val teamName: String
    ) {

    var winPercentage = 0.0
    var wins = 0
    var loses = 0
    var totalGamesPlayed = 0
    val gamesPlayed = ArrayList<Int>()

    fun playsGame(game: Game){
        var away = false
        if (game.awayTeamId == teamId) away = true

        var won = false
        totalGamesPlayed++
        if(game.awayScore > game.homeScore) {
            won = true
            wins++
        } else loses++

        winPercentage = wins/totalGamesPlayed.toDouble()

        gamesPlayed.add(game.gameId)

    }


}