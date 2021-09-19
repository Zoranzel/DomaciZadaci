

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import rs.itbootcamp.dao.FoodDao;
import rs.itbootcamp.dao.FoodDaoSQL;
import rs.itbootcamp.dao.MealDao;
import rs.itbootcamp.dao.MealDaoSQL;
import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.MealModel;

public class Test2 {

	static FoodDao fd = new FoodDaoSQL();
	static MealDao md = new MealDaoSQL();
	static int fridge_id = 1;
	private static void welcomeMessage(){
		System.out.println("Welcome to kitchen!!!");
		System.out.println("------------------------");
	}

	private static void addFoodToFridge(Scanner sc){
		List<FoodModel> foodList = fd.getAllFood();
		int choice = -1;

		while(choice != 0){
			for(int i = 0; i < foodList.size(); i++){
				System.out.println((i+1) + ". " + foodList.get(i));
			}
			System.out.println("0. Back");

			choice = sc.nextInt();

			if(choice > 0 && choice <= foodList.size()){
				System.out.println("How much: (in grams)");
				double mass = sc.nextDouble();
				fd.addToFridge(fridge_id,foodList.get(choice - 1).getFoodId(),mass);
				System.out.println("++");
			}
		}
	}


	public static void removeFoodFromFridge(Scanner sc) {


		int choice = -1;

		while(choice != 0){

			List<FoodModel> foodList = fd.getAllFood();

			for(int i = 0; i < foodList.size(); i++){
				System.out.println((i+1) + ". " + foodList.get(i));
			}
			System.out.println("0. Back");

			choice = sc.nextInt();

			if(choice > 0 && choice <= foodList.size()){

				System.out.println("Unesite id po kojem brisete: ");
				int fridgeId = sc.nextInt();

				fd.delete(fridgeId);
				System.out.println("++");
			}


		}
	}


	public static void writeAllFoodFromFridge(Scanner sc) {




	}

	private static void fridgeMenu(Scanner sc){
		int choice;
		do{
			System.out.println("My Fridge:");
			System.out.println("--------");
			System.out.println("1. Add food");
			System.out.println("2. Remove food");
			System.out.println("3. Look in");
			System.out.println("4. Create meal");
			System.out.println("0. Back");

			choice = sc.nextInt();

			switch(choice){
			case 1:
				addFoodToFridge(sc);
				break;
			case 2 : 
				//System.out.println("Remove food from fridge");
				removeFoodFromFridge(sc);
				break;
			case 3 : 
				//System.out.println("Write all food from fridge");
				writeAllFoodFromFridge(sc);
				break;
			case 4 : 
				System.out.println("Create meal");
				break;
			case 0 : 
				System.out.println();
				break;
			default: System.out.println("Invalid option");
			}
		} while(choice != 0);
	}


	// metoda radi ako unos ima manje od 5 reci

	public static void search(Scanner sc) {



		List<FoodModel> lista = fd.getAllFood();
		List<MealModel> lista2 = md.getAllMeals();
		
		List<FoodModel> listaRez = new ArrayList<>();
		List<MealModel> lista2Rez = new ArrayList<>();


		System.out.println("Unesite tekst pomocu koga cemo napraviti pretragu: ");
		String text = sc.nextLine().trim();
		System.out.println();

        String[] rez = text.split(" ");
        
        if(rez.length == 1) {

		for(FoodModel p : lista) {

			if(p.getFoodName().contains(text) && !listaRez.contains(p)) {

			//	System.out.println(p);
				listaRez.add(p);
			}
		}
        
        
        
        
		for(MealModel m : lista2) {

			if(m.getMealName().contains(text) && !lista2Rez.contains(m)) {

			//	System.out.println(m);
				lista2Rez.add(m);
				
			}
		}
		
		for(MealModel m : lista2) {

			if((m.getMealDesc().contains(text) || m.getMealDifficulty().contains(text)) && !lista2Rez.contains(m)) {

			//	System.out.println(m);
				lista2Rez.add(m);
			}
		}
        }else if(rez.length == 2) {
        	
        	for(FoodModel p : lista) {

    			if((p.getFoodName().contains(rez[0]) || p.getFoodName().contains(rez[1])) && !listaRez.contains(p)) {

    			//	System.out.println(p);
    			listaRez.add(p);
    			}
    		}

    		for(MealModel m : lista2) {

    			if(m.getMealName().contains(rez[0]) || m.getMealName().contains(rez[1]) && !lista2Rez.contains(m)) {

    			//	System.out.println(m);
    				lista2Rez.add(m);
    				
    			}
    		}
    		
    		for(MealModel m : lista2) {

    			if( ((m.getMealDesc().contains(rez[0]) || m.getMealDesc().contains(rez[1])) || m.getMealDifficulty().contains(rez[0]) || m.getMealDifficulty().contains(rez[1])) && !lista2Rez.contains(m)) {

    			//	System.out.println(m);
    				lista2Rez.add(m);
    				
    			}
    		}
        	
        	
        }else if(rez.length == 3) {
        	
        	for(FoodModel p : lista) {

    			if((p.getFoodName().contains(rez[0]) || p.getFoodName().contains(rez[1]) || p.getFoodName().contains(rez[2])) && !listaRez.contains(p) ) {

    				//System.out.println(p);
    				listaRez.add(p);
    			}
    		}

    		for(MealModel m : lista2) {

    			if( (m.getMealName().contains(rez[0]) || m.getMealName().contains(rez[1]) || m.getMealName().contains(rez[2]) ) && !lista2Rez.contains(m)) {

    				//System.out.println(m);
    				lista2Rez.add(m);
    			}
    		}
    		
    		for(MealModel m : lista2) {

    			if( (m.getMealDesc().contains(rez[0]) || m.getMealDesc().contains(rez[1]) || m.getMealDesc().contains(rez[2]) || m.getMealDifficulty().contains(rez[0]) || m.getMealDifficulty().contains(rez[1]) || m.getMealDifficulty().contains(rez[2]) ) && !lista2Rez.contains(m)) {

    			//	System.out.println(m);
    				lista2Rez.add(m);
    			}
    		}
        	
        }else if(rez.length == 4) {
        	
        	for(FoodModel p : lista) {

    			if((p.getFoodName().contains(rez[0]) || p.getFoodName().contains(rez[1]) || p.getFoodName().contains(rez[2]) || p.getFoodName().contains(rez[3])) && !listaRez.contains(p) ) {

    				//System.out.println(p);
    				listaRez.add(p);
    			}
    		}

    		for(MealModel m : lista2) {

    			if( (m.getMealName().contains(rez[0]) || m.getMealName().contains(rez[1]) || m.getMealName().contains(rez[2]) || m.getMealName().contains(rez[3]) ) && !lista2Rez.contains(m)) {

    				//System.out.println(m);
    				lista2Rez.add(m);
    			}
    		}
    		
    		for(MealModel m : lista2) {

    			if( (m.getMealDesc().contains(rez[0]) || m.getMealDesc().contains(rez[1]) || m.getMealDesc().contains(rez[2]) || m.getMealDesc().contains(rez[3]) || m.getMealDifficulty().contains(rez[0]) || m.getMealDifficulty().contains(rez[1]) || m.getMealDifficulty().contains(rez[2]) || m.getMealDifficulty().contains(rez[3])) && !lista2Rez.contains(m)) {

    			//	System.out.println(m);
    				lista2Rez.add(m);
    			}
    		}
        	
        }
        
        for(FoodModel f : listaRez) {
        	
        	System.out.println(f);
        }
        
        for(MealModel t : lista2Rez) {
        	
        	System.out.println(t);
        }

	}

	private static void mainMenu(Scanner sc){
		int choice;
		do{
			System.out.println("Main menu:");
			System.out.println("-----------");
			System.out.println("1. My Fridge");
			System.out.println("2. Meals");
			System.out.println("3. All food");
			System.out.println("4. Add new food");
			System.out.println("5. Search");
			System.out.println("0. Exit");
			System.out.println();
			System.out.println("Enter your choice: ");

			choice = sc.nextInt();
			sc.nextLine();                 // morao sam ovo da dodam

			switch (choice){
			case 1 : 
				fridgeMenu(sc);
				break;
			case 2 :
				System.out.println("Meals");
				break;
			case 3 : System.out.println("All food");
			break;
			case 4 : 
				System.out.println("Add new food");
				break;
			case 5 : 
				//	System.out.println("Search");
				search(sc);
				break;
			case 0 :
				System.out.println("Exiting...");
				break;
			default :
				System.out.println("Invalid option");
				break;
			}
		} while(choice != 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		welcomeMessage();

		mainMenu(sc);
	}
}

