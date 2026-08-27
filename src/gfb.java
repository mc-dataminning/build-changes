import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gfb<T extends cel> extends gel<T, fqj<T>> {
   private static final Map<bqg<?>, ajv> a = Maps.newHashMap(
      ImmutableMap.of(bqg.z, new ajv("textures/entity/horse/donkey.png"), bqg.as, new ajv("textures/entity/horse/mule.png"))
   );

   public gfb(gfr.a $$0, float $$1, ftt $$2) {
      super($$0, new fqj<>($$0.a($$2)), $$1);
   }

   public ajv a(T $$0) {
      return a.get($$0.ai());
   }
}
