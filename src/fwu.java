import com.google.common.collect.Maps;
import java.util.Map;

public class fwu extends fxf<bwk, ffe<bwk>> {
   private static final Map<bwm, aer> a = ac.a(Maps.newEnumMap(bwm.class), $$0 -> {
      $$0.put(bwm.a, null);
      $$0.put(bwm.b, new aer("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bwm.c, new aer("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bwm.d, new aer("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bwm.e, new aer("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fwu(fus<bwk, ffe<bwk>> $$0) {
      super($$0);
   }

   public void a(elf $$0, fnu $$1, int $$2, bwk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      aer $$10 = a.get($$3.ga());
      if ($$10 != null && !$$3.cd()) {
         elj $$11 = $$1.getBuffer(foc.i($$10));
         this.c().a($$0, $$11, $$2, fty.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
