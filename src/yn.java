import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yn {
   public static final MapCodec<yl> a = md.an.q().dispatchMap(yl::a, ym::a);
   public static final Codec<yl> b = a.codec();
   public static final yt<wg, yl> c = yr.a(me.ay).b(yl::a, ym::b);
   public static final yt<wg, Optional<yl>> d = c.a(yr::a);

   public static ym<?> a(kf<ym<?>> $$0) {
      kf.a($$0, "blank", yj.b);
      kf.a($$0, "styled", yo.a);
      return kf.a($$0, "fixed", yk.a);
   }
}
