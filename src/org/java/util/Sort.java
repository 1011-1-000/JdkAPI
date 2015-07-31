package org.java.util;

public class Sort {
	
	//插入排序，时间复杂度N^2
	public static <AnyType extends Comparable<? super AnyType>> void insertionSort(AnyType[] a){
		int j;
		for(int p = 1;p < a.length;p++){//从第二个元素开始，第一个肯定是有序的
			AnyType tmp = a[p];
			for(j = p;j > 0 && tmp.compareTo(a[j-1]) < 0;j--){
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	
	
	//堆排序，和前面最小堆不同，这里采用最大堆实现，且下标从0开始，时间复杂度N*logN
	public static <AnyType extends Comparable<? super AnyType>> void heapSort(AnyType[] a){
		//先按给的数组建立一个最大堆
		for(int i = a.length/2; i >= 0; i--){
			percDown(a, i, a.length);
		}
		//将最大值与最后一个数值进行交换，再调整堆使其满足最大堆的性质
		for(int i = a.length - 1; i > 0; i--){
			AnyType tmp = a[0];
			a[0] = a[i];
			a[i] = tmp;
			percDown(a, 0, i);
		}
	}
	
	private static <AnyType extends Comparable<? super AnyType>> void percDown(AnyType[] a, int i, int n){
		int child;
		AnyType tmp;
		
		for(tmp = a[i]; 2*i + 1 < n; i = child){//检查当前节点是否有左孩子
			child = 2 * i +1;
			if(child != n-1 && a[child].compareTo(a[child+1])<0){//先左右孩子节点互相比较
				child++;
			}
			if(tmp.compareTo(a[child]) < 0){
				a[i] = a[child];
			}
			else{
				break;
			}
		}
		a[i] = tmp;
	}
	
	//归并排序，时间复杂度NlogN
	public static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType[] a){
		AnyType [] tmpArray = (AnyType[]) new Comparable[a.length];
		mergeSort( a, tmpArray, 0, a.length -1);
	}
	
	private static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType[] a,AnyType[] tmpArray, int left, int right){
		if(left < right){
			int center = (left + right)/2;
			mergeSort( a, tmpArray, left, center);   //左侧排序
			mergeSort( a, tmpArray, center+1, right);  //右侧排序
			merge(a, tmpArray, left, center+1, right); //左右合并
		}
	}
	
	private static <AnyType extends Comparable<? super AnyType>> void merge(AnyType[] a,AnyType[] tmpArray, int leftPos, int rightPos, int rightEnd){
		int leftEnd = rightPos - 1;
		int tmpPos = leftPos;
		int numElements = rightEnd - leftPos + 1;
		
		while(leftPos <= leftEnd && rightPos <= rightEnd){  //对比左右的数据并复制到临时数组中
			if(a[leftPos].compareTo(a[rightPos]) < 0 ){
				tmpArray[tmpPos++] = a[leftPos++];
			}
			else{
				tmpArray[tmpPos++] = a[rightPos++];
			}
		}
		
		while(leftPos <= leftEnd){ //左侧还有剩余
			tmpArray[tmpPos++] = a[leftPos++];
		}
		
		while(rightPos <= rightEnd){ //右侧还有剩余
			tmpArray[tmpPos++] = a[rightPos++];
		}
		
		for(int i = 0 ; i < numElements; i++){//将临时数组的数据拷贝回来
			a[rightEnd] = tmpArray[rightEnd];
			rightEnd --;
		}
	}
	
	//快速排序
	public static <AnyType extends Comparable<? super AnyType>> void quickSort(AnyType[] a){
		quickSort(a, 0, a.length - 1);
	}
	
	private static <AnyType extends Comparable<? super AnyType>> void quickSort(AnyType[] a,int left,int right){
		if(left + 10 <= right){
			AnyType pivot = median3(a, left, right);//选择枢纽元
			
			int i = left;
			int j = right - 1;
			
			while(true){
				while(a[++i].compareTo(pivot) < 0){}
				while(a[--j].compareTo(pivot) > 0){}
				
				if(i < j){
					swapReferences(a, i, j);
				}
				else{
					break;
				}
			}
				swapReferences(a, i, right-1);
				quickSort(a, left, i-1);
				quickSort(a, i+1, right);
		}
		else{
			insertionSort(a);
		}
	}
	
	private static <AnyType extends Comparable<? super AnyType>> AnyType median3(AnyType[] a,int left,int right){
		int center = (left + right)/2;
		if(a[center].compareTo(a[left]) < 0){
			swapReferences(a, left, center);
		}
		if(a[right].compareTo(a[left]) < 0){
			swapReferences(a, left, right);
		}
		if(a[right].compareTo(a[center]) < 0){
			swapReferences(a, center, right);
		}
		
		swapReferences(a, center, right-1);
		return a[right - 1];
	}
	
	private static<AnyType extends Comparable<? super AnyType>> void swapReferences(AnyType[] a,int i,int j){
		AnyType tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static <AnyType extends Comparable<? super AnyType>> void bubbleSort(AnyType[] a){
		
		for(int i = 0; i < a.length; i++){
			for(int j = 1 ;j < a.length - i;j++){
				if(a[j].compareTo(a[j-1]) < 0){
					swapReferences(a, j, j-1);
				}
			}
		}
	}
}
