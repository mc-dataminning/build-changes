import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcq(float b) implements hco {
   public static final MapCodec<hcq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayh.o.optionalFieldOf("period", 1.0F).forGetter(hcq::b)).apply($$0, hcq::new)
   );

   @Override
   public float a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3) {
      return $$2 != null && $$2.fB() == $$0 ? (float)$$2.fC() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hcq> a() {
      return a;
   }
}
