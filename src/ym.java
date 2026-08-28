import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ym {
   public static final MapCodec<yk> a = lq.ao.r().dispatchMap(yk::a, yl::a);
   public static final Codec<yk> b = a.codec();
   public static final ys<wf, yk> c = yq.a(lr.ax).b(yk::a, yl::b);
   public static final ys<wf, Optional<yk>> d = c.a(yq::a);

   public static yl<?> a(jw<yl<?>> $$0) {
      jw.a($$0, "blank", yi.b);
      jw.a($$0, "styled", yn.a);
      return jw.a($$0, "fixed", yj.a);
   }
}
