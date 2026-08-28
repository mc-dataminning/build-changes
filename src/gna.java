import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gna extends gjb<chi, fvt<chi>> {
   private static final Map<bsx<?>, akr> a = Maps.newHashMap(
      ImmutableMap.of(bsx.bv, akr.b("textures/entity/horse/horse_zombie.png"), bsx.aO, akr.b("textures/entity/horse/horse_skeleton.png"))
   );

   public gna(gkh.a $$0, fyg $$1) {
      super($$0, new fvt<>($$0.a($$1)), 1.0F);
   }

   public akr a(chi $$0) {
      return a.get($$0.am());
   }
}
