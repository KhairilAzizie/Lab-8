package exercise2;

public class Exercise2App {
	// Create object of Runnable
	Runnable statement1 = new Exercise2();
	Runnable statement2 = new Exercise2();
	Runnable statement3 = new Exercise2();

	// Create object of Thread
	Thread word1 = new Thread(statement1, "word1");
	Thread word2 = new Thread(statement2, "word2");
	Thread text = new Thread(statement3, "text");

	word1.start();

	text.start();
	word2.start();

}

