import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yg {
   public static final MapCodec<ye> a = mb.an.q().dispatchMap(ye::a, yf::a);
   public static final Codec<ye> b = a.codec();
   public static final ym<vz, ye> c = yk.a(mc.ay).b(ye::a, yf::b);
   public static final ym<vz, Optional<ye>> d = c.a(yk::a);

   public static yf<?> a(ke<yf<?>> $$0) {
      ke.a($$0, "blank", yc.b);
      ke.a($$0, "styled", yh.a);
      return ke.a($$0, "fixed", yd.a);
   }
}
