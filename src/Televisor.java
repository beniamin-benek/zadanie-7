class Televisor {

	private boolean status;
	
	void turnOff() {
		status = false;
	}
	
	void turnOn() {
		status = true;
	}
	
	void showStatus() {
		if (status)
			System.out.println("Telewizor jest włączony");
		else
			System.out.println("Telewizor jest wyłączony");
	}
}