import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fxv<T extends bzv> extends fxh<T, fjj<T>> {
   private static final Map<bly<?>, ahg> a = Maps.newHashMap(
      ImmutableMap.of(bly.x, new ahg("textures/entity/horse/donkey.png"), bly.aq, new ahg("textures/entity/horse/mule.png"))
   );

   public fxv(fyl.a $$0, float $$1, fmt $$2) {
      super($$0, new fjj<>($$0.a($$2)), $$1);
   }

   public ahg a(T $$0) {
      return a.get($$0.ai());
   }
}
