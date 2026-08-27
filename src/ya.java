import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ya {
   public static final MapCodec<xy> a = kt.aq.q().dispatchMap(xy::a, $$0 -> $$0.a().codec());
   public static final Codec<xy> b = a.codec();
   public static final yg<vt, xy> c = ye.a(ku.at).b(xy::a, xz::b);
   public static final yg<vt, Optional<xy>> d = c.a(ye::a);

   public static xz<?> a(ja<xz<?>> $$0) {
      ja.a($$0, "blank", xw.b);
      ja.a($$0, "styled", yb.a);
      return ja.a($$0, "fixed", xx.a);
   }
}
