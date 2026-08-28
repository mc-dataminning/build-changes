import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hix implements hjc {
   public static final MapCodec<hix> a = MapCodec.unit(new hix());

   @Override
   public float a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cyt.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cyt.b($$0, $$2);
         return (float)hjf.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hix> a() {
      return a;
   }
}
