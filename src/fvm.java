import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fvm<T extends byu> extends fuz<T, fhi<T>> {
   private static final Map<bkz<?>, agm> a = Maps.newHashMap(
      ImmutableMap.of(bkz.w, new agm("textures/entity/horse/donkey.png"), bkz.ap, new agm("textures/entity/horse/mule.png"))
   );

   public fvm(fwc.a $$0, float $$1, fkr $$2) {
      super($$0, new fhi<>($$0.a($$2)), $$1);
   }

   public agm a(T $$0) {
      return a.get($$0.ai());
   }
}
