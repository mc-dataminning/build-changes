import com.google.common.collect.Maps;
import java.util.Map;

public class gmt extends gne<chg, fug<chg>> {
   private static final Map<chi, alb> a = ac.a(Maps.newEnumMap(chi.class), $$0 -> {
      $$0.put(chi.a, null);
      $$0.put(chi.b, new alb("textures/entity/horse/horse_markings_white.png"));
      $$0.put(chi.c, new alb("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(chi.d, new alb("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(chi.e, new alb("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gmt(gko<chg, fug<chg>> $$0) {
      super($$0);
   }

   public void a(ezt $$0, gdj $$1, int $$2, chg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      alb $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.ch()) {
         ezx $$11 = $$1.getBuffer(gdr.i($$10));
         this.c().a($$0, $$11, $$2, gjt.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
