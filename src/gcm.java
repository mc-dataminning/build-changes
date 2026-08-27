import com.google.common.collect.Maps;
import java.util.Map;

public class gcm extends gcx<bzy, fkh<bzy>> {
   private static final Map<caa, ahg> a = ac.a(Maps.newEnumMap(caa.class), $$0 -> {
      $$0.put(caa.a, null);
      $$0.put(caa.b, new ahg("textures/entity/horse/horse_markings_white.png"));
      $$0.put(caa.c, new ahg("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(caa.d, new ahg("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(caa.e, new ahg("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gcm(gah<bzy, fkh<bzy>> $$0) {
      super($$0);
   }

   public void a(eqa $$0, ftg $$1, int $$2, bzy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ahg $$10 = a.get($$3.ge());
      if ($$10 != null && !$$3.ce()) {
         eqe $$11 = $$1.getBuffer(fto.i($$10));
         this.c().a($$0, $$11, $$2, fzn.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
