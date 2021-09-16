package rs.itbootcamp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import rs.itbootcamp.database.DatabaseConnection;
import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.MealModel;

public class MealDaoSQL implements MealDao {
	
	 private static final Connection conn = DatabaseConnection.getConnection();

	@Override
	public void insert(MealModel mm) {
	
		 try {
	            PreparedStatement st = conn.prepareStatement("INSERT INTO meal " +
	                    "VALUES (?,?,?,?)");
	            st.setInt(1, mm.getMeal_id());
	            st.setString(2, mm.getMeal_name());
	            st.setString(3, mm.getMeal_description());
	            st.setString(4, mm.getMeal_difficulty());
	         
	            st.executeUpdate();
	            st.close();
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
		
	}

	@Override
	public void delete(int id) {
		
		try {
			PreparedStatement st = conn.prepareStatement("DELETE FROM meal WHERE meal_id = ? ;");
			st.setInt(1, id);
			
			st.executeUpdate();
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(MealModel mm) {
	
		 try {
	            PreparedStatement st = conn.prepareStatement("UPDATE meal " +
	                    "SET meal_id = ?, " +
	                    "meal_name = ?, " +
	                    "meal_desc = ?, " +
	                    "meal_difficulty = ? " +
	                    "WHERE meal_id = ?");
	            st.setInt(1, mm.getMeal_id());
	            st.setString(2, mm.getMeal_name());
	            st.setString(3, mm.getMeal_description());
	            st.setString(4, mm.getMeal_difficulty());
	            st.setInt(5, mm.getMeal_id());
	           
	            st.executeUpdate();
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
		
	}

	@Override
	public MealModel getMeal(int id) {
		
        MealModel mdm = null;
    	
    	try {
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM meal WHERE meal_id = " + id);
			
			int mealId = 0;
			String mealName = "";
			String mealDescription = "";
			String mealDifficulty = "";
			
			
			while(rs.next()) {
				
				mealId = rs.getInt(1);
				mealName = rs.getString(2);
				mealDescription = rs.getString(3);
				mealDifficulty = rs.getString(4);
				
				
			}
			
			
			 mdm = new MealModel(mealId, mealName, mealDescription, mealDifficulty);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
        return mdm;
	}

	@Override
	public List<MealModel> getAllMeals() {
		
      List<MealModel> lista = new ArrayList<>();
    	
    	try {
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM meal");
			
			int mealId = 0;
			String mealName = "";
			String mealDescription = "";
			String mealDiff = "";
			
			
			while(rs.next()) {
				
				mealId = rs.getInt(1);
				mealName = rs.getString(2);
				mealDescription = rs.getString(3);
				mealDiff = rs.getString(4);
				
				MealModel fm = new MealModel(mealId, mealName, mealDescription, mealDiff);
				
				lista.add(fm);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
        return lista;
        
	}

	@Override
	public List<String> getFoodMealNames(int meal_id) {
		
     List<String> lista = new ArrayList<>();
    	
    	try {
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT food_name FROM food " +
			"INNER JOIN mealfood ON food.food_id = mealfood.food_id " + 
			"INNER JOIN meal ON meal.meal_id = mealfood.meal_id " +
			"WHERE meal.meal_id = " + meal_id + ";");
			
			String foodName = "";

			
			while(rs.next()) {
				foodName = rs.getString(1);	
				
				lista.add(foodName);
			}
			
			 
			 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return lista;	
	}

	@Override
	public List<FoodModel> getFoodMeal(int meal_id) {
		
		List<FoodModel> lista = new ArrayList<>();
		
        FoodModel fdm = null;
    	
    	try {
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT food.food_id, food_name, food_kcal, food_proteins, food_carbs, food_fat FROM food " +
			"INNER JOIN mealfood ON food.food_id = mealfood.food_id " + 
			"INNER JOIN meal ON meal.meal_id = mealfood.meal_id " +
			"WHERE meal.meal_id = " + meal_id + ";");
			
			int foodId = 0;
			String foodName = "";
			double foodKcal = 0;
			double foodProteins = 0;
			double foodCarbs = 0;
			double foodFat = 0;
			
			while(rs.next()) {
				
				foodId = rs.getInt(1);
				foodName = rs.getString(2);
				foodKcal = rs.getDouble(3);
				foodProteins = rs.getDouble(4);
				foodCarbs = rs.getDouble(5);
				foodFat = rs.getDouble(6);	
				
				
				fdm = new FoodModel(foodId, foodName, foodKcal, foodProteins, foodCarbs, foodFat);
				 lista.add(fdm);
			}
			
			
			 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
        return lista;
		
		
	}
	
	

}
