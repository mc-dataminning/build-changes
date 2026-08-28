import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yv {
   public static final MapCodec<yt> a = lu.an.q().dispatchMap(yt::a, yu::a);
   public static final Codec<yt> b = a.codec();
   public static final zb<wo, yt> c = yz.a(lv.ay).b(yt::a, yu::b);
   public static final zb<wo, Optional<yt>> d = c.a(yz::a);

   public static yu<?> a(ka<yu<?>> $$0) {
      ka.a($$0, "blank", yr.b);
      ka.a($$0, "styled", yw.a);
      return ka.a($$0, "fixed", ys.a);
   }
}
