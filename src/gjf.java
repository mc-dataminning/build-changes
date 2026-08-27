import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gjf extends gfh<cex, fsc<cex>> {
   private static final Map<bqr<?>, akf> a = Maps.newHashMap(
      ImmutableMap.of(bqr.bu, new akf("textures/entity/horse/horse_zombie.png"), bqr.aN, new akf("textures/entity/horse/horse_skeleton.png"))
   );

   public gjf(ggn.a $$0, fup $$1) {
      super($$0, new fsc<>($$0.a($$1)), 1.0F);
   }

   public akf a(cex $$0) {
      return a.get($$0.ai());
   }
}
