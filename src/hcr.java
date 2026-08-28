import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcr(float b) implements hcp {
   public static final MapCodec<hcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.o.optionalFieldOf("period", 1.0F).forGetter(hcr::b)).apply($$0, hcr::new)
   );

   @Override
   public float a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return $$2 != null && $$2.fB() == $$0 ? (float)$$2.fC() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hcr> a() {
      return a;
   }
}
