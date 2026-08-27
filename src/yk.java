import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class yk {
   public static final MapCodec<yi> a = lc.aq.q().dispatchMap(yi::a, $$0 -> $$0.a().codec());
   public static final Codec<yi> b = a.codec();
   public static final yq<wd, yi> c = yo.a(ld.at).b(yi::a, yj::b);
   public static final yq<wd, Optional<yi>> d = c.a(yo::a);

   public static yj<?> a(ji<yj<?>> $$0) {
      ji.a($$0, "blank", yg.b);
      ji.a($$0, "styled", yl.a);
      return ji.a($$0, "fixed", yh.a);
   }
}
