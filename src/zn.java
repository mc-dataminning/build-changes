import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class zn {
   public static final MapCodec<zl> a = ma.an.q().dispatchMap(zl::a, zm::a);
   public static final Codec<zl> b = a.codec();
   public static final zt<xg, zl> c = zr.a(mb.ay).b(zl::a, zm::b);
   public static final zt<xg, Optional<zl>> d = c.a(zr::a);

   public static zm<?> a(kd<zm<?>> $$0) {
      kd.a($$0, "blank", zj.b);
      kd.a($$0, "styled", zo.a);
      return kd.a($$0, "fixed", zk.a);
   }
}
