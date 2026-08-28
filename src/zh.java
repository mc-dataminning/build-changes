import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class zh {
   public static final MapCodec<zf> a = lp.aq.q().dispatchMap(zf::a, zg::a);
   public static final Codec<zf> b = a.codec();
   public static final zn<xa, zf> c = zl.a(lq.at).b(zf::a, zg::b);
   public static final zn<xa, Optional<zf>> d = c.a(zl::a);

   public static zg<?> a(jv<zg<?>> $$0) {
      jv.a($$0, "blank", zd.b);
      jv.a($$0, "styled", zi.a);
      return jv.a($$0, "fixed", ze.a);
   }
}
