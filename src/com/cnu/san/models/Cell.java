package com.cnu.san.models;

import com.cnu.san.constant.CellType;

public class Cell {
	private int x;
	private int y;
	CellType type;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public CellType getType() {
		return type;
	}

	public void setType(CellType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Cell [x=" + x + ", y=" + y + ", type=" + type + "]";
	}

}
