import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yy {
   public static final MapCodec<yw> a = mh.al.q().dispatchMap(yw::a, yx::a);
   public static final Codec<yw> b = a.codec();
   public static final ze<wp, yw> c = zc.a(mi.X).b(yw::a, yx::b);
   public static final ze<wp, Optional<yw>> d = c.a(zc::a);

   public static yx<?> a(jt<yx<?>> $$0) {
      jt.a($$0, "blank", yu.b);
      jt.a($$0, "styled", yz.a);
      return jt.a($$0, "fixed", yv.a);
   }
}
