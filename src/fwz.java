import com.google.common.collect.Maps;
import java.util.Map;

public class fwz extends fxk<bwn, ffj<bwn>> {
   private static final Map<bwp, aeu> a = ac.a(Maps.newEnumMap(bwp.class), $$0 -> {
      $$0.put(bwp.a, null);
      $$0.put(bwp.b, new aeu("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bwp.c, new aeu("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bwp.d, new aeu("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bwp.e, new aeu("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fwz(fux<bwn, ffj<bwn>> $$0) {
      super($$0);
   }

   public void a(elk $$0, fnz $$1, int $$2, bwn $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      aeu $$10 = a.get($$3.ga());
      if ($$10 != null && !$$3.cd()) {
         elo $$11 = $$1.getBuffer(foh.i($$10));
         this.c().a($$0, $$11, $$2, fud.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
