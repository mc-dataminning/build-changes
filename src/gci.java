import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gci<T extends cde> extends gbt<T, fnq<T>> {
   private static final Map<bpc<?>, ajh> a = Maps.newHashMap(
      ImmutableMap.of(bpc.z, new ajh("textures/entity/horse/donkey.png"), bpc.as, new ajh("textures/entity/horse/mule.png"))
   );

   public gci(gcy.a $$0, float $$1, frb $$2) {
      super($$0, new fnq<>($$0.a($$2)), $$1);
   }

   public ajh a(T $$0) {
      return a.get($$0.ai());
   }
}
