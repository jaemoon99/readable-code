package cleancode.minesweeper.tobe.gamelevel;

public class VeryBeginner implements GameLevel {

	@Override
	public int getColSize() {
		return 4;
	}

	@Override
	public int getRowSize() {
		return 5;
	}

	@Override
	public int getLandMineCount() {
		return 2;
	}
}
