import java.util.List;

import rs.itbootcamp.dao.FoodDaoSQL;
import rs.itbootcamp.dao.MealDaoSQL;
import rs.itbootcamp.model.FoodModel;

 //import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
	
	FoodDaoSQL fd = new FoodDaoSQL();
	
//	FoodModel fm =  new FoodModel(7, "Sarma", 978.89, 783.55, 129.45, 78.90);
	
//	FoodModel fm2 =  new FoodModel(12, "Sir", 255.70, 150.00, 24.55, 20.00);
//	
//	 fd.insert(fm2);
	
	// test za addToMeal()
		
//	fd.addToMeal(14, 7, 710.80);
//	fd.addToMeal(14, 12, 275.40);
	
	MealDaoSQL md = new MealDaoSQL();
	
//  test za insert - radi
	
//	MealModel mm = new MealModel(14, "Punjena paprika", "Domaca paprika punjena mesanim mesom", "srednje");
//	
//	MealModel mm2 = new MealModel(11, "Karadjordjeva snicla", "Snicla u koju je umotano nesto", "jako");
//	
//	MealModel mm3 = new MealModel(18, "Pasulj sa kobasicama", "domace jelo", "jako");
//	md.insert(mm3);
	
	// test za update - radi
	
//	MealModel mm3 = new MealModel(11, "Karadjordjeva snicla", "Snicla u koju je umotano nesto", "slabo");
//	
//	md.update(mm3);
	
	// test za delete - radi
	
//	md.delete(11);
	
	// test za getMeal() - to je search po id-u     - radi
	
//	MealModel rez = md.getMeal(14);
//	System.out.println(rez);
	
	// test za getAllMeals()  - ona vraca listu svih jela u bazi    - radi
	
	
//	List<MealModel> listaJela = md.getAllMeals();
//	
//	for(MealModel p : listaJela) {
//		
//		System.out.println(p);
//	}
	
	// test za getFoodMeal(int meal_id)    - radi
	
//	List<FoodModel> lista = md.getFoodMeal(14);
//	
//	for(FoodModel p : lista) {
//		
//		System.out.println(p);
//	}
	
	
	// test za getFoodMealNames(int meal_id)        - radi
	
//	List<String> lista = md.getFoodMealNames(14);
//	
//	for(String p : lista) {
//		
//		System.out.println(p);
//	}
	
	
	
	}
	
	
	
	//  ovo dole je Cvijanov test koji nije zavrsio
	
	
//    private static FoodModel userNewFood(){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Unesite id: ");
//        int id = sc.nextInt();
//        System.out.println("Unesite name: ");
//        String name = sc.next();
//        System.out.println("Unesite kcal: ");
//        double kcal = sc.nextDouble();
//        System.out.println("Unesite proteine: ");
//        double proteins = sc.nextDouble();
//        System.out.println("Unesite UH: ");
//        double carbs = sc.nextDouble();
//        System.out.println("Unesite masti: ");
//        double fats = sc.nextDouble();
//        return new FoodModel(id,name,kcal,proteins,carbs,fats);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        FoodDao fd = new FoodDaoSQL();
//
////        String menu = """
////                0. Exit
////                1. Dodaj u tabelu Food
////                2. Prikazi tabelu Food
////                """;
//
//        int choice = 5;
//        while(choice != 0){
//  //          System.out.println(menu);
//        	System.out.println("0. Exit");
//        	System.out.println("1. Dodaj u tabelu Food");
//        	System.out.println("2. Prikazi tabelu Food");
//            choice = sc.nextInt();
//            switch(choice){
//                case 0:
//                    break;
//                case 1:
//                    fd.insert(userNewFood());
//                    break;
//                case 2:
//                    System.out.println(fd.getAllFood());
//                    break;
//            }
//        }
//
//    }
}
