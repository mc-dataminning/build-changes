import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcu(float b) implements hcs {
   public static final MapCodec<hcu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.o.optionalFieldOf("period", 1.0F).forGetter(hcu::b)).apply($$0, hcu::new)
   );

   @Override
   public float a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return $$2 != null && $$2.fB() == $$0 ? (float)$$2.fC() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hcu> a() {
      return a;
   }
}
