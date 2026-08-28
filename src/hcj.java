import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hcj implements hco {
   public static final MapCodec<hcj> a = MapCodec.unit(new hcj());

   @Override
   public float a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cve.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cve.b($$0, $$2);
         return (float)hcr.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hcj> a() {
      return a;
   }
}
