package io.github.themorningcompany.falconrockets.client.gui.screens;

import io.github.themorningcompany.falconrockets.client.gui.CustomScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ShipControls extends CustomScreen {
    protected ShipControls(ITextComponent titleIn) {
        super(titleIn);
    }

    @Override
    public void init(Minecraft mc, int width, int height) {
        super.init(mc, width, height);
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.font.drawString("Test String", 0, 0, 0xffffffff);
        super.render(mouseX, mouseY, partialTicks);
    }
}
