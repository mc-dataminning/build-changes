import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hht(boolean b) implements hhq {
   public static final MapCodec<hht> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hht::b)).apply($$0, hht::new)
   );

   @Override
   public float a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3) {
      if ($$2 != null && $$2.fA() == $$0) {
         return this.b ? (float)$$2.fB() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hht> a() {
      return a;
   }

   public static int a(czn $$0, bxj $$1) {
      return $$0.a($$1) - $$1.fB();
   }
}
