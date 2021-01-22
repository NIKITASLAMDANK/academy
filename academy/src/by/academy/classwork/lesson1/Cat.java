package by.academy.classwork.lesson1;

public class Cat {
		     int age;
	     String nickname;
	     int money;
	    public char initial;
	    public boolean isHomeAnimal;

	    public Cat() {

	    }

	    public Cat(String nickname) {
	        this.nickname = nickname;
	    }

	    public void grow() {
	        this.age += 1;
	    }

	    public void sleep() {
	        System.out.println("Cat sleep");
	    }

	    public void eat() {
	        System.out.println("Cat eat");
	    }

	    public void walk() {
	        System.out.println("Cat walk");
	    }

	    public int getMoney() {
	        return money;
	    }

	    public void setMoney(int money) {
	        this.money = money;
	    }

	    public char getInitial() {
	        if (this.initial == 0){
	            return this.nickname.charAt(0);
	        }
	        return this.initial;
	    }

	    public void setInitial(char initial) {
	        this.initial = initial;
	    }

	    public boolean isHomeAnimal() {
	        return isHomeAnimal;
	    }

	    public void setIsHomeAnimal(boolean homeAnimal) {
	        isHomeAnimal = homeAnimal;
	    }
	}