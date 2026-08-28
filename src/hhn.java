import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhn(boolean b) implements hhk {
   public static final MapCodec<hhn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hhn::b)).apply($$0, hhn::new)
   );

   @Override
   public float a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3) {
      if ($$2 != null && $$2.fA() == $$0) {
         return this.b ? (float)$$2.fB() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hhn> a() {
      return a;
   }

   public static int a(czk $$0, bxj $$1) {
      return $$0.a($$1) - $$1.fB();
   }
}
