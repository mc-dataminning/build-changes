import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gij<T extends chk> extends ght<T, ftq<T>> {
   private static final Map<btc<?>, alf> a = Maps.newHashMap(
      ImmutableMap.of(btc.z, new alf("textures/entity/horse/donkey.png"), btc.at, new alf("textures/entity/horse/mule.png"))
   );

   public gij(giz.a $$0, float $$1, fxa $$2) {
      super($$0, new ftq<>($$0.a($$2)), $$1);
   }

   public alf a(T $$0) {
      return a.get($$0.ak());
   }
}
