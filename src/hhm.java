import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hhm(float b) implements hhk {
   public static final MapCodec<hhm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.o.optionalFieldOf("period", 1.0F).forGetter(hhm::b)).apply($$0, hhm::new)
   );

   @Override
   public float a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3) {
      return $$2 != null && $$2.fA() == $$0 ? (float)$$2.fB() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hhm> a() {
      return a;
   }
}
