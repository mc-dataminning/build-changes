import com.google.common.collect.Maps;
import java.util.Map;

public class fxa extends fxl<bwy, ffj<bwy>> {
   private static final Map<bxa, aez> a = ac.a(Maps.newEnumMap(bxa.class), $$0 -> {
      $$0.put(bxa.a, null);
      $$0.put(bxa.b, new aez("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bxa.c, new aez("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bxa.d, new aez("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bxa.e, new aez("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fxa(fuy<bwy, ffj<bwy>> $$0) {
      super($$0);
   }

   public void a(elj $$0, foa $$1, int $$2, bwy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      aez $$10 = a.get($$3.ge());
      if ($$10 != null && !$$3.cd()) {
         eln $$11 = $$1.getBuffer(foi.i($$10));
         this.c().a($$0, $$11, $$2, fue.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
