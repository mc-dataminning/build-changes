import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gij extends gel<cem, frg<cem>> {
   private static final Map<bqg<?>, ajv> a = Maps.newHashMap(
      ImmutableMap.of(bqg.bu, new ajv("textures/entity/horse/horse_zombie.png"), bqg.aN, new ajv("textures/entity/horse/horse_skeleton.png"))
   );

   public gij(gfr.a $$0, ftt $$1) {
      super($$0, new frg<>($$0.a($$1)), 1.0F);
   }

   public ajv a(cem $$0) {
      return a.get($$0.ai());
   }
}
