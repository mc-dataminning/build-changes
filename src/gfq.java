import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gfq extends gbt<cdf, fon<cdf>> {
   private static final Map<bpc<?>, ajh> a = Maps.newHashMap(
      ImmutableMap.of(bpc.bu, new ajh("textures/entity/horse/horse_zombie.png"), bpc.aN, new ajh("textures/entity/horse/horse_skeleton.png"))
   );

   public gfq(gcy.a $$0, frb $$1) {
      super($$0, new fon<>($$0.a($$1)), 1.0F);
   }

   public ajh a(cdf $$0) {
      return a.get($$0.ai());
   }
}
