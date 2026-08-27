import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gka<T extends cgh> extends gjj<T, fve<T>> {
   private static final Map<bsb<?>, akt> a = Maps.newHashMap(
      ImmutableMap.of(bsb.B, new akt("textures/entity/horse/donkey.png"), bsb.au, new akt("textures/entity/horse/mule.png"))
   );

   public gka(gkq.a $$0, float $$1, fyq $$2) {
      super($$0, new fve<>($$0.a($$2)), $$1);
   }

   public akt a(T $$0) {
      return a.get($$0.ak());
   }
}
