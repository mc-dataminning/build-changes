import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fvh<T extends byp> extends fuu<T, fhd<T>> {
   private static final Map<bku<?>, agi> a = Maps.newHashMap(
      ImmutableMap.of(bku.w, new agi("textures/entity/horse/donkey.png"), bku.ap, new agi("textures/entity/horse/mule.png"))
   );

   public fvh(fvx.a $$0, float $$1, fkm $$2) {
      super($$0, new fhd<>($$0.a($$2)), $$1);
   }

   public agi a(T $$0) {
      return a.get($$0.ai());
   }
}
