import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gpk implements gpb {
   public static final MapCodec<gpk> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gpk::new));
   private final azg c;

   public gpk(azg $$0) {
      this.c = $$0;
   }

   @Override
   public void a(auo $$0, gpb.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gpd a() {
      return gpe.c;
   }
}
