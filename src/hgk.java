import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hgk implements hgp {
   public static final MapCodec<hgk> a = MapCodec.unit(new hgk());

   @Override
   public float a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cxr.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cxr.b($$0, $$2);
         return (float)hgs.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hgk> a() {
      return a;
   }
}
