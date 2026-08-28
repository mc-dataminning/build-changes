import com.google.common.collect.Maps;
import java.util.Map;

public class haj extends hav<hdd, ggk> {
   private static final alg a = alg.b("invisible");
   private static final Map<cll, alg> b = Maps.newEnumMap(
      Map.of(
         cll.a,
         a,
         cll.b,
         alg.b("textures/entity/horse/horse_markings_white.png"),
         cll.c,
         alg.b("textures/entity/horse/horse_markings_whitefield.png"),
         cll.d,
         alg.b("textures/entity/horse/horse_markings_whitedots.png"),
         cll.e,
         alg.b("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public haj(gye<hdd, ggk> $$0) {
      super($$0);
   }

   public void a(fjj $$0, gqa $$1, int $$2, hdd $$3, float $$4, float $$5) {
      alg $$6 = b.get($$3.h);
      if ($$6 != a && !$$3.z) {
         fjn $$7 = $$1.getBuffer(gqk.j($$6));
         this.d().a($$0, $$7, $$2, gxi.a($$3, 0.0F));
      }
   }
}
