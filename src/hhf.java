import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hhf implements hhk {
   public static final MapCodec<hhf> a = MapCodec.unit(new hhf());

   @Override
   public float a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cyd.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cyd.b($$0, $$2);
         return (float)hhn.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hhf> a() {
      return a;
   }
}
