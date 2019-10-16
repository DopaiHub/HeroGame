/**
 * QuitCommand implements Command and exits game
 * @author Adam Nguyen
 *
 */
public class QuitCommand implements Command{
	public QuitCommand(){}
	/**
	 * Displays game over and exits program
	 */
	public void execute()
	{
		System.out.println("Game over :(");
		System.exit(0);
	}

}
