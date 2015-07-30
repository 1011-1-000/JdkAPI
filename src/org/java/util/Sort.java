package org.java.util;

public class Sort {
	
	//��������ʱ�临�Ӷ�N^2
	public static <AnyType extends Comparable<? super AnyType>> void insertionSort(AnyType[] a){
		int j;
		for(int p = 1;p < a.length;p++){//�ӵڶ���Ԫ�ؿ�ʼ����һ���϶��������
			AnyType tmp = a[p];
			for(j = p;j > 0 && tmp.compareTo(a[j-1]) < 0;j--){
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	
	
	//�����򣬺�ǰ����С�Ѳ�ͬ�������������ʵ�֣����±��0��ʼ��ʱ�临�Ӷ�N*logN
	public static <AnyType extends Comparable<? super AnyType>> void heapSort(AnyType[] a){
		//�Ȱ��������齨��һ������
		for(int i = a.length/2; i >= 0; i--){
			percDown(a, i, a.length);
		}
		//�����ֵ�����һ����ֵ���н������ٵ�����ʹ���������ѵ�����
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
		
		for(tmp = a[i]; 2*i + 1 < n; i = child){//��鵱ǰ�ڵ��Ƿ�������
			child = 2 * i +1;
			if(child != n-1 && a[child].compareTo(a[child+1])<0){//�����Һ��ӽڵ㻥��Ƚ�
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
	
	//�鲢����ʱ�临�Ӷ�NlogN
	public static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType[] a){
		AnyType [] tmpArray = (AnyType[]) new Comparable[a.length];
		mergeSort( a, tmpArray, 0, a.length -1);
	}
	
	private static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType[] a,AnyType[] tmpArray, int left, int right){
		if(left < right){
			int center = (left + right)/2;
			mergeSort( a, tmpArray, left, center);   //�������
			mergeSort( a, tmpArray, center+1, right);  //�Ҳ�����
			merge(a, tmpArray, left, center+1, right); //���Һϲ�
		}
	}
	
	private static <AnyType extends Comparable<? super AnyType>> void merge(AnyType[] a,AnyType[] tmpArray, int leftPos, int rightPos, int rightEnd){
		int leftEnd = rightPos - 1;
		int tmpPos = leftPos;
		int numElements = rightEnd - leftPos + 1;
		
		while(leftPos <= leftEnd && rightPos <= rightEnd){  //�Ա����ҵ����ݲ����Ƶ���ʱ������
			if(a[leftPos].compareTo(a[rightPos]) < 0 ){
				tmpArray[tmpPos++] = a[leftPos++];
			}
			else{
				tmpArray[tmpPos++] = a[rightPos++];
			}
		}
		
		while(leftPos <= leftEnd){ //��໹��ʣ��
			tmpArray[tmpPos++] = a[leftPos++];
		}
		
		while(rightPos <= rightEnd){ //�Ҳ໹��ʣ��
			tmpArray[tmpPos++] = a[rightPos++];
		}
		
		for(int i = 0 ; i < numElements; i++){//����ʱ��������ݿ�������
			a[rightEnd] = tmpArray[rightEnd];
			rightEnd --;
		}
	}
}
