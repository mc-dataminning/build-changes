import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class ghd<T extends cgj> extends ggn<T, fsk<T>> {
   private static final Map<bsc<?>, akn> a = Maps.newHashMap(
      ImmutableMap.of(bsc.z, new akn("textures/entity/horse/donkey.png"), bsc.at, new akn("textures/entity/horse/mule.png"))
   );

   public ghd(ght.a $$0, float $$1, fvu $$2) {
      super($$0, new fsk<>($$0.a($$2)), $$1);
   }

   public akn a(T $$0) {
      return a.get($$0.ak());
   }
}
