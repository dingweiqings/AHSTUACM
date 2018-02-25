
public class Animal {
private String name;
private String food;
private double age;

public  Animal(){
	this.name="";
	this.food="";
	
}
public double getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFood() {
	return food;
}

public void setFood(String food) {
	this.food = food;
}

private static Animal animal=new Animal();
	
public static  Animal getAnimal(){
	
	return animal;
	
	
}



}
