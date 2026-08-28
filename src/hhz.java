import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhz() implements hid {
   public static final MapCodec<hhz> a = MapCodec.unit(new hhz());

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hhz> a() {
      return a;
   }
}
