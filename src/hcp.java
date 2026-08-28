import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hcp implements hcu {
   public static final MapCodec<hcp> a = MapCodec.unit(new hcp());

   @Override
   public float a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cvh.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cvh.b($$0, $$2);
         return (float)hcx.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hcp> a() {
      return a;
   }
}
