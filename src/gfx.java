import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gfx<T extends cew> extends gfh<T, frf<T>> {
   private static final Map<bqr<?>, akf> a = Maps.newHashMap(
      ImmutableMap.of(bqr.z, new akf("textures/entity/horse/donkey.png"), bqr.as, new akf("textures/entity/horse/mule.png"))
   );

   public gfx(ggn.a $$0, float $$1, fup $$2) {
      super($$0, new frf<>($$0.a($$2)), $$1);
   }

   public akf a(T $$0) {
      return a.get($$0.ai());
   }
}
