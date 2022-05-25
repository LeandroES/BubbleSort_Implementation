package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[] metodoBurbujaDesc(int[] num) {
        long startTime = System.nanoTime();
        int i;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (i = 0; i < num.length - 1; i++) {
                if (num[i] < num[i + 1]) {
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    flag = true;
                }
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Duración: " + (endTime-startTime)/1e6 + " ms");
        return num;
    }
    public static int[] metodoBurbujaAsc(int[] numerosAscendentes) {
        long startTime = System.nanoTime();
        int i;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (i = 0; i < numerosAscendentes.length - 1; i++) {
                if (numerosAscendentes[i] > numerosAscendentes[i + 1]) {
                    temp = numerosAscendentes[i];
                    numerosAscendentes[i] = numerosAscendentes[i + 1];
                    numerosAscendentes[i + 1] = temp;
                    flag = true;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Duración: " + (endTime-startTime)/1e6 + " ms");
        return numerosAscendentes;
    }    
    public static int[] ArrayDescendente(){
		int x=50000;
	      int[] arr = new int[x];
	      for (int i = 0; i < arr.length; i++) {
	        arr[i] = x;
	        --x;
	      }
	      return arr;
	}
	public static int[] ArrayAscendente() {
	      int[] arr = new int[50000];
	      for (int i = 0; i < arr.length; i++) {
	        arr[i] = i;
	      }
	      return arr;
	}    
	public static ArrayList<Integer> Resultado() { 
	      Random rd = new Random();
	      ArrayList<Integer> resultado = new ArrayList<Integer>();
	      for (int i = 0; i < rd.nextInt(10000, 50000); i++) {
	    	  resultado.add(rd.nextInt(1, 50000));
	      }
	      return resultado;
	}
	public static Integer[] BBDesc(Integer[] ai1) {
        long startTime = System.nanoTime();
        int i;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (i = 0; i < ai1.length - 1; i++) {
                if (ai1[i] < ai1[i + 1]) {
                    temp = ai1[i];
                    ai1[i] = ai1[i + 1];
                    ai1[i + 1] = temp;
                    flag = true;
                }
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Duración: " + (endTime-startTime)/1e6 + " ms");
        return ai1;
    }
    public static Integer[] BBAsc(Integer[] ai1) {
        long startTime = System.nanoTime();
        int i;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (i = 0; i < ai1.length - 1; i++) {
                if (ai1[i] > ai1[i + 1]) {
                    temp = ai1[i];
                    ai1[i] = ai1[i + 1];
                    ai1[i + 1] = temp;
                    flag = true;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Duración: " + (endTime-startTime)/1e6 + " ms");
        return ai1;
    }
	
	public static void main(String args[]) {
		
		int[] numerosAscendentes = ArrayAscendente();
        int[] numerosDescendentes = ArrayDescendente();
        int[] bubleAscMejorC = metodoBurbujaAsc(numerosAscendentes);
        System.out.println("Arreglo ordenado ascendente: " + Arrays.toString(bubleAscMejorC));
        int[] bubleAscPeorC = metodoBurbujaAsc(numerosDescendentes);
        System.out.println("Arreglo ordenado descendente: " + Arrays.toString(bubleAscPeorC));
        
        //Stable:
        int[] stable = new int[]{1,10,2,3,3,4,5,6,7,8,9,10};
        System.out.println("Array estable: "+Arrays.toString(metodoBurbujaAsc(stable)));
        
        //ZONA EXPERIEMENTAL:
		/*
		ArrayList<Integer> n1 = new ArrayList<Integer>();
		ArrayList<Integer> n2 = new ArrayList<Integer>();
		ArrayList<Integer> n3 = new ArrayList<Integer>();
		ArrayList<Integer> n4 = new ArrayList<Integer>();
		ArrayList<Integer> n5 = new ArrayList<Integer>();
		ArrayList<Integer> n6 = new ArrayList<Integer>();
		ArrayList<Integer> n7 = new ArrayList<Integer>();
		n1 = Resultado();
		n2 = Resultado();
		n3 = Resultado();
		n4 = Resultado();
		n5 = Resultado();
		n6 = Resultado();
		n7 = Resultado();
		Object[] an1 = n1.toArray();
		Object[] an2 = n2.toArray();
		Object[] an3 = n3.toArray();
		Object[] an4 = n4.toArray();
		Object[] an5 = n5.toArray();
		Object[] an6 = n6.toArray();
		Object[] an7 = n7.toArray();
		Integer[] ai1 = Arrays.asList(an1).toArray(new Integer[0]);
		Integer[] ai2 = Arrays.asList(an1).toArray(new Integer[0]);
		Integer[] ai3 = Arrays.asList(an1).toArray(new Integer[0]);
		Integer[] ai4 = Arrays.asList(an1).toArray(new Integer[0]);
		Integer[] ai5 = Arrays.asList(an1).toArray(new Integer[0]);
		Integer[] ai6 = Arrays.asList(an1).toArray(new Integer[0]);
		Integer[] ai7 = Arrays.asList(an1).toArray(new Integer[0]);
		/*
		System.out.println("Array prueba 1: "+Arrays.toString(an1)+"\n");
		System.out.println("Array prueba 2: "+Arrays.toString(an2)+"\n");
		System.out.println("Array prueba 3: "+Arrays.toString(an3)+"\n");
		System.out.println("Array prueba 4: "+Arrays.toString(an4)+"\n");
		System.out.println("Array prueba 5: "+Arrays.toString(an5)+"\n");
		System.out.println("Array prueba 6: "+Arrays.toString(an6)+"\n");
		System.out.println("Array prueba 7: "+Arrays.toString(an7)+"\n");
        */
		//BBAsc(ai1);
        /*
		System.out.println("Arreglo Ai1 descendente por: " + Arrays.toString(BBAsc(ai1)));
        System.out.println("Arreglo Ai1 descendente por: " + Arrays.toString(BBDesc(ai1)));
        System.out.println("Arreglo Ai2 descendente por: " + Arrays.toString(BBAsc(ai2)));
        System.out.println("Arreglo Ai2 descendente por: " + Arrays.toString(BBDesc(ai2)));
        System.out.println("Arreglo Ai3 descendente por: " + Arrays.toString(BBAsc(ai3)));
        System.out.println("Arreglo Ai3 descendente por: " + Arrays.toString(BBDesc(ai3)));
        System.out.println("Arreglo Ai4 descendente por: " + Arrays.toString(BBAsc(ai4)));
        System.out.println("Arreglo Ai4 descendente por: " + Arrays.toString(BBDesc(ai4)));
        System.out.println("Arreglo Ai5 descendente por: " + Arrays.toString(BBAsc(ai5)));
        System.out.println("Arreglo Ai5 descendente por: " + Arrays.toString(BBDesc(ai5)));
        System.out.println("Arreglo Ai6 descendente por: " + Arrays.toString(BBAsc(ai6)));
        System.out.println("Arreglo Ai6 descendente por: " + Arrays.toString(BBDesc(ai6)));
        System.out.println("Arreglo Ai7 descendente por: " + Arrays.toString(BBAsc(ai7)));
        System.out.println("Arreglo Ai7 descendente por: " + Arrays.toString(BBDesc(ai7)));
        */
		
    }
}
	

