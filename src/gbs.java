import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gbs extends fxv<cae, fku<cae>> {
   private static final Map<bmc<?>, ahh> a = Maps.newHashMap(
      ImmutableMap.of(bmc.bt, new ahh("textures/entity/horse/horse_zombie.png"), bmc.aM, new ahh("textures/entity/horse/horse_skeleton.png"))
   );

   public gbs(fza.a $$0, fnh $$1) {
      super($$0, new fku<>($$0.a($$1)), 1.0F);
   }

   public ahh a(cae $$0) {
      return a.get($$0.ai());
   }
}
