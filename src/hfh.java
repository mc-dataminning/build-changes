import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hfh implements hey {
   public static final MapCodec<hfh> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azi.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, hfh::new));
   private final azi c;

   public hfh(azi $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aup $$0, hey.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public hfa a() {
      return hfb.c;
   }
}
