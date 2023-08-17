public enum Piece {

	UNKNOWN(-1), // pre-initialization state or FAILURE state
	NOPIECE(0), // no piece at location 
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