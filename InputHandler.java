import java.util.HashMap;
/**
 * InputHandler handles the inputs and executes command based on input, puts into hashmap
 * @author Adam Nguyen
 *
 */
public class InputHandler {
	/**
	 * HashMap is initialized and input keys/values are made in constructor
	 */
	private HashMap<String,Command> commands;
	public InputHandler(Player player)
	{
		commands=new HashMap<String,Command>();
		commands.put("jump",new JumpCommand(player));
		commands.put("run",new RunCommand(player));
		commands.put("fire",new FireCommand(player));
		commands.put("quit",new QuitCommand());
	}
	/**
	 * executes command based on button parameter
	 * @param button
	 */
	public void buttonPressed(String button)
	{
		commands.get(button).execute();
	}

}
