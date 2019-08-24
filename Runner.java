class Runner {
	public void run() {
		boolean varC = false;
		A a = null;
		B b = new B();

		if (varC && (a.varA || b.varB)) {
			System.out.println("Ariba!");
		}
	
		System.out.println("Escapou de um Null Pointer Exception");
	}

	class A {
		public boolean varA = true;
	}

	class B {
		public boolean varB = false;
	}
}