import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class giq<T extends cgr> extends gia<T, ftw<T>> {
   private static final Map<bsj<?>, akk> a = Maps.newHashMap(
      ImmutableMap.of(bsj.z, new akk("textures/entity/horse/donkey.png"), bsj.at, new akk("textures/entity/horse/mule.png"))
   );

   public giq(gjg.a $$0, float $$1, fxg $$2) {
      super($$0, new ftw<>($$0.a($$2)), $$1);
   }

   public akk a(T $$0) {
      return a.get($$0.ak());
   }
}
