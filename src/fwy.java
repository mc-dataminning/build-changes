import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fwy<T extends bzg> extends fwk<T, fim<T>> {
   private static final Map<blj<?>, agt> a = Maps.newHashMap(
      ImmutableMap.of(blj.x, new agt("textures/entity/horse/donkey.png"), blj.aq, new agt("textures/entity/horse/mule.png"))
   );

   public fwy(fxo.a $$0, float $$1, flw $$2) {
      super($$0, new fim<>($$0.a($$2)), $$1);
   }

   public agt a(T $$0) {
      return a.get($$0.ai());
   }
}
