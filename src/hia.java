import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hia() implements hid {
   public static final MapCodec<hia> a = MapCodec.unit(new hia());

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return cyn.g($$0);
   }

   @Override
   public MapCodec<hia> a() {
      return a;
   }
}
