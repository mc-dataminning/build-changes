import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcw(float b) implements hcu {
   public static final MapCodec<hcw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.o.optionalFieldOf("period", 1.0F).forGetter(hcw::b)).apply($$0, hcw::new)
   );

   @Override
   public float a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3) {
      return $$2 != null && $$2.fB() == $$0 ? (float)$$2.fC() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hcw> a() {
      return a;
   }
}
