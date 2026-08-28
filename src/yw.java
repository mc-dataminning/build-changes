import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yw {
   public static final MapCodec<yu> a = lv.an.q().dispatchMap(yu::a, yv::a);
   public static final Codec<yu> b = a.codec();
   public static final zc<wp, yu> c = za.a(lw.ay).b(yu::a, yv::b);
   public static final zc<wp, Optional<yu>> d = c.a(za::a);

   public static yv<?> a(kb<yv<?>> $$0) {
      kb.a($$0, "blank", ys.b);
      kb.a($$0, "styled", yx.a);
      return kb.a($$0, "fixed", yt.a);
   }
}
