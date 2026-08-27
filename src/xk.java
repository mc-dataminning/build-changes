import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class xk {
   public static final MapCodec<xi> a = kh.ar.q().dispatchMap(xi::a, $$0 -> $$0.a().codec());
   public static final Codec<xi> b = a.codec();
   public static final xq<vd, xi> c = xo.a(ki.as).b(xi::a, xj::b);
   public static final xq<vd, Optional<xi>> d = c.a(xo::a);

   public static xj<?> a(ix<xj<?>> $$0) {
      ix.a($$0, "blank", xg.b);
      ix.a($$0, "styled", xl.a);
      return ix.a($$0, "fixed", xh.a);
   }
}
