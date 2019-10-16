/**
 * JumpCommand implements Command and executes jump method
 * @author Adam Nguyen
 *
 */
public class JumpCommand implements Command{
	/**
	 * sets player to parameter in constructor
	 */
	private Player player;
	public JumpCommand(Player player)
	{
		this.player=player;
	}
	/**
	 * execute calls jump method
	 */
	public void execute()
	{
		player.jump();
	}

}
