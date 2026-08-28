import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yh {
   public static final MapCodec<yf> a = mb.an.q().dispatchMap(yf::a, yg::a);
   public static final Codec<yf> b = a.codec();
   public static final yn<wa, yf> c = yl.a(mc.ay).b(yf::a, yg::b);
   public static final yn<wa, Optional<yf>> d = c.a(yl::a);

   public static yg<?> a(ke<yg<?>> $$0) {
      ke.a($$0, "blank", yd.b);
      ke.a($$0, "styled", yi.a);
      return ke.a($$0, "fixed", ye.a);
   }
}
