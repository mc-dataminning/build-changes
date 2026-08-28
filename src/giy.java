import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class giy<T extends cgv> extends gii<T, fue<T>> {
   private static final Map<bsn<?>, akk> a = Maps.newHashMap(
      ImmutableMap.of(bsn.z, new akk("textures/entity/horse/donkey.png"), bsn.at, new akk("textures/entity/horse/mule.png"))
   );

   public giy(gjo.a $$0, float $$1, fxo $$2) {
      super($$0, new fue<>($$0.a($$2)), $$1);
   }

   public akk a(T $$0) {
      return a.get($$0.am());
   }
}
