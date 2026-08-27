import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gbe extends fxi<bzw, fkh<bzw>> {
   private static final Map<bly<?>, ahg> a = Maps.newHashMap(
      ImmutableMap.of(bly.bs, new ahg("textures/entity/horse/horse_zombie.png"), bly.aL, new ahg("textures/entity/horse/horse_skeleton.png"))
   );

   public gbe(fym.a $$0, fmu $$1) {
      super($$0, new fkh<>($$0.a($$1)), 1.0F);
   }

   public ahg a(bzw $$0) {
      return a.get($$0.ai());
   }
}
