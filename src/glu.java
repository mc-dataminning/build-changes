import com.google.common.collect.Maps;
import java.util.Map;

public class glu extends gmf<cgk, fth<cgk>> {
   private static final Map<cgm, akm> a = ac.a(Maps.newEnumMap(cgm.class), $$0 -> {
      $$0.put(cgm.a, null);
      $$0.put(cgm.b, new akm("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cgm.c, new akm("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cgm.d, new akm("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cgm.e, new akm("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public glu(gjp<cgk, fth<cgk>> $$0) {
      super($$0);
   }

   public void a(eys $$0, gck $$1, int $$2, cgk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      akm $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.ch()) {
         eyw $$11 = $$1.getBuffer(gcs.i($$10));
         this.c().a($$0, $$11, $$2, giu.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
