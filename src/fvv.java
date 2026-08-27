import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fvv extends fsa<bww, ffj<bww>> {
   private static final Map<bja<?>, aez> a = Maps.newHashMap(
      ImmutableMap.of(bja.bq, new aez("textures/entity/horse/horse_zombie.png"), bja.aK, new aez("textures/entity/horse/horse_skeleton.png"))
   );

   public fvv(ftd.a $$0, fhv $$1) {
      super($$0, new ffj<>($$0.a($$1)), 1.0F);
   }

   public aez a(bww $$0) {
      return a.get($$0.ag());
   }
}
