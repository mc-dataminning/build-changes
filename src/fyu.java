import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fyu extends fuz<byv, fif<byv>> {
   private static final Map<bkz<?>, agm> a = Maps.newHashMap(
      ImmutableMap.of(bkz.bq, new agm("textures/entity/horse/horse_zombie.png"), bkz.aK, new agm("textures/entity/horse/horse_skeleton.png"))
   );

   public fyu(fwc.a $$0, fkr $$1) {
      super($$0, new fif<>($$0.a($$1)), 1.0F);
   }

   public agm a(byv $$0) {
      return a.get($$0.ai());
   }
}
