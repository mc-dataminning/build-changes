import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gpm implements gpd {
   public static final MapCodec<gpm> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azi.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gpm::new));
   private final azi c;

   public gpm(azi $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aup $$0, gpd.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gpf a() {
      return gpg.c;
   }
}
