import com.google.common.collect.Maps;
import java.util.Map;

public class grl extends grw<gua, fxv> {
   private static final Map<cii, alc> a = ad.a(Maps.newEnumMap(cii.class), $$0 -> {
      $$0.put(cii.a, null);
      $$0.put(cii.b, alc.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cii.c, alc.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cii.d, alc.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cii.e, alc.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public grl(gpf<gua, fxv> $$0) {
      super($$0);
   }

   public void a(fde $$0, ghg $$1, int $$2, gua $$3, float $$4, float $$5) {
      alc $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         fdi $$7 = $$1.getBuffer(ghq.i($$6));
         this.d().a($$0, $$7, $$2, gok.a($$3, 0.0F));
      }
   }
}
