import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gzr implements gzi {
   public static final MapCodec<gzr> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azv.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gzr::new));
   private final azv c;

   public gzr(azv $$0) {
      this.c = $$0;
   }

   @Override
   public void a(avd $$0, gzi.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gzk a() {
      return gzl.c;
   }
}
