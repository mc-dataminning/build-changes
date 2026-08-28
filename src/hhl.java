import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hhl implements hhq {
   public static final MapCodec<hhl> a = MapCodec.unit(new hhl());

   @Override
   public float a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cyg.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cyg.b($$0, $$2);
         return (float)hht.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hhl> a() {
      return a;
   }
}
