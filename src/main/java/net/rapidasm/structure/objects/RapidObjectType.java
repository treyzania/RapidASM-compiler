package net.rapidasm.structure.objects;

public enum RapidObjectType {

	VALUE("value", 2), // Generates operand 2, and provides a pointer the the data to the context.
	STORE("store", 1), // Generates operand 1.
	SKIP("skip", 1); // Generates operand 1 null bytes.
	
	public String name;
	public int operandCount;
	
	private RapidObjectType(String name, int operands) {
		
		this.name = name;
		this.operandCount = operands;
		
	}
	
	public boolean usesEqualsSign() {
		return operandCount == 2;
	}
	
}
