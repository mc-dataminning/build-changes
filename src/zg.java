import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class zg {
   public static final MapCodec<ze> a = lp.aq.q().dispatchMap(ze::a, zf::a);
   public static final Codec<ze> b = a.codec();
   public static final zm<wz, ze> c = zk.a(lq.at).b(ze::a, zf::b);
   public static final zm<wz, Optional<ze>> d = c.a(zk::a);

   public static zf<?> a(jv<zf<?>> $$0) {
      jv.a($$0, "blank", zc.b);
      jv.a($$0, "styled", zh.a);
      return jv.a($$0, "fixed", zd.a);
   }
}
