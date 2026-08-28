import com.google.common.collect.Maps;
import java.util.Map;

public class gmy extends gnj<chl, ful<chl>> {
   private static final Map<chn, alf> a = ac.a(Maps.newEnumMap(chn.class), $$0 -> {
      $$0.put(chn.a, null);
      $$0.put(chn.b, new alf("textures/entity/horse/horse_markings_white.png"));
      $$0.put(chn.c, new alf("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(chn.d, new alf("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(chn.e, new alf("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gmy(gkt<chl, ful<chl>> $$0) {
      super($$0);
   }

   public void a(ezy $$0, gdo $$1, int $$2, chl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      alf $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.ch()) {
         fac $$11 = $$1.getBuffer(gdw.i($$10));
         this.c().a($$0, $$11, $$2, gjy.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
