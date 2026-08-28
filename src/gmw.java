import com.google.common.collect.Maps;
import java.util.Map;

public class gmw extends gnh<chj, fuj<chj>> {
   private static final Map<chl, ale> a = ac.a(Maps.newEnumMap(chl.class), $$0 -> {
      $$0.put(chl.a, null);
      $$0.put(chl.b, new ale("textures/entity/horse/horse_markings_white.png"));
      $$0.put(chl.c, new ale("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(chl.d, new ale("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(chl.e, new ale("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gmw(gkr<chj, fuj<chj>> $$0) {
      super($$0);
   }

   public void a(ezw $$0, gdm $$1, int $$2, chj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ale $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.ch()) {
         faa $$11 = $$1.getBuffer(gdu.i($$10));
         this.c().a($$0, $$11, $$2, gjw.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
