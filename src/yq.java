import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yq {
   public static final MapCodec<yo> a = mg.al.q().dispatchMap(yo::a, yp::a);
   public static final Codec<yo> b = a.codec();
   public static final yw<wj, yo> c = yu.a(mh.X).b(yo::a, yp::b);
   public static final yw<wj, Optional<yo>> d = c.a(yu::a);

   public static yp<?> a(js<yp<?>> $$0) {
      js.a($$0, "blank", ym.b);
      js.a($$0, "styled", yr.a);
      return js.a($$0, "fixed", yn.a);
   }
}
