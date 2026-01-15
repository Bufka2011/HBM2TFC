package com.st3v3n.tfb.mixins;

import com.gtnewhorizon.gtnhmixins.ILateMixinLoader;
import com.gtnewhorizon.gtnhmixins.LateMixin;
import com.gtnewhorizon.gtnhmixins.builders.IMixins;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Set;

// The annotation is required, it indicates to
// the mixins framework to instantiate this class
// and look for LateMixins to load.
@LateMixin
public class LateMixinsLoader implements ILateMixinLoader {

    @Override
    public String getMixinConfig() {
        // rename the associated .json file by replacing the "tfb" with your own mod ID
        // in the .json file edit the "package" and "refmap" properties to match your mod
        // also edit the "refmap" property in the "mixins.tfb.json" file
        return "mixins.tfb.late.json";
    }

    @Nonnull
    @Override
    public List<String> getMixins(Set<String> loadedMods) {
        return IMixins.getLateMixins(Mixins.class, loadedMods);
    }
}
