package net.rapidasm.arch;

import net.rapidasm.BinarySource;
import net.rapidasm.structure.RapidSubroutine;

public class EmptyConvention extends CallingConvention {

	public EmptyConvention(Architecture arch, String name) {
		super(arch, name);
	}
	
	@Override
	public void doCallerSetup(RapidSubroutine caller, RapidSubroutine callee, BinarySource src) {
		
		src.addComment("CALLING: " + caller.name + " (" + this.name + ")");
		src.addCode(this.arch.getCallInstruction(callee.name));
		
	}
	
	@Override
	public void doCallerCleanup(RapidSubroutine caller, RapidSubroutine callee, BinarySource src) {
		
		src.addComment("CALLED: " + caller.name + " (" + this.name + ")");
		
	}
	
	@Override
	public void doCalleeSetup(RapidSubroutine callee, BinarySource src) {
		
	}
	
	@Override
	public void doCalleeCleanup(RapidSubroutine callee, BinarySource src) {
		
		// Just the return instruction here.
		src.addCode(this.arch.getReturnInstruction());
		
	}
	
}
