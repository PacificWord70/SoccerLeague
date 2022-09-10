package com.example.soccerleague

/**
 * Game
 *
 * Definition:
 *      -Keep track of soccer games that have happened
 *
 * Required **
 *
 * Args:
 *      - Game ID           **
 *      - Away Team ID      **
 *      - Away Team Name
 *      - Home Team ID      **
 *      - Home Team Name
 *      - Away Score        **
 *      - Home Score        **
 *
 * Attributes:
 *      - None
 *
 * Future Features:
 *      - Date
 *      - Time
 *      - Location
 *      - Referee ID
 */

class Game(
    var gameId: Int,
    var awayTeamId: Int,
    var awayTeamName: String?,
    var homeTeamId: Int,
    var homeTeamName: String?,
    var awayScore: Int,
    var homeScore: Int
    ) {}