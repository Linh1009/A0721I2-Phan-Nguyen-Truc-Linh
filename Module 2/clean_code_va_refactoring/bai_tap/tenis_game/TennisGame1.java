package clean_code_va_refactoring.bai_tap.tenis_game;

import clean_code_va_refactoring.bai_tap.tenis_game.TennisGame;

public class TennisGame1 implements TennisGame {

        private static final int LOVE = 0;
        private static final int FIFTEEN = 1;
        private static final int THIRTY = 2;
        private static final int FORTY = 3;
        private static final int OVER_FORTY = 4;

        private static String nameFor(int score) {
            if (score==FIFTEEN) {
                return Point.Fifteen.name();
            }

            return Point.Love.name();
        }

        private static enum Point {
            Love(LOVE), Fifteen(FIFTEEN), Thirty(THIRTY), Forty(FORTY), OverForty(OVER_FORTY);
            private final int score;

            private Point(int score) {
                this.score = score;
            }

            public Point fromScore(int score) {
                return null;
            }


        }
        private int scorePlayer1 = 0;
        private int scorePlayer2 = 0;
        private String player1Name;
        private String player2Name;

        public TennisGame1(String player1Name, String player2Name) {
            this.player1Name = player1Name;
            this.player2Name = player2Name;
        }

        public void wonPoint(String playerName) {
            if (playerName == "player1") {
                scorePlayer1 += 1;
            } else {
                scorePlayer2 += 1;
            }
        }

        public String getScore() {

            if (tie()) {
                return scoreForTie();
            } else if (possibleWin()) {
                return scoreForPossibleWin();
            }
            return scoreForNoTieAndNoWin();
        }

        private String scoreForNoTieAndNoWin() {
            String score = "";
            int tempScore;
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = scorePlayer1;
                } else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case LOVE:
                        score += nameFor(tempScore);
                        break;
                    case FIFTEEN:
                        score += nameFor(tempScore);
                        break;
                    case THIRTY:
                        score += "Thirty";
                        break;
                    case FORTY:
                        score += "Forty";
                        break;
                }
            }
            return score;
        }

        private String scoreForPossibleWin() {
            String score;
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
            return score;
        }

        private String scoreForTie() {
            switch (scorePlayer1) {
                case LOVE:
                    return "Love-All";
                case FIFTEEN:
                    return "Fifteen-All";
                case THIRTY:
                    return "Thirty-All";
                case FORTY:
                    return "Forty-All";
                default:
                    return "Deuce";
            }
        }

        private boolean tie() {
            return scorePlayer1 == scorePlayer2;
        }

        private boolean possibleWin() {
            return scorePlayer1 >= OVER_FORTY || scorePlayer2 >= OVER_FORTY;
        }
    }


