import com.google.common.collect.Maps;
import java.util.Map;

public class gmx extends gni<chk, fuk<chk>> {
   private static final Map<chm, ale> a = ac.a(Maps.newEnumMap(chm.class), $$0 -> {
      $$0.put(chm.a, null);
      $$0.put(chm.b, new ale("textures/entity/horse/horse_markings_white.png"));
      $$0.put(chm.c, new ale("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(chm.d, new ale("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(chm.e, new ale("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gmx(gks<chk, fuk<chk>> $$0) {
      super($$0);
   }

   public void a(ezx $$0, gdn $$1, int $$2, chk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ale $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.ch()) {
         fab $$11 = $$1.getBuffer(gdv.i($$10));
         this.c().a($$0, $$11, $$2, gjx.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
