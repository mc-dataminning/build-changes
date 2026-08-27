import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fvg extends frl<bwj, fez<bwj>> {
   private static final Map<bim<?>, aer> a = Maps.newHashMap(
      ImmutableMap.of(bim.bq, new aer("textures/entity/horse/horse_zombie.png"), bim.aK, new aer("textures/entity/horse/horse_skeleton.png"))
   );

   public fvg(fso.a $$0, fhl $$1) {
      super($$0, new fez<>($$0.a($$1)), 1.0F);
   }

   public aer a(bwj $$0) {
      return a.get($$0.ag());
   }
}
