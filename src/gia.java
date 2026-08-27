import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gia extends gec<cef, fqx<cef>> {
   private static final Map<bqb<?>, ajt> a = Maps.newHashMap(
      ImmutableMap.of(bqb.bu, new ajt("textures/entity/horse/horse_zombie.png"), bqb.aN, new ajt("textures/entity/horse/horse_skeleton.png"))
   );

   public gia(gfi.a $$0, ftk $$1) {
      super($$0, new fqx<>($$0.a($$1)), 1.0F);
   }

   public ajt a(cef $$0) {
      return a.get($$0.ai());
   }
}
