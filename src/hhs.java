import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhs(float b) implements hhq {
   public static final MapCodec<hhs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.o.optionalFieldOf("period", 1.0F).forGetter(hhs::b)).apply($$0, hhs::new)
   );

   @Override
   public float a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3) {
      return $$2 != null && $$2.fA() == $$0 ? (float)$$2.fB() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hhs> a() {
      return a;
   }
}
