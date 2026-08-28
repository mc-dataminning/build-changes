import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class zb {
   public static final MapCodec<yz> a = lz.an.q().dispatchMap(yz::a, za::a);
   public static final Codec<yz> b = a.codec();
   public static final zh<wu, yz> c = zf.a(ma.ay).b(yz::a, za::b);
   public static final zh<wu, Optional<yz>> d = c.a(zf::a);

   public static za<?> a(kd<za<?>> $$0) {
      kd.a($$0, "blank", yx.b);
      kd.a($$0, "styled", zc.a);
      return kd.a($$0, "fixed", yy.a);
   }
}
