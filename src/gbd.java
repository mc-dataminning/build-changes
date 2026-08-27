import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gbd extends fxh<bzw, fkg<bzw>> {
   private static final Map<bly<?>, ahg> a = Maps.newHashMap(
      ImmutableMap.of(bly.bs, new ahg("textures/entity/horse/horse_zombie.png"), bly.aL, new ahg("textures/entity/horse/horse_skeleton.png"))
   );

   public gbd(fyl.a $$0, fmt $$1) {
      super($$0, new fkg<>($$0.a($$1)), 1.0F);
   }

   public ahg a(bzw $$0) {
      return a.get($$0.ai());
   }
}
