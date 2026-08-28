import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hil() implements hid {
   public static final MapCodec<hil> a = MapCodec.unit(new hil());

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      if ($$2 instanceof gqz $$5 && $$5.gj().g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hil> a() {
      return a;
   }
}
