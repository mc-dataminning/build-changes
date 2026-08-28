import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hfu implements hfz {
   public static final MapCodec<hfu> a = MapCodec.unit(new hfu());

   @Override
   public float a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cxl.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cxl.b($$0, $$2);
         return (float)hgc.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hfu> a() {
      return a;
   }
}
