package meow.emily.patootie.events;

import meow.emily.patootie.Emily;
import net.labymod.api.events.MessageSendEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class CommandHandler implements MessageSendEvent {
    Emily instance = Emily.getInstance();

    @Override
    public boolean onSend(String s) {
        if (s.startsWith("/ph add")) {
            EntityPlayer player = Minecraft.getMinecraft().player;
            String[] args = new String[0];
        }
        if (s.startsWith("/ph remove")) {
            EntityPlayer player = Minecraft.getMinecraft().player;
            String[] args = new String[0];
        }
        return false;
    }

}
