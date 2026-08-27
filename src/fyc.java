import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fyc extends fuh<byi, fhn<byi>> {
   private static final Map<bkm<?>, agg> a = Maps.newHashMap(
      ImmutableMap.of(bkm.bq, new agg("textures/entity/horse/horse_zombie.png"), bkm.aK, new agg("textures/entity/horse/horse_skeleton.png"))
   );

   public fyc(fvk.a $$0, fjz $$1) {
      super($$0, new fhn<>($$0.a($$1)), 1.0F);
   }

   public agg a(byi $$0) {
      return a.get($$0.ag());
   }
}
