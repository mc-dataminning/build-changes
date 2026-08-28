import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class zc {
   public static final MapCodec<za> a = ma.an.q().dispatchMap(za::a, zb::a);
   public static final Codec<za> b = a.codec();
   public static final zi<wv, za> c = zg.a(mb.ay).b(za::a, zb::b);
   public static final zi<wv, Optional<za>> d = c.a(zg::a);

   public static zb<?> a(kd<zb<?>> $$0) {
      kd.a($$0, "blank", yy.b);
      kd.a($$0, "styled", zd.a);
      return kd.a($$0, "fixed", yz.a);
   }
}
