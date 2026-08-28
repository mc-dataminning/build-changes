import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gwx implements gwo {
   public static final MapCodec<gwx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azl.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gwx::new));
   private final azl c;

   public gwx(azl $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aus $$0, gwo.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gwq a() {
      return gwr.c;
   }
}
