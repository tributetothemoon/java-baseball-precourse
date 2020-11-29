package baseball.model;

public class BallCount {
    private final int strike;
    private final int ball;

    private BallCount(final int strike, final int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    static BallCount createBallCount(final int strike, final int ball) {
        return new BallCount(strike, ball);
    }

    public int getStrike() {
        return this.strike;
    }

    public int getBall() {
        return this.ball;
    }

    @Override
    public String toString(){
        return String.format("Strike: %d, Ball: %d", this.strike, this.ball);
    }

}
