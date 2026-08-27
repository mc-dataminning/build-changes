import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fvu extends frz<bwl, ffj<bwl>> {
   private static final Map<bip<?>, aeu> a = Maps.newHashMap(
      ImmutableMap.of(bip.bq, new aeu("textures/entity/horse/horse_zombie.png"), bip.aK, new aeu("textures/entity/horse/horse_skeleton.png"))
   );

   public fvu(ftc.a $$0, fhv $$1) {
      super($$0, new ffj<>($$0.a($$1)), 1.0F);
   }

   public aeu a(bwl $$0) {
      return a.get($$0.ag());
   }
}
