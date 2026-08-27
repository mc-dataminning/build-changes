import com.google.common.collect.Maps;
import java.util.Map;

public class gcn extends gcy<bzz, fki<bzz>> {
   private static final Map<cab, ahg> a = ac.a(Maps.newEnumMap(cab.class), $$0 -> {
      $$0.put(cab.a, null);
      $$0.put(cab.b, new ahg("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cab.c, new ahg("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cab.d, new ahg("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cab.e, new ahg("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gcn(gai<bzz, fki<bzz>> $$0) {
      super($$0);
   }

   public void a(eqb $$0, fth $$1, int $$2, bzz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ahg $$10 = a.get($$3.ge());
      if ($$10 != null && !$$3.ce()) {
         eqf $$11 = $$1.getBuffer(ftp.i($$10));
         this.c().a($$0, $$11, $$2, fzo.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
