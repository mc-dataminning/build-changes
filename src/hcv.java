import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcv(float b) implements hct {
   public static final MapCodec<hcv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.o.optionalFieldOf("period", 1.0F).forGetter(hcv::b)).apply($$0, hcv::new)
   );

   @Override
   public float a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3) {
      return $$2 != null && $$2.fB() == $$0 ? (float)$$2.fC() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hcv> a() {
      return a;
   }
}
