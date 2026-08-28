import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hje(float b) implements hjc {
   public static final MapCodec<hje> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayy.o.optionalFieldOf("period", 1.0F).forGetter(hje::b)).apply($$0, hje::new)
   );

   @Override
   public float a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3) {
      return $$2 != null && $$2.fB() == $$0 ? (float)$$2.fC() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hje> a() {
      return a;
   }
}
