import com.google.common.collect.Maps;
import java.util.Map;

public class gkx extends gli<cfv, fsm<cfv>> {
   private static final Map<cfx, akh> a = ac.a(Maps.newEnumMap(cfx.class), $$0 -> {
      $$0.put(cfx.a, null);
      $$0.put(cfx.b, new akh("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cfx.c, new akh("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cfx.d, new akh("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cfx.e, new akh("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gkx(gis<cfv, fsm<cfv>> $$0) {
      super($$0);
   }

   public void a(exx $$0, gbo $$1, int $$2, cfv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      akh $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.cf()) {
         eyb $$11 = $$1.getBuffer(gbw.i($$10));
         this.c().a($$0, $$11, $$2, ghy.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
