package kodo777.btacontinuousmusic.mixin;

import net.minecraft.client.sound.SoundManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = SoundManager.class, remap = false)
public abstract class SoundManagerMixin {

    @Shadow private int ticksBeforeMusic;

    @Inject(method = "playRandomMusicIfReady()V", at = @At("RETURN"))
    public void playRandomMusicIfReady(CallbackInfo ci){
        this.ticksBeforeMusic = 0;

    }

}