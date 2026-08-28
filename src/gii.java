import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gii<T extends chj> extends ghs<T, ftp<T>> {
   private static final Map<btb<?>, alf> a = Maps.newHashMap(
      ImmutableMap.of(btb.z, new alf("textures/entity/horse/donkey.png"), btb.at, new alf("textures/entity/horse/mule.png"))
   );

   public gii(giy.a $$0, float $$1, fwz $$2) {
      super($$0, new ftp<>($$0.a($$2)), $$1);
   }

   public alf a(T $$0) {
      return a.get($$0.ak());
   }
}
