import com.google.common.collect.Maps;
import java.util.Map;

public class gfa extends gfl<ccb, fmt<ccb>> {
   private static final Map<ccd, aiy> a = ac.a(Maps.newEnumMap(ccd.class), $$0 -> {
      $$0.put(ccd.a, null);
      $$0.put(ccd.b, new aiy("textures/entity/horse/horse_markings_white.png"));
      $$0.put(ccd.c, new aiy("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(ccd.d, new aiy("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(ccd.e, new aiy("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gfa(gcv<ccb, fmt<ccb>> $$0) {
      super($$0);
   }

   public void a(esh $$0, fvt $$1, int $$2, ccb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      aiy $$10 = a.get($$3.gg());
      if ($$10 != null && !$$3.ce()) {
         esl $$11 = $$1.getBuffer(fwb.i($$10));
         this.c().a($$0, $$11, $$2, gcb.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
