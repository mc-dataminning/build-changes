import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hil implements hiq {
   public static final MapCodec<hil> a = MapCodec.unit(new hil());

   @Override
   public float a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (czd.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = czd.b($$0, $$2);
         return (float)hit.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hil> a() {
      return a;
   }
}
