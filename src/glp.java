import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class glp extends ghq<chi, fuk<chi>> {
   private static final Map<bsz<?>, ale> a = Maps.newHashMap(
      ImmutableMap.of(bsz.bv, new ale("textures/entity/horse/horse_zombie.png"), bsz.aO, new ale("textures/entity/horse/horse_skeleton.png"))
   );

   public glp(giw.a $$0, fwx $$1) {
      super($$0, new fuk<>($$0.a($$1)), 1.0F);
   }

   public ale a(chi $$0) {
      return a.get($$0.ak());
   }
}
