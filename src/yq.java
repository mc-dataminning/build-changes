import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yq {
   public static final MapCodec<yo> a = mf.al.q().dispatchMap(yo::a, yp::a);
   public static final Codec<yo> b = a.codec();
   public static final yw<wj, yo> c = yu.a(mg.X).b(yo::a, yp::b);
   public static final yw<wj, Optional<yo>> d = c.a(yu::a);

   public static yp<?> a(jr<yp<?>> $$0) {
      jr.a($$0, "blank", ym.b);
      jr.a($$0, "styled", yr.a);
      return jr.a($$0, "fixed", yn.a);
   }
}
