package Cars_data;

// importing required library 
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Create class  named Cars 
 * Has 7 attributes (array lists with different types )
 * Has 4 method  , one is for initialization & other 3 are the update  
 */
public class Cars {
	/*
	 * Creating array list named cars_id of type String for attribute asked to make
	 * id Array list is private in order not be accessed out side this class
	 */
	private ArrayList<String> cars_id = new ArrayList<String>();

	/*
	 * Creating array list named cars_make of type String for attribute asked to
	 * make Array list is private in order not be accessed out side this class
	 */
	private ArrayList<String> cars_make = new ArrayList<String>();

	/*
	 * Creating array list named cars_model of type String for attribute asked to
	 * model Array list is private in order not be accessed out side this class
	 */

	private ArrayList<String> cars_model = new ArrayList<String>();

	/*
	 * Creating array list named cars_years_of_manufactuer of type Integer for
	 * attribute asked to Year of manufacture Array list is private in order not be
	 * accessed out side this class
	 */

	private ArrayList<Integer> cars_years_of_manufactuer = new ArrayList<Integer>();

	/*
	 * Creating array list named cars_color of type String for attribute asked to
	 * Color Array list is private in order not be accessed out side this class
	 */

	private ArrayList<String> cars_color = new ArrayList<String>();

	/*
	 * Creating array list named cars_price of type Double for attribute asked to
	 * Price Array list is private in order not be accessed out side this class
	 */

	private ArrayList<Double> cars_price = new ArrayList<Double>();

	/*
	 * Creating array list named cars_registertion_number of type Double for
	 * attribute asked to registertion_number Array list is private in order not be
	 * accessed out side this class
	 */

	private ArrayList<String> cars_registertion_number = new ArrayList<String>();

	/*
	 * This method name task_Init return void This method used only once when the
	 * program start It is similar to Constructor but it is also adjustable If we
	 * read elements that has same index in other array lists it we will give us
	 * complete information about the car Example 1 : index =0
	 * cars_id,cars_make,cars_model,cars_years_of_manufactuer,cars_price &
	 * cars_registertion_number these array list give us information about one car
	 * that is stored in index= 0 This function is more like a data base to the
	 * system which you can add or remove from it If you wanna add new car please
	 * read the comment below after each array list in order to not make something
	 * wrong If you wanna remove car please make sure to delete each data in all
	 * array list that has same index
	 */

	void Task2_Init()

	{

		cars_id.add("1HGBH41JXMN109186");

		cars_id.add("1HGBH42JXMN109186");

		cars_id.add("1HGBH43JXMN109186");

		cars_id.add("1HGBH44JXMN109186");

		cars_id.add("1HGBH45JXMN109186");
		/*
		 * if you are gonna add cars_id please add it here & make this comment after it
		 */

		cars_make.add("BMW");

		cars_make.add("BMW");

		cars_make.add("VOLKSWAGEN");

		cars_make.add("VOLKSWAGEN");

		cars_make.add("AUDI");
		/*
		 * if you are gonna add cars_make please add it here & make this comment after
		 * it
		 */
		cars_model.add("S_class");

		cars_model.add("B_class");

		cars_model.add("S_class");

		cars_model.add("B_class");

		cars_model.add("A_class");
		/*
		 * if you are gonna add cars_model please add it here & make this comment after
		 * it
		 */
		cars_years_of_manufactuer.add(2019);

		cars_years_of_manufactuer.add(2019);

		cars_years_of_manufactuer.add(2021);

		cars_years_of_manufactuer.add(2021);

		cars_years_of_manufactuer.add(2023);
		/*
		 * if you are gonna add cars_years_of_manufactuer please add it here & make this
		 * comment after it
		 */
		cars_color.add("Red");

		cars_color.add("Blue");

		cars_color.add("Yellow");

		cars_color.add("White");

		cars_color.add("Black");
		/*
		 * if you are gonna add cars_color please add it here & make this comment after
		 * it
		 */
		cars_price.add(12930.00);

		cars_price.add(11935.00);

		cars_price.add(11939.50);

		cars_price.add(14940.30);

		cars_price.add(17500.00);

		/*
		 * if you are gonna add cars_price please add it here & make this comment after
		 * it
		 */
		cars_registertion_number.add("ABC.DK.123");

		cars_registertion_number.add("ABC.DK.124");

		cars_registertion_number.add("ABC.DK.125");

		cars_registertion_number.add("ABC.DK.126");

		cars_registertion_number.add("ABC.DK.127");
		/*
		 * if you are gonna add cars_registertion_number please add it here & make this
		 * comment after it
		 */

		/*
		 * This a test condition in order to protect program & check data base size
		 * before starting It exists if size of array lists not equal
		 */

		if (!(cars_make.size() == cars_id.size() && cars_id.size() == cars_model.size()
				&& cars_model.size() == cars_years_of_manufactuer.size()
				&& cars_years_of_manufactuer.size() == cars_price.size()
				&& cars_color.size() == cars_registertion_number.size())) {

			System.out.println("Please check your data base system because it is missing element :");

			System.out.println("System wont start unless you fix it ");

			System.out.println("Number of cars_make arraylist  " + cars_make.size());

			System.out.println("Number of cars_model arraylist  " + cars_model.size());

			System.out.println("Number of cars_id arraylist  " + cars_id.size());

			System.out.println("Number of cars_years_of_manufactuer arraylist  " + cars_years_of_manufactuer.size());

			System.out.println("Number of cars_price arraylist  " + cars_price.size());

			System.out.println("Number of cars_color arraylist  " + cars_color.size());
			System.out.println("Number of cars_registertion_number arraylist  " + cars_registertion_number.size());

			System.exit(0);
		}

	}

	
	
	/*
	 * This function will provide right performance of Home task required a it
	 * prints in File named "a.txt" It gets required brand that asked by user
	 * "it is better to use file info while entering data " "Info" file will provide
	 * for you easy & simple way to choose desired entry
	 */
	void Task2_Update_a() {
		/*
		 * This method will provide a list of all cars of a given "brand" that you
		 * desire
		 * 
		 */
		// variable to store brand name
		String brand;
		/*
		 * This boolean variable is used to make condition in if less complexity Value
		 * changed during for loop if names are equal then true if not false
		 */
		boolean flag = false;

		Scanner myObj = new Scanner(System.in);

		// This way is just to make file not over write data & get rid of previous search

		try (FileWriter f = new FileWriter("a.text", true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);) {

			System.out.println("Enter brand ?");

			brand = myObj.nextLine();

			for (int i = 0; i < cars_make.size(); i++) {
				flag = brand.equals(cars_make.get(i));
				if (flag == true) {
					p.println("==========================");
					p.println("Car of brand " + brand + " its data:");
					p.println(cars_id.get(i));
					p.println(cars_model.get(i));
					p.println(cars_years_of_manufactuer.get(i));
					p.println(cars_color.get(i));
					p.println(cars_price.get(i) + " $");
					p.println(cars_registertion_number.get(i));
					flag = false;
				}
			}
			// Closing file after finishing printing data in order to be displayed in the txt file
			System.out.println("Done");
			p.close();
			f.close();
			b.close();

		} catch (IOException i) {
			// if anything wrong happen while opening file error will be printed
			i.printStackTrace();
			System.out.println("error");
		}

	}
	
	
	/*
	 * This function will provide right performance of Home task required a it
	 * prints in File named "b.txt" It gets required brand that asked by user
	 * "it is better to use file info while entering data " "Info" file will provide
	 * for you easy & simple way to choose desired entry
	 */
	void Task2_Update_b() {
		/*
		 * Variable of type string to store user entered data of name model of the car
		 */
		String model;
		/*
		 * Variable of type boolean is used make condition in if less complexity 
		 * */
		boolean flag = false;
		/*
		 * This variable of type integer will store user enter data of number of years  
		 */
		int n;
/*
 * This variable just use use to make condition less complexity & readable
 */
		int temp;
		Scanner myObj = new Scanner(System.in);
		// This way is just to make file not over write data & get rid of previous search
		try (FileWriter f = new FileWriter("b.text", true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);) {
			System.out.println("Enter Model ?");
			model = myObj.nextLine();
			
			System.out.println("Enter number of years that model have been in use for more than n years");
			n = myObj.nextInt();
			myObj.nextLine();
// looping around list to find if desired car exists
			for (int i = 0; i < cars_make.size(); i++) {
				flag = model.equals(cars_model.get(i));
				temp = cars_years_of_manufactuer.get(i);
				/*
				 * Nested condition first check if model is available 
				 * then check if there is car year higher than entered one   
				 */
				if (flag == true) {
					if (temp > n) {
						p.println("==========================");
						p.println("Car of brand " + model + " its data:");
						p.println("Given model that have been in use after year :  " + n );
						p.println(cars_make.get(i));
						p.println(cars_id.get(i));
						p.println(cars_years_of_manufactuer.get(i));
						p.println(cars_color.get(i));
						p.println(cars_price.get(i) + " $");
						p.println(cars_registertion_number.get(i));
						flag = false;

					}
				}
			}
			// Closing file after finishing printing data in order to be displayed in the txt file
			System.out.println("Done");
			p.close();
			f.close();
			b.close();

		} catch (IOException i) {
			// if anything wrong happen while opening file error will be printed
			i.printStackTrace();
			System.out.println("error");
		}

	}

	
	/*
	 * This function will provide right performance of Home task required a it
	 * prints in File named "c.txt" It gets required brand that asked by user
	 * "it is better to use file info while entering data " "Info" file will provide
	 * for you easy & simple way to choose desired entry
	 */
	void Task2_Update_C() {
		/*
		 * Variable named year of type integer to store user entered data about car "manufacture year" 
		 */
		int year;
		Scanner myObj = new Scanner(System.in);
		/*
		 * Variable named Price of type Double to store user entered data about car "price"
		 */
		double price;
		/*
		 * This variable is used to make condition less complexity & readable 
		 * It store temporary car manufacture year
		 */
		int temp;
		
		/*
		 * This variable is used to make condition less complexity & readable 
		 * It store temporary car price
		 */		
		double temp1;
	
		// This way is just to make file not over write data & get rid of previous search
		
		try (FileWriter f = new FileWriter("c.text", true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);) {
			System.out.println("Enter year of manufacture ?");
			year = myObj.nextInt();
			myObj.nextLine();
			System.out.println("Enter price");
			price = myObj.nextDouble();
			myObj.nextLine();

			for (int i = 0; i < cars_years_of_manufactuer.size(); i++) {
				temp = cars_years_of_manufactuer.get(i);
				if (year == temp) {
					temp1 = cars_price.get(i);
					if (temp1 > price) {
						p.println("==========================");
						p.println("Car of year of manufacture " + year + " its data:");
						p.println("Car Price higher than " + price + " $");
						p.println(cars_id.get(i));
						p.println(cars_make.get(i));
						p.println(cars_model.get(i));
						p.println(cars_color.get(i));
						p.println(cars_registertion_number.get(i));

					}
				}
			}
			// Closing file after finishing printing data in order to be displayed in the txt file
			System.out.println("Done");
			p.close();
			f.close();
			b.close();

		} catch (IOException i) {
			i.printStackTrace();
			System.out.println("error");
		}

	}

}
