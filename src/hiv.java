import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hiv implements hja {
   public static final MapCodec<hiv> a = MapCodec.unit(new hiv());

   @Override
   public float a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cyr.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cyr.b($$0, $$2);
         return (float)hjd.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hiv> a() {
      return a;
   }
}
