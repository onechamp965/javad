package sec02.exam01;

public class Anonymous {
	Person feild = new Person() {
		void work() {
			System.out.println("출근합니다");
		}
		
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
	};
    
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다");
			}
			
			@Override
			public void wake() {
				System.out.println("7시에 일어납니다");
				walk();
			}
		};
		
		localVar.wake();
	}
	
	void method(Person person) {
		person.wake();
    }
}