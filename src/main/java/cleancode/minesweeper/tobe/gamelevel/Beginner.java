package cleancode.minesweeper.tobe.gamelevel;

public class Beginner implements GameLevel {

	@Override
	public int getColSize() {
		return 8;
	}

	@Override
	public int getRowSize() {
		return 10;
	}

	@Override
	public int getLandMineCount() {
		return 10;
	}
}
