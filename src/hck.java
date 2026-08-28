import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hck implements hcp {
   public static final MapCodec<hck> a = MapCodec.unit(new hck());

   @Override
   public float a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cvg.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cvg.b($$0, $$2);
         return (float)hcs.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hck> a() {
      return a;
   }
}
