import com.google.common.collect.Maps;
import java.util.Map;

public class gou extends gpi<cgk, fwb<cgk>> {
   private static final Map<cgm, akt> a = ad.a(Maps.newEnumMap(cgm.class), $$0 -> {
      $$0.put(cgm.a, null);
      $$0.put(cgm.b, new akt("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cgm.c, new akt("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cgm.d, new akt("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cgm.e, new akt("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gou(gmp<cgk, fwb<cgk>> $$0) {
      super($$0);
   }

   public void a(fbc $$0, gfg $$1, int $$2, cgk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      akt $$10 = a.get($$3.t());
      if ($$10 != null && !$$3.cm()) {
         fbg $$11 = $$1.getBuffer(gfo.i($$10));
         this.c().a($$0, $$11, $$2, glt.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
