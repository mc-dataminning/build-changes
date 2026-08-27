import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ym {
   public static final MapCodec<yk> a = ld.aq.q().dispatchMap(yk::a, $$0 -> $$0.a().codec());
   public static final Codec<yk> b = a.codec();
   public static final ys<wf, yk> c = yq.a(le.at).b(yk::a, yl::b);
   public static final ys<wf, Optional<yk>> d = c.a(yq::a);

   public static yl<?> a(jj<yl<?>> $$0) {
      jj.a($$0, "blank", yi.b);
      jj.a($$0, "styled", yn.a);
      return jj.a($$0, "fixed", yj.a);
   }
}
