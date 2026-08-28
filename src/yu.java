import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yu {
   public static final MapCodec<ys> a = mh.al.q().dispatchMap(ys::a, yt::a);
   public static final Codec<ys> b = a.codec();
   public static final za<wn, ys> c = yy.a(mi.X).b(ys::a, yt::b);
   public static final za<wn, Optional<ys>> d = c.a(yy::a);

   public static yt<?> a(jt<yt<?>> $$0) {
      jt.a($$0, "blank", yq.b);
      jt.a($$0, "styled", yv.a);
      return jt.a($$0, "fixed", yr.a);
   }
}
