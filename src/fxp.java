import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fxp<T extends bzq> extends fxb<T, fjd<T>> {
   private static final Map<blt<?>, ahd> a = Maps.newHashMap(
      ImmutableMap.of(blt.x, new ahd("textures/entity/horse/donkey.png"), blt.aq, new ahd("textures/entity/horse/mule.png"))
   );

   public fxp(fyf.a $$0, float $$1, fmn $$2) {
      super($$0, new fjd<>($$0.a($$2)), $$1);
   }

   public ahd a(T $$0) {
      return a.get($$0.ai());
   }
}
