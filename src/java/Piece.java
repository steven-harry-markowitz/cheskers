public enum Piece {

	PAWN(1),
	BISHOP(3),
	KNIGHT(3),
	ROOK(5),
	CHECKER(1),
	KING(1_000_000),
	QUEEN(10);

	private final int pieceValue;

	Piece(int pieceValue) {
		this.pieceValue = pieceValue;
	}
}