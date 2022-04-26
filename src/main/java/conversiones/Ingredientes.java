package conversiones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ingredientes {
	static ArrayList<String> lista = new ArrayList<String>();
	static String harina;
	static String azucar;
	static String brownSugar;
	static String mantequilla;
	static String arroz;
	static String azucarGlass;
	static String chispasChocolate;
	static String peanutButter;
	static String nueces;
	static String quesoRallado;
	static double oz = 1;
	static double gr = oz*28.3495;
	
	

	
	public static void convertirHarina() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIngresa la cantidad de harina en tazas: \n");
		double tazas = scan.nextDouble();
		double x = 4.60 * tazas;
		double gramos = x*gr;
		harina = String.format("%.2f", gramos) + " GR DE HARINA, GRASAN";
		lista.add(harina);
		System.out.println(String.format("%.2f", gramos) + " GR DE HARINA");
	}
	
	public static void convertirAzucar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIngresa la cantidad de azucar en tazas: \n");
		double tazas = scan.nextDouble();
		double x = 7.10 * tazas;
		double gramos = x*gr;
		azucar = String.format("%.2f", gramos) + " GR DE AZUCAR, GRASAN";
		lista.add(azucar);
		System.out.println(String.format("%.2f", gramos) + " GR DE AZUCAR");
	}
	
	public static void convertirBrownSugar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIngresa la cantidad de brownsugar en tazas: \n");
		double tazas = scan.nextDouble();
		double x = 7.75 * tazas;
		double gramos = x*gr;
		brownSugar = String.format("%.2f", gramos) + " GR DE BROWN SUGAR, HEB";
		lista.add(brownSugar);
		System.out.println(String.format("%.2f", gramos) + " GR DE BROWN SUGAR");
	}
	
	public static void convertirMantequilla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIngresa la cantidad de mantequilla en tazas: \n");
		double tazas = scan.nextDouble();
		double x = 8 * tazas;
		double gramos = x*gr;
		mantequilla = String.format("%.2f", gramos) + " GR DE MANTEQUILLA, QUESOS DELICIOSOS";
		lista.add(mantequilla);
		System.out.println(String.format("%.2f", gramos) + " GR DE MANTEQUILLA");
	}
	
	public static void convertirArroz() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIngresa la cantidad de arroz en tazas: \n");
		double tazas = scan.nextDouble();
		double x = 6.50 * tazas;
		double gramos = x*gr;
		arroz = String.format("%.2f", gramos) + " GR DE ARROZ, FASO";
		lista.add(arroz)
;		System.out.println(String.format("%.2f", gramos) + " GR DE ARROZ");
	}
	
	public static void ConvertirAzucarGlass() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIngresa la cantidad de azucar glass en tazas: \n");
		double tazas = scan.nextDouble();
		double x = 4.35 * tazas;
		double gramos = x*gr;
		azucarGlass = String.format("%.2f", gramos) + " GR DE AZUCAR GLASS, FASO";
		lista.add(azucarGlass);
		System.out.println(String.format("%.2f", gramos) + " GR DE AZUCAR GLASS");
	}
	
	public static void ConvertirChispasChocolate() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIngresa la cantidad de chispas de chocolate en tazas: \n");
		double tazas = scan.nextDouble();
		double x = 6.15 * tazas;
		double gramos = x*gr;
		chispasChocolate = String.format("%.2f", gramos) + " GR DE CHISPAS DE CHOCOLATE, HEB/CHOCOSOLUTIONS";
		lista.add(chispasChocolate);
		System.out.println(String.format("%.2f", gramos) + " GR DE CHISPAS DE CHOCOLATE");
	}
	
	public static void ConvertirPeanutButter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIngresa la cantidad de peanut butter en tazas: \n");
		double tazas = scan.nextDouble();
		double x = 8.47 * tazas;
		double gramos = x*gr;
		peanutButter = String.format("%.2f", gramos) + " GR DE PEANUT BUTTER, FASO";
		lista.add(peanutButter);
		System.out.println(String.format("%.2f", gramos) + " GR DE PEANUT BUTTER");
	}
	
	public static void ConvertirNueces() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIngresa la cantidad de nueces en tazas: \n");
		double tazas = scan.nextDouble();
		double x = 4.20 * tazas;
		double gramos = x*gr;
		nueces = String.format("%.2f", gramos) + " GR DE NUECES, GRASAN";
		lista.add(nueces);
		System.out.println(String.format("%.2f", gramos) + " GR DE NUECES");
	}
	
	public static void convertirQuesoRallado() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIngresa la cantidad de queso rallado en tazas: \n");
		double tazas = scan.nextDouble();
		double x = 4 * tazas;
		double gramos = x*gr;
		quesoRallado = String.format("%.2f", gramos) + " GR DE QUESO RALLADO, QUESOS DELICIOSOS";
		lista.add(quesoRallado);
		System.out.println(String.format("%.2f", gramos) + " GR DE QUESO RALLADO");
	}
	
	public static void imprimirLista() {
		lista.forEach(System.out::println);
	}
	
}