import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class zd {
   public static final MapCodec<zb> a = lp.aq.q().dispatchMap(zb::a, zc::a);
   public static final Codec<zb> b = a.codec();
   public static final zj<ww, zb> c = zh.a(lq.at).b(zb::a, zc::b);
   public static final zj<ww, Optional<zb>> d = c.a(zh::a);

   public static zc<?> a(jv<zc<?>> $$0) {
      jv.a($$0, "blank", yz.b);
      jv.a($$0, "styled", ze.a);
      return jv.a($$0, "fixed", za.a);
   }
}
