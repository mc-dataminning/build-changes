import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yp {
   public static final MapCodec<yn> a = le.aq.q().dispatchMap(yn::a, yo::a);
   public static final Codec<yn> b = a.codec();
   public static final yv<wi, yn> c = yt.a(lf.at).b(yn::a, yo::b);
   public static final yv<wi, Optional<yn>> d = c.a(yt::a);

   public static yo<?> a(jk<yo<?>> $$0) {
      jk.a($$0, "blank", yl.b);
      jk.a($$0, "styled", yq.a);
      return jk.a($$0, "fixed", ym.a);
   }
}
