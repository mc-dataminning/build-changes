import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fxx<T extends bzw> extends fxj<T, fjl<T>> {
   private static final Map<blz<?>, ahg> a = Maps.newHashMap(
      ImmutableMap.of(blz.x, new ahg("textures/entity/horse/donkey.png"), blz.aq, new ahg("textures/entity/horse/mule.png"))
   );

   public fxx(fyn.a $$0, float $$1, fmv $$2) {
      super($$0, new fjl<>($$0.a($$2)), $$1);
   }

   public ahg a(T $$0) {
      return a.get($$0.ai());
   }
}
