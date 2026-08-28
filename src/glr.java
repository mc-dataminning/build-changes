import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class glr extends ghs<chk, fum<chk>> {
   private static final Map<btb<?>, alf> a = Maps.newHashMap(
      ImmutableMap.of(btb.bv, new alf("textures/entity/horse/horse_zombie.png"), btb.aO, new alf("textures/entity/horse/horse_skeleton.png"))
   );

   public glr(giy.a $$0, fwz $$1) {
      super($$0, new fum<>($$0.a($$1)), 1.0F);
   }

   public alf a(chk $$0) {
      return a.get($$0.ak());
   }
}
