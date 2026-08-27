import com.google.common.collect.Maps;
import java.util.Map;

public class fwg extends fwr<bwj, fev<bwj>> {
   private static final Map<bwl, aep> a = ac.a(Maps.newEnumMap(bwl.class), $$0 -> {
      $$0.put(bwl.a, null);
      $$0.put(bwl.b, new aep("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bwl.c, new aep("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bwl.d, new aep("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bwl.e, new aep("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fwg(fue<bwj, fev<bwj>> $$0) {
      super($$0);
   }

   public void a(elh $$0, fng $$1, int $$2, bwj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      aep $$10 = a.get($$3.fZ());
      if ($$10 != null && !$$3.cd()) {
         ell $$11 = $$1.getBuffer(fno.h($$10));
         this.c().a($$0, $$11, $$2, ftk.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
