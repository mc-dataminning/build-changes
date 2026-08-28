import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hen implements hes {
   public static final MapCodec<hen> a = MapCodec.unit(new hen());

   @Override
   public float a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (cwq.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = cwq.b($$0, $$2);
         return (float)hev.a($$0, $$2) / (float)$$4;
      }
   }

   @Override
   public MapCodec<hen> a() {
      return a;
   }
}
