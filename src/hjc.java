import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hjc(float b) implements hja {
   public static final MapCodec<hjc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayw.o.optionalFieldOf("period", 1.0F).forGetter(hjc::b)).apply($$0, hjc::new)
   );

   @Override
   public float a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3) {
      return $$2 != null && $$2.fB() == $$0 ? (float)$$2.fC() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hjc> a() {
      return a;
   }
}
