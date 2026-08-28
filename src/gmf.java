import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gmf extends gig<cgv, fuz<cgv>> {
   private static final Map<bsm<?>, akk> a = Maps.newHashMap(
      ImmutableMap.of(bsm.bv, new akk("textures/entity/horse/horse_zombie.png"), bsm.aO, new akk("textures/entity/horse/horse_skeleton.png"))
   );

   public gmf(gjm.a $$0, fxm $$1) {
      super($$0, new fuz<>($$0.a($$1)), 1.0F);
   }

   public akk a(cgv $$0) {
      return a.get($$0.al());
   }
}
