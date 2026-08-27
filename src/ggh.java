import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class ggh<T extends cfs> extends gfr<T, frp<T>> {
   private static final Map<brn<?>, akh> a = Maps.newHashMap(
      ImmutableMap.of(brn.z, new akh("textures/entity/horse/donkey.png"), brn.as, new akh("textures/entity/horse/mule.png"))
   );

   public ggh(ggx.a $$0, float $$1, fuz $$2) {
      super($$0, new frp<>($$0.a($$2)), $$1);
   }

   public akh a(T $$0) {
      return a.get($$0.ai());
   }
}
