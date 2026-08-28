import com.google.common.collect.Maps;
import java.util.Map;

public class goe extends gop<chi, fvp<chi>> {
   private static final Map<chk, akq> a = ad.a(Maps.newEnumMap(chk.class), $$0 -> {
      $$0.put(chk.a, null);
      $$0.put(chk.b, akq.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(chk.c, akq.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(chk.d, akq.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(chk.e, akq.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public goe(glz<chi, fvp<chi>> $$0) {
      super($$0);
   }

   public void a(fbc $$0, get $$1, int $$2, chi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      akq $$10 = a.get($$3.t());
      if ($$10 != null && !$$3.ci()) {
         fbg $$11 = $$1.getBuffer(gfb.i($$10));
         this.c().a($$0, $$11, $$2, gle.c($$3, 0.0F));
      }
   }
}
