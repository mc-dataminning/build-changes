import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gjt<T extends chh> extends gjd<T, fuy<T>> {
   private static final Map<bsx<?>, akr> a = Maps.newHashMap(
      ImmutableMap.of(bsx.z, akr.b("textures/entity/horse/donkey.png"), bsx.at, akr.b("textures/entity/horse/mule.png"))
   );

   public gjt(gkj.a $$0, float $$1, fyi $$2) {
      super($$0, new fuy<>($$0.a($$2)), $$1);
   }

   public akr a(T $$0) {
      return a.get($$0.am());
   }
}
