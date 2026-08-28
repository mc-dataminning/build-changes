import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hgs implements hgx {
   public static final MapCodec<hgs> a = MapCodec.unit(new hgs());

   @Override
   public float a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cxw.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cxw.b($$0, $$2);
         return (float)hha.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hgs> a() {
      return a;
   }
}
