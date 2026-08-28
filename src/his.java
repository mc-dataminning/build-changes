import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record his(float b) implements hiq {
   public static final MapCodec<his> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azg.o.optionalFieldOf("period", 1.0F).forGetter(his::b)).apply($$0, his::new)
   );

   @Override
   public float a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3) {
      return $$2 != null && $$2.fB() == $$0 ? (float)$$2.fC() % this.b : 0.0F;
   }

   @Override
   public MapCodec<his> a() {
      return a;
   }
}
