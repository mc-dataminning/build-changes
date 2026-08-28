import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcx(boolean b) implements hcu {
   public static final MapCodec<hcx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hcx::b)).apply($$0, hcx::new)
   );

   @Override
   public float a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3) {
      if ($$2 != null && $$2.fB() == $$0) {
         return this.b ? (float)$$2.fC() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hcx> a() {
      return a;
   }

   public static int a(cwq $$0, bvi $$1) {
      return $$0.a($$1) - $$1.fC();
   }
}
