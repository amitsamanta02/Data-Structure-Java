package org.amit.ds.list.generic;

public class DataType {
	private int id;
	private String name;
	
	
	public DataType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "DataType [id=" + id + ", name=" + name + "]";
	}
}
