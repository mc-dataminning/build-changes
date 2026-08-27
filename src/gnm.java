import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gnm extends gjj<cgi, fwb<cgi>> {
   private static final Map<bsb<?>, akt> a = Maps.newHashMap(
      ImmutableMap.of(bsb.bA, new akt("textures/entity/horse/horse_zombie.png"), bsb.aQ, new akt("textures/entity/horse/horse_skeleton.png"))
   );

   public gnm(gkq.a $$0, fyq $$1) {
      super($$0, new fwb<>($$0.a($$1)), 1.0F);
   }

   public akt a(cgi $$0) {
      return a.get($$0.ak());
   }
}
