import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class gih<T extends chi> extends ghr<T, fto<T>> {
   private static final Map<bta<?>, alf> a = Maps.newHashMap(
      ImmutableMap.of(bta.z, new alf("textures/entity/horse/donkey.png"), bta.at, new alf("textures/entity/horse/mule.png"))
   );

   public gih(gix.a $$0, float $$1, fwy $$2) {
      super($$0, new fto<>($$0.a($$2)), $$1);
   }

   public alf a(T $$0) {
      return a.get($$0.ak());
   }
}
