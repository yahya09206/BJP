public class Main5 {
	public static void main(String[] args) {
		EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
		System.out.println("Initial health is " + player.getHealth());
		// Player player = new Player();
		// player.name = "Tim";
		// player.health = 20;
		// player.weapon = "Sword";

		// int damage = 10;
		// player.loseHealth(damage);
		// System.out.println("Remaining health = " + player.healthRemaining());

		// damage = 11;
		// player.health = 200;
		// player.loseHealth(damage);
		// System.out.println("Remaining health = " + player.healthRemaining());
		Printer printer = new Printer(50, false);
		System.out.println("Initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

	}
}