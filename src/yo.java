import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yo {
   public static final MapCodec<ym> a = mf.al.q().dispatchMap(ym::a, yn::a);
   public static final Codec<ym> b = a.codec();
   public static final yu<wh, ym> c = ys.a(mg.X).b(ym::a, yn::b);
   public static final yu<wh, Optional<ym>> d = c.a(ys::a);

   public static yn<?> a(jr<yn<?>> $$0) {
      jr.a($$0, "blank", yk.b);
      jr.a($$0, "styled", yp.a);
      return jr.a($$0, "fixed", yl.a);
   }
}
