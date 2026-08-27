import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class ges<T extends cee> extends gec<T, fqa<T>> {
   private static final Map<bqb<?>, ajt> a = Maps.newHashMap(
      ImmutableMap.of(bqb.z, new ajt("textures/entity/horse/donkey.png"), bqb.as, new ajt("textures/entity/horse/mule.png"))
   );

   public ges(gfi.a $$0, float $$1, ftk $$2) {
      super($$0, new fqa<>($$0.a($$2)), $$1);
   }

   public ajt a(T $$0) {
      return a.get($$0.ai());
   }
}
