import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class xy {
   public static final MapCodec<xw> a = kr.ar.q().dispatchMap(xw::a, $$0 -> $$0.a().codec());
   public static final Codec<xw> b = a.codec();
   public static final ye<vr, xw> c = yc.a(ks.as).b(xw::a, xx::b);
   public static final ye<vr, Optional<xw>> d = c.a(yc::a);

   public static xx<?> a(iy<xx<?>> $$0) {
      iy.a($$0, "blank", xu.b);
      iy.a($$0, "styled", xz.a);
      return iy.a($$0, "fixed", xv.a);
   }
}
