import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class za {
   public static final MapCodec<yy> a = ly.an.q().dispatchMap(yy::a, yz::a);
   public static final Codec<yy> b = a.codec();
   public static final zg<wt, yy> c = ze.a(lz.ay).b(yy::a, yz::b);
   public static final zg<wt, Optional<yy>> d = c.a(ze::a);

   public static yz<?> a(kd<yz<?>> $$0) {
      kd.a($$0, "blank", yw.b);
      kd.a($$0, "styled", zb.a);
      return kd.a($$0, "fixed", yx.a);
   }
}
