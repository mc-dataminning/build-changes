import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hij() implements hid {
   public static final MapCodec<hij> a = MapCodec.unit(new hij());

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      if ($$2 instanceof gqz $$5 && $$5.bR.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hij> a() {
      return a;
   }
}
