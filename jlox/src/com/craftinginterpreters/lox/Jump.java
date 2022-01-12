package com.craftinginterpreters.lox;

enum JumpType {
	BREAK
}

public class Jump extends RuntimeError {
	
	JumpType type;
	
	Jump(JumpType type, Token keyword, String message) {
		super(keyword, message);
		this.type = type;
	}

}
