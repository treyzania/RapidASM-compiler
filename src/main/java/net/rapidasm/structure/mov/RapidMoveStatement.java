package net.rapidasm.structure.mov;

import net.rapidasm.BinarySource;
import net.rapidasm.structure.DataSize;
import net.rapidasm.structure.Operand;
import net.rapidasm.structure.RapidStatement;
import net.rapidasm.structure.RapidStatementBlock;

public class RapidMoveStatement extends RapidStatement {
	
	private MoveType type;
	private Operand src, dest;
	
	public RapidMoveStatement(RapidStatementBlock block, MoveType type, Operand src, Operand dest) {
		
		super(block);
		
		this.type = type;
		this.src = src;
		this.dest = dest;
		
	}
	
	@Override
	public void addLines(BinarySource src) {
		
		src.addComment("SRC.class: " + this.src.getClass().getSimpleName());
		src.addComment("DEST.class: " + this.dest.getClass().getSimpleName());
		
		this.src.setup(src);
		this.dest.setup(src);
		
		src.addInstruction(this.type.instruction, DataSize.getDataSize(this.src, this.dest), this.src.getActualOperand(), this.dest.getActualOperand());
		
		this.src.cleanup(src);
		this.dest.cleanup(src);
		
	}
	
}
