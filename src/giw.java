import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class giw<T extends cgu> extends gig<T, fuc<T>> {
   private static final Map<bsm<?>, akk> a = Maps.newHashMap(
      ImmutableMap.of(bsm.z, new akk("textures/entity/horse/donkey.png"), bsm.at, new akk("textures/entity/horse/mule.png"))
   );

   public giw(gjm.a $$0, float $$1, fxm $$2) {
      super($$0, new fuc<>($$0.a($$2)), $$1);
   }

   public akk a(T $$0) {
      return a.get($$0.al());
   }
}
