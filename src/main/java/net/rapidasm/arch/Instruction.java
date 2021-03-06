package net.rapidasm.arch;

public enum Instruction {

	MOVE,
	EXCHANGE,
	ADD,
	SUBTRACT,
	INCREMENT,
	DECREMENT,
	CALL,
	RETURN,
	JUMP,
	COMPARE,
	JUMP_EQUAL,
	JUMP_INEQUAL,
	JUMP_ZERO,
	JUMP_NONZERO,
	JUMP_GREATER,
	JUMP_GREATER_OR_EQUAL,
	JUMP_LESS,
	JUMP_LESS_OR_EQUAL,
	PUSH,
	POP,
	
	UNDEFINED; // Used for any other instruction that we somehow need to represent.
	
}
