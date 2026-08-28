import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yz {
   public static final MapCodec<yx> a = lx.an.q().dispatchMap(yx::a, yy::a);
   public static final Codec<yx> b = a.codec();
   public static final zf<ws, yx> c = zd.a(ly.ay).b(yx::a, yy::b);
   public static final zf<ws, Optional<yx>> d = c.a(zd::a);

   public static yy<?> a(kc<yy<?>> $$0) {
      kc.a($$0, "blank", yv.b);
      kc.a($$0, "styled", za.a);
      return kc.a($$0, "fixed", yw.a);
   }
}
