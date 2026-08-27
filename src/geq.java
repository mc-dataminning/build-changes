import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class geq extends gat<cco, fnp<cco>> {
   private static final Map<bol<?>, ajc> a = Maps.newHashMap(
      ImmutableMap.of(bol.bt, new ajc("textures/entity/horse/horse_zombie.png"), bol.aM, new ajc("textures/entity/horse/horse_skeleton.png"))
   );

   public geq(gby.a $$0, fqd $$1) {
      super($$0, new fnp<>($$0.a($$1)), 1.0F);
   }

   public ajc a(cco $$0) {
      return a.get($$0.ai());
   }
}
