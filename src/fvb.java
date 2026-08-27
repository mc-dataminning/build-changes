import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fvb extends frg<bwh, fev<bwh>> {
   private static final Map<bik<?>, aep> a = Maps.newHashMap(
      ImmutableMap.of(bik.bq, new aep("textures/entity/horse/horse_zombie.png"), bik.aK, new aep("textures/entity/horse/horse_skeleton.png"))
   );

   public fvb(fsj.a $$0, fhh $$1) {
      super($$0, new fev<>($$0.a($$1)), 1.0F);
   }

   public aep a(bwh $$0) {
      return a.get($$0.ag());
   }
}
