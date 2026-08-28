import com.google.common.collect.Maps;
import java.util.Map;

public class gwg extends gws<gyz, gcl> {
   private static final Map<cjf, akv> a = af.a(Maps.newEnumMap(cjf.class), $$0 -> {
      $$0.put(cjf.a, null);
      $$0.put(cjf.b, akv.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cjf.c, akv.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cjf.d, akv.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cjf.e, akv.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gwg(gua<gyz, gcl> $$0) {
      super($$0);
   }

   public void a(fft $$0, glx $$1, int $$2, gyz $$3, float $$4, float $$5) {
      akv $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.z) {
         ffx $$7 = $$1.getBuffer(gmh.j($$6));
         this.d().a($$0, $$7, $$2, gte.a($$3, 0.0F));
      }
   }
}
