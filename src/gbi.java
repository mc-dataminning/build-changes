import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gbi<T extends ccn> extends gat<T, fms<T>> {
   private static final Map<bol<?>, ajc> a = Maps.newHashMap(
      ImmutableMap.of(bol.y, new ajc("textures/entity/horse/donkey.png"), bol.ar, new ajc("textures/entity/horse/mule.png"))
   );

   public gbi(gby.a $$0, float $$1, fqd $$2) {
      super($$0, new fms<>($$0.a($$2)), $$1);
   }

   public ajc a(T $$0) {
      return a.get($$0.ai());
   }
}
