/**
 * RunCommand implements Command and executes runForward method
 * @author Adam Nguyen
 *
 */
public class RunCommand implements Command{
	/**
	 * sets player to parameter in constructor
	 */
	private Player player;
	public RunCommand(Player player)
	{
		this.player=player;
	}
	/**
	 * execute calls runForward method
	 */
	public void execute()
	{
		player.runForward();
	}

}
