import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class glo extends ghp<chh, fuj<chh>> {
   private static final Map<bsy<?>, ale> a = Maps.newHashMap(
      ImmutableMap.of(bsy.bv, new ale("textures/entity/horse/horse_zombie.png"), bsy.aO, new ale("textures/entity/horse/horse_skeleton.png"))
   );

   public glo(giv.a $$0, fww $$1) {
      super($$0, new fuj<>($$0.a($$1)), 1.0F);
   }

   public ale a(chh $$0) {
      return a.get($$0.ak());
   }
}
