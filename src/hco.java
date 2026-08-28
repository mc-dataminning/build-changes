import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hco implements hct {
   public static final MapCodec<hco> a = MapCodec.unit(new hco());

   @Override
   public float a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cvg.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cvg.b($$0, $$2);
         return (float)hcw.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hco> a() {
      return a;
   }
}
