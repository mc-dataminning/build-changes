import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yw {
   public static final MapCodec<yu> a = lh.aq.q().dispatchMap(yu::a, $$0 -> $$0.a().codec());
   public static final Codec<yu> b = a.codec();
   public static final zc<wp, yu> c = za.a(li.at).b(yu::a, yv::b);
   public static final zc<wp, Optional<yu>> d = c.a(za::a);

   public static yv<?> a(jn<yv<?>> $$0) {
      jn.a($$0, "blank", ys.b);
      jn.a($$0, "styled", yx.a);
      return jn.a($$0, "fixed", yt.a);
   }
}
