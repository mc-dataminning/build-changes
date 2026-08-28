import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gqd implements gpu {
   public static final MapCodec<gqd> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayp.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gqd::new));
   private final ayp c;

   public gqd(ayp $$0) {
      this.c = $$0;
   }

   @Override
   public void a(atw $$0, gpu.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gpw a() {
      return gpx.c;
   }
}
