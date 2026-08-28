import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhd() implements hhk {
   public static final MapCodec<hhd> a = MapCodec.unit(new hhd());

   @Override
   public float a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3) {
      return $$2 instanceof crj $$4 ? $$4.gE().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hhd> a() {
      return a;
   }
}
