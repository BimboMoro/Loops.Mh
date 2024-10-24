package com.calderon.arrays;

public class ShowArray {

	public void init() {
		
		//int numeros []= new int[10];
		
				Integer[] integerArray=this.getNewArrayofInteger();
				this.showArrayOfInteger(integerArray);
	}

	private void showArrayOfInteger(Integer[] integerArray) {
		for(int i=0; i<integerArray.length; i++) {
		
		System.out.println("Item ["+i +"] "+" valor: "+integerArray[i]);
	}
	}
	private Integer[] getNewArrayofInteger() {
		
		
		
		return new Integer[10];//
		
	}

}
