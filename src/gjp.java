import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gjp extends gfr<cft, fsm<cft>> {
   private static final Map<brn<?>, akh> a = Maps.newHashMap(
      ImmutableMap.of(brn.bu, new akh("textures/entity/horse/horse_zombie.png"), brn.aN, new akh("textures/entity/horse/horse_skeleton.png"))
   );

   public gjp(ggx.a $$0, fuz $$1) {
      super($$0, new fsm<>($$0.a($$1)), 1.0F);
   }

   public akh a(cft $$0) {
      return a.get($$0.ai());
   }
}
