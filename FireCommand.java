/**
 * FireCommand implements Command and executes player.fire()
 * @author Adam Nguyen
 *
 */
public class FireCommand implements Command {
	/**
	 * sets player to parameter in constructor
	 */
	private Player player;
	public FireCommand(Player player)
	{
		this.player=player;
	}
	/**
	 * executes fire method
	 */
	public void execute()
	{
		player.fire();
	}

}
