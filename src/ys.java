import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ys {
   public static final MapCodec<yq> a = mg.al.q().dispatchMap(yq::a, yr::a);
   public static final Codec<yq> b = a.codec();
   public static final yy<wl, yq> c = yw.a(mh.X).b(yq::a, yr::b);
   public static final yy<wl, Optional<yq>> d = c.a(yw::a);

   public static yr<?> a(js<yr<?>> $$0) {
      js.a($$0, "blank", yo.b);
      js.a($$0, "styled", yt.a);
      return js.a($$0, "fixed", yp.a);
   }
}
