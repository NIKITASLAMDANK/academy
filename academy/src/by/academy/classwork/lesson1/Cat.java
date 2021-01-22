package by.academy.classwork.lesson1;

public class Cat {
		     int age;
	     String nickname;
	     int money;
	    private char initial;
	    private boolean isHomeAnimal;

	    public Cat() {

	    }

	    public Cat(String nickname) {
	        this.nickname = nickname;
	    }

	    public void grow() {
	        this.age += 1;
	    }

	    public void sleep() {
	        System.out.println("Кот спит");
	    }

	    public void eat() {
	        System.out.println("Кот ест");
	    }

	    public void walk() {
	        System.out.println("Кот гуляет");
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