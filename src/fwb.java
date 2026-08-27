import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class fwb extends fsg<bws, ffq<bws>> {
   private static final Map<biw<?>, aey> a = Maps.newHashMap(
      ImmutableMap.of(biw.bq, new aey("textures/entity/horse/horse_zombie.png"), biw.aK, new aey("textures/entity/horse/horse_skeleton.png"))
   );

   public fwb(ftj.a $$0, fic $$1) {
      super($$0, new ffq<>($$0.a($$1)), 1.0F);
   }

   public aey a(bws $$0) {
      return a.get($$0.ag());
   }
}
