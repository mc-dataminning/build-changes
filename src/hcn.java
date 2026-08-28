import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hcn implements hcs {
   public static final MapCodec<hcn> a = MapCodec.unit(new hcn());

   @Override
   public float a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cvf.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cvf.b($$0, $$2);
         return (float)hcv.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hcn> a() {
      return a;
   }
}
