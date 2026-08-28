import com.google.common.collect.Maps;
import java.util.Map;

public class gzm extends gzy<hcf, gfp> {
   private static final ale a = ale.b("invisible");
   private static final Map<clb, ale> b = Maps.newEnumMap(
      Map.of(
         clb.a,
         a,
         clb.b,
         ale.b("textures/entity/horse/horse_markings_white.png"),
         clb.c,
         ale.b("textures/entity/horse/horse_markings_whitefield.png"),
         clb.d,
         ale.b("textures/entity/horse/horse_markings_whitedots.png"),
         clb.e,
         ale.b("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public gzm(gxh<hcf, gfp> $$0) {
      super($$0);
   }

   public void a(fiq $$0, gpd $$1, int $$2, hcf $$3, float $$4, float $$5) {
      ale $$6 = b.get($$3.h);
      if ($$6 != a && !$$3.z) {
         fiu $$7 = $$1.getBuffer(gpn.j($$6));
         this.d().a($$0, $$7, $$2, gwl.a($$3, 0.0F));
      }
   }
}
