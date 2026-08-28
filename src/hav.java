import com.google.common.collect.Maps;
import java.util.Map;

public class hav extends hbh<hdp, ggw> {
   private static final alg a = alg.b("invisible");
   private static final Map<clp, alg> b = Maps.newEnumMap(
      Map.of(
         clp.a,
         a,
         clp.b,
         alg.b("textures/entity/horse/horse_markings_white.png"),
         clp.c,
         alg.b("textures/entity/horse/horse_markings_whitefield.png"),
         clp.d,
         alg.b("textures/entity/horse/horse_markings_whitedots.png"),
         clp.e,
         alg.b("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public hav(gyq<hdp, ggw> $$0) {
      super($$0);
   }

   public void a(fjy $$0, gqm $$1, int $$2, hdp $$3, float $$4, float $$5) {
      alg $$6 = b.get($$3.h);
      if ($$6 != a && !$$3.z) {
         fkc $$7 = $$1.getBuffer(gqx.j($$6));
         this.d().a($$0, $$7, $$2, gxu.a($$3, 0.0F));
      }
   }
}
