import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class xm {
   public static final MapCodec<xk> a = ki.ar.q().dispatchMap(xk::a, $$0 -> $$0.a().codec());
   public static final Codec<xk> b = a.codec();
   public static final xs<vf, xk> c = xq.a(kj.as).b(xk::a, xl::b);
   public static final xs<vf, Optional<xk>> d = c.a(xq::a);

   public static xl<?> a(iy<xl<?>> $$0) {
      iy.a($$0, "blank", xi.b);
      iy.a($$0, "styled", xn.a);
      return iy.a($$0, "fixed", xj.a);
   }
}
