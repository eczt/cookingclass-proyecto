import java.util.Scanner;

public class Main {
	private static String usuario;
	private static String contraseña;
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int userOption;
		
		System.out.println("Introduce el usuario: ");
		usuario = keyboard.nextLine();
		System.out.println("Introduce la contrasña: ");
		contraseña = keyboard.nextLine();

		if(usuario.equals("catalina") && contraseña.equals("0307") ){
			do {
				System.out.println("\nIngresa un comando: \n"
						+ "1) Agregar harina: \n"
						+ "2) Agregar azucar: \n"
						+ "3) Agregar brown sugar: \n"
						+ "4) Agregar mantequilla: \n"
						+ "5) Agregar arroz: \n"
					    + "6) Agregar azucar glass: \n"
						+ "7) Agregar chispas de chocolate: \n"
					    + "8) Agregar peanut butter: \n"
						+ "9) Agregar nueces: \n"
					    + "10) Agregar queso rallado: \n"
						+ "11) Imprimir lista de compras: \n");
				
				userOption = keyboard.nextInt();
				switch(userOption) {
				case 1:
					Ingredientes.convertirHarina();
					break;
				case 2:
					Ingredientes.convertirAzucar();
					break;
				case 3:
					Ingredientes.convertirBrownSugar();
					break;
				case 4:
					Ingredientes.convertirMantequilla();
					break;
				case 5:
					Ingredientes.convertirArroz();
					break;
				case 6:
					Ingredientes.ConvertirAzucarGlass();
					break;
				case 7:
					Ingredientes.ConvertirChispasChocolate();
					break;
				case 8:
					Ingredientes.ConvertirPeanutButter();
					break;
				case 9:
					Ingredientes.ConvertirNueces();
					break;
				case 10:
					Ingredientes.convertirQuesoRallado();
					break;
				case 11:
					Ingredientes.imprimirLista();
					break;
				}} while(userOption != 11);
		
			
			}
		
		else{
		    System.out.println("Porfavor intente de nuevo.");
		}   
		
	}

}
