import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gft extends gbv<cdg, fop<cdg>> {
   private static final Map<bpd<?>, ajh> a = Maps.newHashMap(
      ImmutableMap.of(bpd.bv, new ajh("textures/entity/horse/horse_zombie.png"), bpd.aO, new ajh("textures/entity/horse/horse_skeleton.png"))
   );

   public gft(gdb.a $$0, frd $$1) {
      super($$0, new fop<>($$0.a($$1)), 1.0F);
   }

   public ajh a(cdg $$0) {
      return a.get($$0.ai());
   }
}
