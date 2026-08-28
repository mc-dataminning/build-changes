import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yr {
   public static final MapCodec<yp> a = lt.ao.r().dispatchMap(yp::a, yq::a);
   public static final Codec<yp> b = a.codec();
   public static final yx<wk, yp> c = yv.a(lu.ay).b(yp::a, yq::b);
   public static final yx<wk, Optional<yp>> d = c.a(yv::a);

   public static yq<?> a(jz<yq<?>> $$0) {
      jz.a($$0, "blank", yn.b);
      jz.a($$0, "styled", ys.a);
      return jz.a($$0, "fixed", yo.a);
   }
}
