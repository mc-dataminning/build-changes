import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgb(float b) implements hfz {
   public static final MapCodec<hgb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.o.optionalFieldOf("period", 1.0F).forGetter(hgb::b)).apply($$0, hgb::new)
   );

   @Override
   public float a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3) {
      return $$2 != null && $$2.fA() == $$0 ? (float)$$2.fB() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hgb> a() {
      return a;
   }
}
