import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gjr<T extends chh> extends gjb<T, fuw<T>> {
   private static final Map<bsx<?>, akr> a = Maps.newHashMap(
      ImmutableMap.of(bsx.z, akr.b("textures/entity/horse/donkey.png"), bsx.at, akr.b("textures/entity/horse/mule.png"))
   );

   public gjr(gkh.a $$0, float $$1, fyg $$2) {
      super($$0, new fuw<>($$0.a($$2)), $$1);
   }

   public akr a(T $$0) {
      return a.get($$0.am());
   }
}
