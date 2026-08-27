import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gkm extends ggn<cgi, fth<cgi>> {
   private static final Map<bsa<?>, akm> a = Maps.newHashMap(
      ImmutableMap.of(bsa.bv, new akm("textures/entity/horse/horse_zombie.png"), bsa.aO, new akm("textures/entity/horse/horse_skeleton.png"))
   );

   public gkm(ght.a $$0, fvu $$1) {
      super($$0, new fth<>($$0.a($$1)), 1.0F);
   }

   public akm a(cgi $$0) {
      return a.get($$0.ak());
   }
}
