import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fyk<T extends cad> extends fxv<T, fjx<T>> {
   private static final Map<bmc<?>, ahh> a = Maps.newHashMap(
      ImmutableMap.of(bmc.y, new ahh("textures/entity/horse/donkey.png"), bmc.ar, new ahh("textures/entity/horse/mule.png"))
   );

   public fyk(fza.a $$0, float $$1, fnh $$2) {
      super($$0, new fjx<>($$0.a($$2)), $$1);
   }

   public ahh a(T $$0) {
      return a.get($$0.ai());
   }
}
