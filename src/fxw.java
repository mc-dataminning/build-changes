import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fxw<T extends bzv> extends fxi<T, fjk<T>> {
   private static final Map<bly<?>, ahg> a = Maps.newHashMap(
      ImmutableMap.of(bly.x, new ahg("textures/entity/horse/donkey.png"), bly.aq, new ahg("textures/entity/horse/mule.png"))
   );

   public fxw(fym.a $$0, float $$1, fmu $$2) {
      super($$0, new fjk<>($$0.a($$2)), $$1);
   }

   public ahg a(T $$0) {
      return a.get($$0.ai());
   }
}
