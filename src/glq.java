import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class glq extends ghr<chj, ful<chj>> {
   private static final Map<bta<?>, alf> a = Maps.newHashMap(
      ImmutableMap.of(bta.bv, new alf("textures/entity/horse/horse_zombie.png"), bta.aO, new alf("textures/entity/horse/horse_skeleton.png"))
   );

   public glq(gix.a $$0, fwy $$1) {
      super($$0, new ful<>($$0.a($$1)), 1.0F);
   }

   public alf a(chj $$0) {
      return a.get($$0.ak());
   }
}
