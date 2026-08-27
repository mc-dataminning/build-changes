import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fvp extends fru<bwi, ffe<bwi>> {
   private static final Map<bim<?>, aer> a = Maps.newHashMap(
      ImmutableMap.of(bim.bq, new aer("textures/entity/horse/horse_zombie.png"), bim.aK, new aer("textures/entity/horse/horse_skeleton.png"))
   );

   public fvp(fsx.a $$0, fhq $$1) {
      super($$0, new ffe<>($$0.a($$1)), 1.0F);
   }

   public aer a(bwi $$0) {
      return a.get($$0.ag());
   }
}
