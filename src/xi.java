import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class xi {
   public static final MapCodec<xg> a = kf.ar.q().dispatchMap(xg::a, $$0 -> $$0.a().codec());
   public static final Codec<xg> b = a.codec();
   public static final xo<vb, xg> c = xm.a(kg.as).b(xg::a, xh::b);
   public static final xo<vb, Optional<xg>> d = c.a(xm::a);

   public static xh<?> a(iv<xh<?>> $$0) {
      iv.a($$0, "blank", xe.b);
      iv.a($$0, "styled", xj.a);
      return iv.a($$0, "fixed", xf.a);
   }
}
