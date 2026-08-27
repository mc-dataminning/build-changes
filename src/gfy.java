import com.google.common.collect.Maps;
import java.util.Map;

public class gfy extends ggj<ccq, fnp<ccq>> {
   private static final Map<ccs, ajc> a = ac.a(Maps.newEnumMap(ccs.class), $$0 -> {
      $$0.put(ccs.a, null);
      $$0.put(ccs.b, new ajc("textures/entity/horse/horse_markings_white.png"));
      $$0.put(ccs.c, new ajc("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(ccs.d, new ajc("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(ccs.e, new ajc("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gfy(gdt<ccq, fnp<ccq>> $$0) {
      super($$0);
   }

   public void a(etd $$0, fwq $$1, int $$2, ccq $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ajc $$10 = a.get($$3.w());
      if ($$10 != null && !$$3.cb()) {
         eth $$11 = $$1.getBuffer(fwy.i($$10));
         this.c().a($$0, $$11, $$2, gcz.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
