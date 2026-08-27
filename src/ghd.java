import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class ghd<T extends cgh> extends ggn<T, fsk<T>> {
   private static final Map<bsa<?>, akm> a = Maps.newHashMap(
      ImmutableMap.of(bsa.z, new akm("textures/entity/horse/donkey.png"), bsa.at, new akm("textures/entity/horse/mule.png"))
   );

   public ghd(ght.a $$0, float $$1, fvu $$2) {
      super($$0, new fsk<>($$0.a($$2)), $$1);
   }

   public akm a(T $$0) {
      return a.get($$0.ak());
   }
}
