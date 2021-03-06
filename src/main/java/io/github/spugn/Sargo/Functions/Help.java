package io.github.spugn.Sargo.Functions;

import io.github.spugn.Sargo.Utilities.GitHubImage;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.util.EmbedBuilder;

/**
 * HELP
 * <p>
 *     Displays a help menu full of available commands.
 * </p>
 *
 * @author S'pugn
 * @version 1.1
 * @since v1.0
 */
public class Help
{
    /**
     * Displays the help menu.
     * @param channel  The channel where the help menu should be displayed.
     */
    public Help(IChannel channel)
    {
        EmbedBuilder builder = new EmbedBuilder();

        builder.withAuthorName("Help Menu");
        builder.withAuthorIcon(new GitHubImage("images/System/Help_Icon.png").getURL());

        String generalHelp = "";
        generalHelp += "'**help**' - Display the command list." + "\n";
        generalHelp += "'**info**' - Display bot information." + "\n";
        builder.appendField("GENERAL", generalHelp, false);

        String scoutingHelp = "";
        scoutingHelp += "'**scout**' - View a list of available banners." + "\n";
        scoutingHelp += "'**scout** p[Page Number]' - View a page in the list of available banners." + "\n";
        scoutingHelp += "'**scout** [Banner ID]' - View a banner's information." + "\n";
        scoutingHelp += "'**scout** [Banner ID] [s/si]' - Perform a single scout." + "\n";
        scoutingHelp += "'**scout** [Banner ID] [ws/wsi]' - Perform a weapon single scout." + "\n";
        scoutingHelp += "'**scout** [Banner ID] [m/mi]' - Perform a multi scout." + "\n";
        scoutingHelp += "'**scout** [Banner ID] [wm/wmi]' - Perform a weapon multi scout." + "\n";
        scoutingHelp += "'**scout** [Banner ID] [rc/rci]' - Perform a record crystal scout." + "\n";
        scoutingHelp += "'**scout** [nts/ntsi]' - Perform a normal ticket single scout." + "\n";
        scoutingHelp += "'**scout** [ntm/ntmi]' - Perform a normal ticket multi scout." + "\n";
        scoutingHelp += "'**scout** [pts/ptsi]' - Perform a plus ticket single scout." + "\n";
        scoutingHelp += "'**scout** [ptm/ptmi]' - Perform a plus ticket multi scout." + "\n\n";
        scoutingHelp += "**Adding an 'i' after your scout type will generate an image result.**" + "\n";
        builder.appendField("SCOUT", scoutingHelp, false);

        String shopHelp = "";
        shopHelp += "'**shop**' - View the shop." + "\n";
        shopHelp += "'**shop** [Item ID] [Quantity]' - \"Buy\" a Memory Diamond bundle(s)." + "\n";
        builder.appendField("SHOP", shopHelp, false);

        String profileHelp = "";
        profileHelp += "'**profile**' - View your basic profile." + "\n";
        profileHelp += "'**profile** [info/i] [Banner ID]' - View your collected/missing characters in a banner." + "\n";
        profileHelp += "'**profile** [data/d]' - View your Step/Record Crystal data." + "\n";
        profileHelp += "'**profile** [search/s] [Character Name]' - Search for that character in your collection." + "\n";
        builder.appendField("PROFILE", profileHelp, false);

        String userHelp = "";
        userHelp += "'**user** [@name]' - View a user's basic profile." + "\n";
        builder.appendField("USER SEARCH", userHelp, false);

        String resetHelp = "";
        resetHelp += "'**reset**' - Reset your data file." + "\n";
        resetHelp += "'**reset** [Banner ID] c' - Reset your character data for a banner." + "\n";
        resetHelp += "'**reset** [Banner ID] w' - Reset your weapon data for a banner." + "\n";
        resetHelp += "'**reset** [Banner ID] a' - Reset all data for a banner." + "\n\n";
        resetHelp += "**Resetting all data includes your Step or Record Crystal data as well.**" + "\n";
        builder.appendField("DATA RESET", resetHelp, false);

        channel.sendMessage(builder.build());
    }
}
