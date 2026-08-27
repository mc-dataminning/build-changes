import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fuu<T extends byh> extends fuh<T, fgq<T>> {
   private static final Map<bkm<?>, agg> a = Maps.newHashMap(
      ImmutableMap.of(bkm.w, new agg("textures/entity/horse/donkey.png"), bkm.ap, new agg("textures/entity/horse/mule.png"))
   );

   public fuu(fvk.a $$0, float $$1, fjz $$2) {
      super($$0, new fgq<>($$0.a($$2)), $$1);
   }

   public agg a(T $$0) {
      return a.get($$0.ag());
   }
}
