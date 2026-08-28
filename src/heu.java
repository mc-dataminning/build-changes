import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record heu(float b) implements hes {
   public static final MapCodec<heu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.o.optionalFieldOf("period", 1.0F).forGetter(heu::b)).apply($$0, heu::new)
   );

   @Override
   public float a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3) {
      return $$2 != null && $$2.fA() == $$0 ? (float)$$2.fB() % this.b : 0.0F;
   }

   @Override
   public MapCodec<heu> a() {
      return a;
   }
}
