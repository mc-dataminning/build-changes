import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hdn implements hds {
   public static final MapCodec<hdn> a = MapCodec.unit(new hdn());

   @Override
   public float a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cvz.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cvz.b($$0, $$2);
         return (float)hdv.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hdn> a() {
      return a;
   }
}
