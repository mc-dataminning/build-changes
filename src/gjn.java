import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gjn<T extends chf> extends gix<T, fus<T>> {
   private static final Map<bsw<?>, akq> a = Maps.newHashMap(
      ImmutableMap.of(bsw.z, akq.b("textures/entity/horse/donkey.png"), bsw.at, akq.b("textures/entity/horse/mule.png"))
   );

   public gjn(gkd.a $$0, float $$1, fyc $$2) {
      super($$0, new fus<>($$0.a($$2)), $$1);
   }

   public akq a(T $$0) {
      return a.get($$0.am());
   }
}
