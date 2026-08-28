import com.google.common.collect.Maps;
import java.util.Map;

public class hab extends han<hcv, ggc> {
   private static final alg a = alg.b("invisible");
   private static final Map<clh, alg> b = Maps.newEnumMap(
      Map.of(
         clh.a,
         a,
         clh.b,
         alg.b("textures/entity/horse/horse_markings_white.png"),
         clh.c,
         alg.b("textures/entity/horse/horse_markings_whitefield.png"),
         clh.d,
         alg.b("textures/entity/horse/horse_markings_whitedots.png"),
         clh.e,
         alg.b("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public hab(gxw<hcv, ggc> $$0) {
      super($$0);
   }

   public void a(fjc $$0, gps $$1, int $$2, hcv $$3, float $$4, float $$5) {
      alg $$6 = b.get($$3.h);
      if ($$6 != a && !$$3.z) {
         fjg $$7 = $$1.getBuffer(gqc.j($$6));
         this.d().a($$0, $$7, $$2, gxa.a($$3, 0.0F));
      }
   }
}
