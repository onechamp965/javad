package gggggg;

interface Animal {
	void eat();
}
interface Pet extends Animal {
	void play();
}

class Dog implements Pet {
	public void eat () {
		System.out.println("[강아지 로봇] 사료를 먹습니다");
	}
	
	public void play() {
		System.out.println("[강아지 로봇] 주인과 산책을 합니다");
	}
	
	public void bark() {
		System.out.println("[강아지 로봇] 멍멍! 짓습니다.");
	}
	
	
 class Cat implements Pet {
	 public void eat () {
			System.out.println("[고양이 로봇] 사료를 먹습니다");
		}
		
		public void play() {
			System.out.println("[고양이 로봇] 주인과 산책을 합니다");
		}
		
		public void scratch() {
			System.out.println("[고양이 로봇] 긁다! 스크래칭합니다.");
		}
	}
 
 	public 
}

